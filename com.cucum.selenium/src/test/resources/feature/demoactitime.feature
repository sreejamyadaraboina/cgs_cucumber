Feature: Demoactitime

  Scenario Outline: verify demoactitime login page
    Given user opened the chrome browser
    When enter the url of Demoactitime
    And user is on loginpage
    When user Enter valid <username> and <Password> in login and password textfields
    And user click on login button
    Then user enter in actitime Homepage

    Examples: 
      | username | Password |
      | admin    | manager  |
