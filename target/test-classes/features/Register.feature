@all
Feature: User Registration

Background:
Given Users navigate to register account page

 @smoke @mandatoryFields @regression
  Scenario: Register with mandatory fields
  
    When User enter below details into the fields
    |firstName      |Clinton|
    |lastName       |Raj|
    |email          |clintonraj1924@gmail.com|
    |phoneNumber    |9876543210|
    |passwod        |catest@123|
    |conformPassword|catest@123|
    And Select Pivacy Policy fields
    And Click on Continue button
    Then Account should be create successfully

  Scenario: Register with all fields
     
    When User enter below details into the fields
    |firstName      |Clinton|
    |lastName       |Raj|
    |email          |clintonraj1924@gmail.com|
    |phoneNumber    |9876543210|
    |passwod        |catest@123|
    |conformPassword|catest@123|    
    And Select yes on NewsLetter fields
    And Select Pivacy Policy fields
    And Click on Continue button
    Then Account should be create successfully

    Scenario: Register  without providing any fields
     
      When User dont enter any fields
      And Click on Continue button
      Then Warning message should dispaly for the mandatory fields



