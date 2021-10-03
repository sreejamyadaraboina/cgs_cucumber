Feature: Actitime Login page


  Scenario Outline: Actitime login with valid details
    Given chrome browser is opened
    And user is in Actitime login page
    When user enters <username> and <password> in login and password feilds
    And user click on loginButton
    Then Home page should be displayed
    
    
    
    Examples:
    |username| password|
    |admin   | manager |

