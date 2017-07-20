$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Individual.feature");
formatter.feature({
  "line": 2,
  "name": "XPLAN prepopulated fields for Individual with Podium",
  "description": "",
  "id": "xplan-prepopulated-fields-for-individual-with-podium",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Individual"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on XPlan home page using browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login to the XPlan application using Valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnXPlanHomePageUsingBrowser()"
});
formatter.result({
  "duration": 4345333607,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.loginToTheXPlanApplicationUsingValidCredentials()"
});
formatter.result({
  "duration": 10036128808,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate the DESCRIPTION of asset Business Assets Asset Type Other which podium has passed to Xplan for an Individual Client",
  "description": "",
  "id": "xplan-prepopulated-fields-for-individual-with-podium;validate-the-description-of-asset-business-assets-asset-type-other-which-podium-has-passed-to-xplan-for-an-individual-client",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Individual_Scenario_One"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Search for client ID Individual for which podium already passed the data",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Select the ID from the search result",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Financial Details tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Balance Sheet",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.searchForClientIDIndividualForWhichPodiumAlreadyPassedTheData()"
});
formatter.result({
  "duration": 3715042539,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.selectTheIDFromTheSearchResult()"
});
formatter.result({
  "duration": 13246814807,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clickOnFinancialDetailsTab()"
});
formatter.result({
  "duration": 2117943324,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clickOnBalanceSheet()"
});
formatter.result({
  "duration": 5233201896,
  "status": "passed"
});
formatter.after({
  "duration": 7857143721,
  "status": "passed"
});
});