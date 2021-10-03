Feature: Create new leadpage

  Scenario Outline: Create Newlead with Valid details
    Given Chrome Browser is opened
    
    
    Then user is on Loginpage
    When user click on Login button
    And User is on Homepage
    Then user click on leadtab
    And user click on newleadbtn
    Then User enters <company> and <Lastname> in login and Password fields
    When user click on savebtn

    Examples: 
      | company | Lastname |
      | wipro   | Baby     |
