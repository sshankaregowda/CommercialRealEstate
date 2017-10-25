@CafeTownSend
Feature: CafeTown Create, Update and Delete customers

  @CafeTownSend_Scenario_One
  Scenario: basic validations
    Given I am on CafeTownSend Login page using browser
    Then  Login to the CafeTownSend application using Valid credentials
    Then  create customers
    Then  edit customers
    Then  delete customers