Feature: New Demo Site Account Creation7

  Scenario: Validate First Name field7
    Given User need to be on Demo Site login page
    When User enters "Sam" in First Name
    Then User checks First Name "Sam" is present
    Then Close the demo site browser

