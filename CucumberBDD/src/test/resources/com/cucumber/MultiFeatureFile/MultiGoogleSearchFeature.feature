Feature: Google Search page validation9

  Scenario: Validate Search String field9
    Given User need to be on Google Search page
    When User enters "Selenium" in Search field
    Then User checks Search string "Selenium" is present
    Then Close the google browser


