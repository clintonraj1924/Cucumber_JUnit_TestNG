@all
Feature: Search functionality
Background:
Given User open the application

@smoke @validSearch @regression
  Scenario: Search for the valid product
    #Given User open the application
    When User enter the valid product on search feilds
    And User click on search button
    Then Valid product should get displayed in search results

@all @smoke @inValidSearch @regression
  Scenario: Search for a non-existing product
    
    When User enter the non valid product on search feilds
    And User click on search button
    Then Proper text informing the user about the product matching should be displayed

  Scenario: Search without providing any products
   
    When User dont enter any product on search feilds
    And User click on search button
    Then Proper text informing the user about the product matching should be displayed