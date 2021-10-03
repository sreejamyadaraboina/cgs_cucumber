Feature: GoogleSearch

  Scenario Outline: verify google search is working
    Given Browser is opened
    And User is on Google Page
    When User enters text in searchfield
    And User clicks on searchButton
    Then Search Results Page should be displayed
