$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/feature3.feature");
formatter.feature({
  "name": "Add Attchment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To add an attachment",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Open The Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.to_Open_The_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Login the WebSite",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.to_Login_the_WebSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find a Patient",
  "keyword": "And "
});
formatter.match({
  "location": "Findapatient.find_a_Patient()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To add an Attchment",
  "keyword": "And "
});
formatter.match({
  "location": "AttachmentSteps.to_add_an_Attchment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete a patient",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteSteps.delete_a_patient()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout",
  "keyword": "And "
});
formatter.match({
  "location": "LogoutSteps.logout()"
});
formatter.result({
  "status": "passed"
});
});