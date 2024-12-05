Feature: Login with credentials functionality

  Scenario: check login functionality with valid credentials
    Given User is on login page
    When user enters username and password credentials
    And click on login button
    Then user navigated to  homepage
