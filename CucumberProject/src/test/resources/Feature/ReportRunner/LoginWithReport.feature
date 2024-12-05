Feature: Login With Report
  
  Scenario: Login with Credentials
   Given User is on login page
   When User enters username and password credentials
   And click on login button
   Then user is navigated to homepage
 