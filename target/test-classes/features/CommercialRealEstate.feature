@CommercialRealEstate
Feature: navigate and verify all the pages have been successfully loaded.

  @CafeTownSend_Scenario_One
  Scenario: Property, Business for Sale, Franchise Page verification
    Given I am on Commericial Real Estate Home page using browser
    Then  Verify Property Page successfully loaded
    Then  Verify BusinessForSale Page successfully loaded
    Then  Verify Franchise Page successfully loaded