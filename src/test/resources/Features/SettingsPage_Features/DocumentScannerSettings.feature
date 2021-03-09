

  Feature: MJCS test cases for Document Scanner Sample settings which belong to the settings page

  @BeforeScenarioForDocumentScan
  Scenario: I should be able to enable Switch Button
    When I scroll to "Scanner Type" on Settings
    Then I check if Switch button is displayed
    When I click switch Button on document Scanner Sample Settings in order to enable it
    Then I should see the switch Button as enabled


  Scenario: I should be able to tap Enable Popup Button
    Given I open the application
    Then I click settings button
    When I scroll to "Scanner Type" on Settings
    Then I check if Enable Popup is displayed
    When I click Enable popup on document Scanner Sample Settings in order to enable it
    Then I should see the Enable Popup Button as enabled


  Scenario: I should be able to tap Info Button
    Given I open the application
    Then I click settings button
    When I scroll to "Scanner Type" on Settings
    Then I check if Info Button is displayed
    When I click Info Button on document Scanner Sample Settings in order to enable it
    Then I should see the Info Button as enabled


  Scenario: I should be able to tap Crop Button
    Given I open the application
    Then I click settings button
    When I scroll to "Scanner Type" on Settings
    Then I check if Crop Button is displayed
    When I click Crop Button on document Scanner Sample Settings in order to enable it
    Then I should see the Crop Button as enabled



