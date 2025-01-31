# SpringBoot-JSP-Tiles Demo App

## Overview
SpringBoot-JSP-Tiles Demo App is a Proof of Concept project that is using Tiles framework with JSP pages view technology and SpringBoot framework.

It is using the last version of SpringBoot framework (2.7.18) that is still supporting Tiles framework.
With version 3.x of Spring Framework Tiles support has been dropped.

This is just a simple Hello World style application that demonstrate Tiles is still working with 2.7.x version of SpringBoot.

## Executing the app

### Executing from IntelliJ

1. Create a Run Configuration and add <project_folder>/springboot-jsp-tiles-demo/ as working directory.
2. Replace `project_folder` with the name of the folder where `PoC-projects` repository has been checked out from GitHub.
3. Run the application
4. Open a web browser and type: http://localhost:8080/tilesdemo/welcome

### Deploying it into a Tomcat web container

**IMPORTANT!** It is not working with Tomcat version 8.x. It needs at least Tomcat version 9.x.
There is a licencing issue/bug when executing it under Tomcat version 8.x.
1. Generate the WAR file using Gradle's WAR task
      1. Either using the Tomcat Web Application Manager and deploy it with its UI using the Deploy form 
      2. Or copy the generated WAR file to TomCat's webapp folder.
         Tomcat is going to explode the WAR file automatically and start the app.
2. Open a web browser and type: http://localhost:8080/tilesdemo/welcome


