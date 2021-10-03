Feature: Create Potential Page

  Scenario Outline: Creating the Potential page
    Given User is on Login Module
    When User is on Home Module
    And User clicks Potential Tab
    Then User Clicks NewPotential Tab
    And user Enters Account name
    Given user enters <potentialsname> with Valid details
    When user clicks on save Button

    Examples: 
      | potentialsname |
      | Sreeja         |
