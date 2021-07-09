Feature: Determine if string is Palindrome or not. A string is palindrome if reads the same backward as forwards.

  Scenario: Valid Palindrome
    Given I entered string "Refer"
    When I test it for Palindrome
    Then the result should be "true"

    Scenario: Invalid Palindrome
      Given I entered string "Coinx"
      When I test it for Palindrome
      Then the result should be "false"