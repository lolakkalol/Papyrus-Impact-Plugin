package com.alexander.thesis.tool;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;

import java.util.List;
import java.util.Locale;

public class View extends ViewPart {
	Model rootModel = null;
	Model variabilityModel = null;
	Class systemContextElement = null;
	public org.eclipse.swt.widgets.List list = null;
	File workspacePath = null;
	String str_project = null;

	public View() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This method creates all control elements in the view for the plugg-in
	 */
	@Override
	public void createPartControl(Composite parent) {

		FillLayout flv = new FillLayout();
		flv.type = SWT.VERTICAL;

		FillLayout flh = new FillLayout();
		flh.type = SWT.HORIZONTAL;

		// The area for user configuration of paths
		Composite userOptions = new Composite(parent, PROP_TITLE);
		userOptions.setLayout(new GridLayout(1, true));

		// A list to show the different projects
		org.eclipse.swt.widgets.List projects = new org.eclipse.swt.widgets.List(userOptions,
				SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		projects.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		GridLayout gll = new GridLayout();
		gll.numColumns = 3;

		// A Container to house the buttons
		Composite optionButtons = new Composite(userOptions, PROP_TITLE);
		optionButtons.setLayout(gll);
		optionButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = false;
		gd.verticalAlignment = SWT.FILL;
		gd.horizontalAlignment = SWT.FILL;

		Button listProjects = new Button(optionButtons, SWT.PUSH);
		listProjects.setLayoutData(gd);
		listProjects.setText("List");
		listProjects.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pathWorkspace = System.getProperty("osgi.instance.area").substring(6);

				if (pathWorkspace == "")
					throw new InternalError("Unable to get workspace to list projects!");

				workspacePath = new File(pathWorkspace);

				projects.removeAll();

				for (String s : workspacePath.list()) {
					if (s.charAt(0) == '.')
						continue;

					projects.add(s);
				}

			}
		});

		Button selectProject = new Button(optionButtons, SWT.PUSH);
		selectProject.setLayoutData(gd);
		selectProject.setText("Select");
		selectProject.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (projects.getSelectionCount() != 1)
					throw new IllegalArgumentException("Multiple or zero projects was selected!");

				str_project = projects.getSelection()[0];
			}
		});

		// Create button to load the Papyrus model as a UML2 model
		Button button = new Button(optionButtons, SWT.PUSH);
		button.setLayoutData(gd);
		button.setText("Load");
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceSet resourceSet = new ResourceSetImpl();
				UMLResourcesUtil.init(resourceSet);
				UMLResource resource = (UMLResource) resourceSet.createResource(URI.createFileURI(
						workspacePath.getAbsolutePath() + "\\" + str_project + "\\" + str_project + ".uml"));

				// Load the UML model into memory
				try {
					resource.load(null);
				} catch (IOException e1) {
					e1.printStackTrace();
					throw new IllegalArgumentException("The project: " + str_project + ".uml file was not found!");
				}

				rootModel = (Model) resource.getContents().get(0);
				System.out.println("Set rootModel to model with name: " + rootModel.getName());

				for (Package pkg : rootModel.getNestedPackages()) {
					if (!(pkg instanceof Model))
						continue;

					if (!Util.isStereotype(pkg, "ImpactProfile::VariabilityModel"))
						continue;

					variabilityModel = (Model) pkg;
					System.out.println("Set variabilityModel to model with name: " + variabilityModel.getName());
					break;
				}

				// Look for top level element to branch from
				for (Element element : variabilityModel.getPackagedElements()) {
					if (!element.getClass().getName().equals("org.eclipse.uml2.uml.internal.impl.ClassImpl"))
						continue;

					if (!(((Class) element).getName()).equalsIgnoreCase("System Context"))
						continue;

					systemContextElement = (Class) element;
					System.out.println("Found System Context!");
				}

				list.add("---- Loaded new model ----");

			}
		});
		
		GridLayout gl = new GridLayout();
		
		Composite outputList = new Composite(parent, PROP_TITLE);
		outputList.setLayout(gl);

		list = new org.eclipse.swt.widgets.List(outputList, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// Clear all list items
		button = new Button(outputList, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false));
		button.setText("Reset list");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				list.removeAll();
			}
		});
		
		Composite userAnalysis = new Composite(parent, PROP_TITLE);
		userAnalysis.setLayout(flh);
		
		// The area for user configuration of paths
		Composite checkButtons = new Composite(userAnalysis, PROP_TITLE);
		checkButtons.setLayout(flv);	
			

		// Check that the constraints are satisfied
		button = new Button(checkButtons, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Check constraints");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (rootModel == null)
					return;

				if (variabilityModel == null)
					return;

				EList<Class> vp = Util.findVariabilityPoints(systemContextElement);
				EList<Class> sc = VariabilityPoint.getAllSelectedChoices(vp);
				EList<Dependency> cs = Choice.getConstraints(sc);

				System.out.println("All selected choices: " + sc);
				System.out.println("All found variability points: " + vp);
				list.add(" --- Failed Constraints --- ");
				Constraint.checkConstraints(cs).forEach(failedConstraint -> {
					Util.addConstraintToList(failedConstraint, list);
				});
				VariabilityPoint.checkVariationPointMutualExclution(vp).forEach(v -> {
					list.add("VP: " + v.getName());
				});
			}
		});
		
		button = new Button(checkButtons, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Check Goals");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				EList<Class> goals = Util.getAllGoals(rootModel);

				list.add(" --- Goals --- ");
				for (Class goal : goals)
					list.add("G: " + goal.getName() + " Sat: " + Goal.satisfied(goal));
			}
		});

		button = new Button(checkButtons, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Check Requirements");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EList<Class> requirements = Util.getAllRequirements(rootModel);
				list.add(" --- Requirements --- ");
				for (Class requirement : requirements) {
					list.add("-- Req: " + requirement.getName() + " --");
					Requirement.verify(requirement).forEach( g -> {
						list.add("G: " + g.getName() + " Sat: false");
					});
				}
			}
		});
		
		// The area for user configuration of paths
		Composite calculateButtons = new Composite(userAnalysis, PROP_TITLE);
		calculateButtons.setLayout(flv);
		
		// Create button to calculate cost of the selected components
		button = new Button(calculateButtons, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Calculate cost of selected");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (rootModel == null)
					return;

				if (variabilityModel == null)
					return;

				EList<Class> vp = Util.findVariabilityPoints(systemContextElement);
				EList<Class> sc = VariabilityPoint.getAllSelectedChoices(vp);
				List<QuantityCost> qcl = Choice.getCosts(sc);
				List<QuantityCost> qc = QuantityCost.getSum(qcl);

				System.out.println(" --- Itemised costs --- ");
				qcl.forEach(item -> {
					System.out.println("Quantity: " + item.quantity + " Cost: " + item.cost);
				});
				;

				list.add(" --- Summed costs --- ");

				// Sort by quantity
				QuantityCost.sort(qc);
				qc.forEach(item -> {
					list.add(String.format(Locale.GERMANY, "Quantity: %d Cost: %f", item.quantity, item.cost));
				});

			}
		});

		// Heat dissipation
		button = new Button(calculateButtons, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Calculate total power");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				EList<Class> vp = Util.findVariabilityPoints(systemContextElement);
				EList<Class> sc = VariabilityPoint.getAllSelectedChoices(vp);
				list.add("---- Power Calculation ----");
				list.add("Total power summation: " + Choice.getTotalPower(sc));
				list.add("Total power consumption: " + Choice.getTotalPowerConsumption(sc));
				list.add("Total power dissipation: " + Choice.getTotalHeatDissipationCapability(sc));
			}
		});

		// Create export to CSV button
		button = new Button(calculateButtons, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Export to CSV");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EList<Class> vp = Util.findVariabilityPoints(systemContextElement);
				EList<Class> goals =  Util.getAllGoals(variabilityModel);
				EList<Class> requirements = Util.getAllRequirements(rootModel);

				CSVWriter writer = null;

				try {
					writer = new CSVWriter(workspacePath.getAbsolutePath() + "\\" + str_project + "\\output.csv");
					writer.print("-- Choices made --\r\n");
					writer.writeSelectedToCSV(vp);
					writer.printNewLine();
					writer.print("-- Requirements --\r\n");
					writer.printRequirements(requirements);
					writer.printNewLine();
					writer.print("-- Goals --\r\n");
					writer.printGoals(goals);
					writer.printNewLine();
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				try {
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
