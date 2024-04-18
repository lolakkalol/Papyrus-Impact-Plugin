<!-- Improved compatibility of back to top link: See: https://github.com/lolakkalol/6502-computer-project/pull/73 -->
<a name="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
<!--[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]-->



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/lolakkalol/Papyrus-Impact-Plugin">
    <img src="icons/plugin-icon.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">A Papyrus impact and variability plugin</h3>

  <p align="center">
    A meta-model and tool for impact analysis of SysML models!
    <br />
    <a href="https://github.com/lolakkalol/Papyrus-Impact-Plugin"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/lolakkalol/Papyrus-Impact-Plugin/tree/main/examples">View Example Projects</a>
    ·
    <a href="https://github.com/lolakkalol/Papyrus-Impact-Plugin/issues">Report Bug</a>
    ·
    <a href="https://github.com/lolakkalol/Papyrus-Impact-Plugin/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)
This plugin implements a UML2 meta-model to create variable product composition diagrams using the SysML block definition diagrams.
The plugin also implements a new view called the "Impact tool," which uses the information provided by the meta-model to check constraints, goals, requirements, and more.
To use the impact tool, one must follow the rules to ensure that the assumption it makes still holds. While this is made with the use of papyrus in mind, it should work with any model created using UML2, as the plugin only relies on UML2 APIs but has not been tested.

For more information on how the meta-model, tool, and method can be used to perform impact analysis, see: [Link to thesis (Not uploaded yet)](http://example.com/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Installation and building
This plugin was built using the downloadable [Eclipse Papyrus RCP 2023-12 release (6.6.0)](https://eclipse.dev/papyrus/download.html).

#### Build from repository
To build the plugin JAR follow these steps:
1. Clone the repository
2. Import repository into workspace
   - In Eclipse, select `File -> Import`
   - Select `Existing Projects into Workspace` and press `Next`
   - Select the repository folder as the root directory and press `Finish`
   - The repository should now be in your workspace
3. Export project as JAR
   - Right click the imported project in the project explorer
   - Click `Export`
   - Under `Plug-in Development` select `Deployable plug-ins and fragments` and press `Next`
   - Leave default selection, choose the destination directory, and press `Finish`. The destination can be the plugin folder of the Eclipse application where you want to install it.
4. Finished! The JAR file should now be located at the specified destination directory

#### Install from compiled JAR
To install the plugin in your Eclipse installation, simply copy the JAR file to your Eclipse's plugins folder and restart.
Make sure that Ecore, UML2, and Papyrus APIs are installed.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started
This repository can be used in two ways, either as is to model a product variability composition and performing impact analysis using the built in tool, or used as an API to interact with the models.

To get started on modelling, see the `Usage` and `Installation and building` sections.

The repository is structured as follows:
`icons` contains the icons used by the plugin.
`model` contains both the meta-model profile (`com.alexander.thesis.profile.uml`) and its genmodel and ecore model. Both the genmodel and ecore model are created from the profile.
`src/ImpactProfile` contains the code generated by the genmodel.
`src/com/alexander/thesis/tool` contains the impact API's source code and the impact view's implementation. All methods documented.

### Modify the meta-model/profile
The `model/com.alexander.thesis.profile.di` file contains the papyrus model used to edit the meta-model. To modify the meta-model, open the papyrus model and use the diagram editor provided by papyrus to make the required changes. 
As the profile is included as a static UML2 profile multiple plugin extensions need to be defined, these are already made and does not need to be updated but for the sake of documentation are mentioned here:

- `org.eclipse.emf.ecore.generated_package`
- `org.eclipse.uml2.uml.generated_package`
- `org.eclipse.papyrus.uml.extensionpoints.UMLProfile` (Is only needed for papyrus to find the profile)

To update the profile in the plugin follow these steps:
<details>
  <summary>Update details</summary>
1. Save the profile.
2. Open `model/com.alexander.thesis.profile.genmodel` (with EMF Generator).

![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/56dd16db-69fc-4bd0-b348-bc6f2db5425f)

3. Right click the top level item `Com.alexander.thesis` in the opened editor and press `Reload...`.
 
![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/6bc67dc3-c2be-4122-b5f1-6b14ec57b3c2)

4. Select `UML model` in the pop-up window and press `Next`.

![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/ee68b6ae-01ce-42a9-afdd-345a03de4d6c)

5. You can safely ignore the warning and just press `OK`.
 
![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/593fcebc-cde5-4421-93b6-848674b87ed4)

6. Leave the default options, model URI, and press `Next`. (Make sure that the model URI is pointing to the profile model `model/com.alexander.thesis.profile.uml`).

![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/10b14339-3deb-41f4-9dfa-bd19c63b2ad7)

7. Leave default again and press `Finish`

![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/8916dd1e-d02b-44bf-9412-f087f4f1e1a8)

8. Now we need to re-generate the code, if you encounter problems here try and delete all `src/ImpactProfile*` files, these are the autogenerated files we will create now.

![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/e7273e1b-abbc-4234-a330-a8d2dc9b3d42)

9. While still in the genmodel editor opened in step 2, right click the top level item and press `Generate Model Code`.

![image](https://github.com/lolakkalol/Papyrus-Impact-Plugin/assets/23548892/009356b9-42ca-4d76-b5a8-f15d95beddd2)

10. The plugin should now be updated to include the updated profile.
</details>

### Modify the impact API
If you so wish to change or add to the impact API simply edit the files under `src/com/alexander/thesis/tool` and reexport the JAR file to create a standalone plugin, or create a launch configuration to launch a new instance of eclipse with the plugin.

### Modify the impact view
As the view is simply composed of SWT components which call the impact APIs simply change `src/com/alexander/thesis/tool/View.java` and reexport the JAR file to create a standalone plugin, or create a launch configuration to launch a new instance of eclipse with the plugin.

See [Link to thesis](http://example.com/) to understand how to use the plugin.

<!-- USAGE EXAMPLES -->
## Usage
This section will introduce the basic concepts of the tool and language, for more indepth understanding of the tool and language read the thesis.

### Modelling
TBW

### Using impact tool
TBW

See [Link to thesis](http://example.com/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Alexander Stenlund -  alexander.stenlund@telia.com

Project Link: [https://github.com/lolakkalol/Papyrus-Impact-Plugin](https://github.com/lolakkalol/Papyrus-Impact-Plugin)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

How to add a UML2 profile to a plugin as a static profile:
[http://nyssen.blogspot.com/2009/09/defining-static-profiles-with-eclipse.html](http://nyssen.blogspot.com/2009/09/defining-static-profiles-with-eclipse.html)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/lolakkalol/Papyrus-Impact-Plugin.svg?style=for-the-badge
[contributors-url]: https://github.com/lolakkalol/Papyrus-Impact-Plugin/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/lolakkalol/Papyrus-Impact-Plugin.svg?style=for-the-badge
[forks-url]: https://github.com/lolakkalol/Papyrus-Impact-Plugin/network/members
[stars-shield]: https://img.shields.io/github/stars/lolakkalol/Papyrus-Impact-Plugin.svg?style=for-the-badge
[stars-url]: https://github.com/lolakkalol/6502-computer-project/stargazers
[issues-shield]: https://img.shields.io/github/issues/lolakkalol/Papyrus-Impact-Plugin.svg?style=for-the-badge
[issues-url]: https://github.com/lolakkalol/Papyrus-Impact-Plugin/issues
[license-shield]: https://img.shields.io/github/license/lolakkalol/Papyrus-Impact-Plugin.svg?style=for-the-badge
[license-url]: https://github.com/lolakkalol/Papyrus-Impact-Plugin/blob/master/LICENSE.txt
<!--[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/ -->
[product-screenshot]: images/screenshot.png
