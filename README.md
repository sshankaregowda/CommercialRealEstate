# CafeTown
Getting Started - quick user guide.
  1.  Clone the code - 
  2.  Execute the mvn command to run
  3.  I have built and tested on MAC os, however I have exevuted the code to execute in Windows Platform (unfortunately, I dont have Windows machine to try at home)
 
 Test overview -
 In this project I have done 3 test cases after the user login, please see the logic I have used to write the scenarios.
 1. Create a user
 2. Edit a user
 3. Delete a user
 
Framework Overview -
1. Framework
  This module contains reusable user actions built using Selenium Java.
2. Page Objects
  This module contains all the functions specific to the application. This module contains different java clases which is specific to number of webpages in the application.
3. Runner
  This module contains runner class to execute the test cases.
4. Feature File
  This module contains test cases defined using BDD Cucumber Gherkin Language
5. Resource
  This module contins inputdatasheet and testng.xml which allows to do execute the test cases in batch as well as parallel execution.
  pom.xml contains all the dependecies and testng contains test suits
   
