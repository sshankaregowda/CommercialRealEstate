$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CommercialRealEstate.feature");
formatter.feature({
  "line": 2,
  "name": "Click on CommercialRealEstate tabs and verify all the pages have been successfully loaded.",
  "description": "",
  "id": "click-on-commercialrealestate-tabs-and-verify-all-the-pages-have-been-successfully-loaded.",
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
  "id": "click-on-commercialrealestate-tabs-and-verify-all-the-pages-have-been-successfully-loaded.;property,-business-for-sale,-franchise-page-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@CommercialRealEstate_Scenario_One"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Commercial Real Estate Home page",
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
formatter.step({
  "line": 10,
  "name": "Verify News Page successfully loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnCommercialRealEstateHomePage()"
});
formatter.result({
  "duration": 10331753229,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyPropertyPageSuccessfullyLoaded()"
});
formatter.result({
  "duration": 5103650533,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyBusinessForSalePageSuccessfullyLoaded()"
});
formatter.result({
  "duration": 3654898846,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyFranchisePageSuccessfullyLoaded()"
});
formatter.result({
  "duration": 2281577220,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyNewsPageSuccessfullyLoaded()"
});
formatter.result({
  "duration": 11883599769,
  "status": "passed"
});
formatter.after({
  "duration": 5151053647,
  "status": "passed"
});
});