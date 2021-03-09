




  Feature: MJCS test cases for the Domain settings which belong to the settings page

  Scenario: : I should be able to arrange  Domain Settings
    Given I clean appium server
    When I open the application
    And I click settings button
    Then I enter the following Baselink "https://elbtesting.idscan.cloud"
    And I enter the following username "superadministrator" and Password "Password1!"


  Scenario: : I should be able to enter base link
    When I open the application
    And I click settings button
    Then I enter the following Baselink "https://elbtesting.idscan.cloud"


  Scenario: : I should be able to enter "password"
    When I open the application
    And I click settings button
    Then I put password "Password1!"


  Scenario: : I should be able to enter "username"
    When I open the application
    And I click settings button
    Then I put username "superadministrator"



  Scenario: : I should be able to cancel the edit credential view
    When I open the application
    And I click settings button
    And I open edit credential view
    Then I click cancel button in edit credential view


