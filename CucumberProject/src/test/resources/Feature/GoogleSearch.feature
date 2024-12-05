
Feature: Feature file to test google search functionality

  Scenario: Validate google search
  
    Given open google browser
    And user is on google search page
    When user enters text in google search
    And user hits enter
    Then user navigated to search results
    
    
    
