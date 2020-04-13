Feature: Amazon App Functionality Test
  As a Amazon user 
  I want to login into Amazon Android Mobile App

  Scenario: Amazon App Login
    Given User is in Home Screen
    When user click on Already a customer link
    Then user navigate to Welcome screen
    When user enter email address
    And click continue button
    Then user navigate to Sign In page
    When user enter password
    And click Sign-In button
    Then user navigate to search screen
