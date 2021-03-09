



  Feature: MJCS test cases for the Liveness Page

  Scenario: I should be able to click "Start Liveness Test" button
    Given I clean appium server
    When I open the application
    Then I check if liveness button is displayed
    And I click Liveness Fragment Sample button
    When I check if Start liveness test button is displayed
    Then I click start liveness test button


  Scenario: I should be able to click "Liveness Settings" button
    When I open the application
    Then I check if liveness button is displayed
    And I click Liveness Fragment Sample button
    When I check if Start liveness settings button is displayed
    Then I click liveness settings button
