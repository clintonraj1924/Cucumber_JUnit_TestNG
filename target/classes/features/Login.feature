@all
Feature: User Login
  Registered user should be able to login to access details
  
 Background:
 Given User navigate to login page

@login @smoke @validCredentias @regression
  Scenario: Login with valid credentials
    
    When User enter valid email address "clintonraj1924@gmail.com"
    And Enter valid password "catest@123"
    And Click the login button
    Then User should login successfully

@login @smoke @inValidCredentias @rwgression
  Scenario Outline: Login with invalid credentials
    
    When User enter invalid email address "<userName>"
    And Enter invalid password "<passWord>"
    And Click the login button
    Then User should get a proper warning message
    Examples:
      | userName                | passWord  |
      |clintonraj19244@gmail.com|catest@1234|
      |clintonraj14@gmail.com   |catest@1234|
      |clintonr19244@gmail.com  |catest1234 |

  Scenario: Login with valid password and invalid username
    
    When User enter invalid email address "clintonraj19244@gmail.com"
    And Enter valid password "catest@123"
    And Click the login button
    Then User should get a proper warning message

  Scenario: Login with invalid password and valid username
    
    When User enter valid email address "clintonraj1924@gmail.com"
    And Enter invalid password "catest@1234"
    And Click the login button
    Then User should get a proper warning message




