@CommercialRealEstate
Feature: Click on CommercialRealEstate tabs and verify all the pages have been successfully loaded.

  @CommercialRealEstate_Scenario_One
  Scenario: Property, Business for Sale, Franchise Page verification
    Given I am on Commercial Real Estate Home page
    Then  Verify Property Page successfully loaded
    Then  Verify BusinessForSale Page successfully loaded
    Then  Verify Franchise Page successfully loaded
    Then  Verify News Page successfully loaded