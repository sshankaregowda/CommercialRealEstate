$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cafeTownsend.feature");
formatter.feature({
  "line": 2,
  "name": "CafeTown Create, Update and Delete customers",
  "description": "",
  "id": "cafetown-create,-update-and-delete-customers",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CafeTownSend"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "basic validations",
  "description": "",
  "id": "cafetown-create,-update-and-delete-customers;basic-validations",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@CafeTownSend_Scenario_One"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on CafeTownSend Login page using browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login to the CafeTownSend application using Valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "create customers",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "edit customers",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "delete customers",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnCafeTownSendLoginPageUsingBrowser()"
});
formatter.result({
  "duration": 5937779054,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.loginToTheCafeTownSendApplicationUsingValidCredentials()"
});
formatter.result({
  "duration": 6919624724,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.createCustomers()"
});
formatter.result({
  "duration": 13717783813,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.editCustomers()"
});
formatter.result({
  "duration": 13942132589,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.deleteCustomers()"
});
formatter.result({
  "duration": 6373090712,
  "status": "passed"
});
formatter.after({
  "duration": 5247730138,
  "status": "passed"
});
});