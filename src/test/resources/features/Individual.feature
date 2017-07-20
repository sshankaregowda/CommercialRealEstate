@Individual
Feature: XPLAN prepopulated fields for Individual with Podium

  Background:
    Given I am on XPlan home page using browser
    Then  Login to the XPlan application using Valid credentials

  @Individual_Scenario_One
  Scenario: Validate the DESCRIPTION of asset Business Assets Asset Type Other which podium has passed to Xplan for an Individual Client
    And Search for client ID Individual for which podium already passed the data
    And Select the ID from the search result
    And Click on Financial Details tab
    And Click on Balance Sheet