# Amira-Elsayed
1.Explanation about Automation framework: I decided to divide classes to test classes, page classes (POM) and data classes to be used in data driven to make the framework editable and more readable 
Test package contains LoginFacebook ,RegisterFacebook classes and Testbase class which responsible of the drivers settings 
Pages package contains page classes to locate the element to be uses in test classes 
2 classes under data package one to read the excel file of login data and the other for registration data  
2 excel files UserData.xslx contains test data for registration ,UserDataLogin.xslx contains login test data

Kindly download and import the project with all folders and classes  and make sure to update the pom.xml file to download all dependences
Run the project using testng.xml  

Explanation why I provide this solution for API Automation: I decided to make a CI/CD test plan to be run at every push the test plan contains 4 suites (Products, Stores, Categories, services) each suite contains number of test cases according to CRUD to check that each end point working correctly after every push
Kindly import CI-CD pipeline for api'-play ground( test to be run at every pus-.postman_collection.json to your postman and follow the same steps to run api'-play ground local host in the background to be able to run the test cases
Add environment variable "http://localhost:3030" as URL
