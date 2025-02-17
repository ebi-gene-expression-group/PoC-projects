# Converted SpringBoot-JSP-Tiles to plan HTML and JS Demo App

## Overview
This demo app is a Proof of Concept project that is still using Tiles framework with JSP pages view technology and SpringBoot framework, but also have simple HTML pages.

It is using the last version of SpringBoot framework (2.7.18) that is still supporting Tiles framework.
With version 3.x of Spring Framework Tiles support has been dropped.

This is just a simple Hello World style application that demonstrate using Tiles viewing technology and JSP 
together with simple HTML.

## Executing the app

### Executing from IntelliJ

1. Create a Run Configuration and add <project_folder>/converted-springboot-jsp-tiles-demo-to-plain-html-js/ as working directory.
2. Replace `project_folder` with the name of the folder where `PoC-projects` repository has been checked out from GitHub.
3. Run the application
4. Open a web browser and type: http://localhost:8080/convertedtilesdemo/

### Deploying it into a Tomcat web container

**IMPORTANT!** It is not working with Tomcat version 8.x. It needs at least Tomcat version 9.x.
There is a licencing issue/bug when executing it under Tomcat version 8.x.
1. Generate the WAR file using Gradle's WAR task
      1. Either using the Tomcat Web Application Manager and deploy it with its UI using the Deploy form 
      2. Or copy the generated WAR file to TomCat's webapp folder.
         Tomcat is going to explode the WAR file automatically and start the app.
2. Open a web browser and type: http://localhost:8080/convertedtilesdemo/


