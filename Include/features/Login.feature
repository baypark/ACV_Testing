Feature: Login manual feature

  Scenario: Test login anual with valid credential
    Given user navigate to login page
    When user input email and password
    And click on login button
    Then user navigated to homepage
