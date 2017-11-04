$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CommercialRealEstate.feature");
formatter.feature({
  "line": 2,
  "name": "navigate and verify all the pages have been successfully loaded.",
  "description": "",
  "id": "navigate-and-verify-all-the-pages-have-been-successfully-loaded.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CommercialRealEstate"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Property, Business for Sale, Franchise Page verification",
  "description": "",
  "id": "navigate-and-verify-all-the-pages-have-been-successfully-loaded.;property,-business-for-sale,-franchise-page-verification",
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
  "name": "I am on Commericial Real Estate Home page using browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verify Property Page successfully loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify BusinessForSale Page successfully loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Franchise Page successfully loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnCommericialRealEstateHomePageUsingBrowser()"
});
formatter.result({
  "duration": 7134548726,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyPropertyPageSuccessfullyLoaded()"
});
formatter.result({
  "duration": 6215752207,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyBusinessForSalePageSuccessfullyLoaded()"
});
formatter.result({
  "duration": 6120054221,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyFranchisePageSuccessfullyLoaded()"
});
formatter.result({
  "duration": 4631020296,
  "status": "passed"
});
formatter.after({
  "duration": 5311105921,
  "status": "passed"
});
});