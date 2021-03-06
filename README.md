Command-line Build Instructions
-------------------------------
The build is maven-based, assisted by a set of Eclipse build plugins called [Tycho](http://tycho.sonatype.org/).
The maven plugin repository for Tycho and all it's particulars are configured in the parent pom.xml file in this directory.

Build requires:
 * Maven 3
 * Java 7

The distributable ZIP files and update site are all created in one maven command:
* mvn install

Developer Eclipse IDE Setup
---------------------------

1. Install Eclipse IDE and required plugins:
 * Eclipse Modelling Project feature or choose this product download (this includes RCP/PDE bundles)
 * m2eclipse plugin and connectors, see Maven > Discovery in preferences
  * Tycho Configurator m2eclipse connector
  * m2e-egit Maven SCM Handler for EGit 
1. Import Maven Projects from SCM
1. Select git and this project URL.
1. Open the target-definition file. (As on this writing, parent/target-definition/indigo_3_8.target)
1. Click on "Set as Target Platform" in the upper right.

The latest release of this project is available as a P2 update site:

http://www2.lib.unc.edu/software/workbench/p2/metadata-model-tools/
