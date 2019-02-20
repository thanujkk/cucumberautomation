Feature: New Account Creation2

  Scenario Outline: Validate create user multiple fields2
    Given User need to be on login page
    When User enters "<firstname>" First Name
    And User enters "<lastname>" Last Name
    Then User checks user First Name "<firstname>" is present
    And User checks user Last Name "<lastname>" is present
    But User mobile field should be blank
    Then Close the browser

    Examples: 
      | firstname | lastname |
      | Tom       | Jerry    |
      | Jhon      | Mark     |
