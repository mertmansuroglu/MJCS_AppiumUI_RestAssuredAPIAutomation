
Feature: MJCS test cases for the Journey Screen Injection settings which belong to the settings page

  @ScenarioForCustomerJourney
  Scenario: I should able to enable "Enable Front Side" button
    Given I clean appium server
    When I open the application
    And I click settings button
    When I scroll to "Enable Front Side" on Settings
    Then I check if Enable Front Side Button is displayed
    When I click Enable Front Side button on document Scanner Sample Settings
    Then I should see the Enable Front Side button as enabled

  Scenario: I should be able to see Frontside screen injection during the customer journey
    Given I configure triplescan from admin settings as "false"
    And I enable only front configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Front Side" on Settings
    And  I click "Enable" Frontside Button on document Scanner Sample Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see that Frontside screen injection appears


  Scenario: I should be able to tap finish button on screen injection
    Given I configure triplescan from admin settings as "false"
    And I enable only front configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Front Side" on Settings
    And  I click "Enable" Frontside Button on document Scanner Sample Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see that Frontside screen injection appears
    And I should see that Finish button appears on the screen injection

  Scenario: I should be able to proceed to next step which is front capture screen after screen injection
    Given I configure triplescan from admin settings as "false"
    And I enable only front configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Front Side" on Settings
    And  I click "Enable" Frontside Button on document Scanner Sample Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see that Frontside screen injection appears
    When I tap to finish button on the screen injection
    Then I should see the capture screen of Customer Journey

  Scenario: I should able to enable "Enable Back Side" button
    Given I clean appium server
    When I open the application
    And I click settings button
    When I scroll to "Enable Back Side" on Settings
    Then I check if Enable Back Side Button is displayed
    When I click Enable Back Side button on document Scanner Sample Settings
    Then I should see the Enable Back Side button as enabled


  Scenario: I should able to enable "Enable Liveness" button
    Given I clean appium server
    When I open the application
    And I click settings button
    When I scroll to "Enable Liveness" on Settings
    Then I check if Enable LivenessButton is displayed
    When I click Enable Liveness button on document Scanner Sample Settings
    Then I should see the Enable Liveness button as enabled

  Scenario: I should be able to see Liveness screen injection during the customer journey
    Given I configure triplescan from admin settings as "false"
    And I enable only Liveness configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Front Side" on Settings
    And  I click "Enable" Liveness Button on document Scanner Sample Settings
    And I click "Disable" Frontside Button on document Scanner Sample Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen
    When I click finish editing button on edit screen
    Then I should see that Liveness screen injection appears


  Scenario: I should able to enable Address Document button
    Given I clean appium server
    When I open the application
    And I click settings button
    When I scroll to "Enable Address Document" on Settings
    Then I check if Enable Address Document Button is displayed
    And I click "Enable"  Address Document Button on document Scanner Sample Settings
    Then I should see the Enable Address Document Button as enabled

  Scenario: I should be able to see Address screen injection during the customer journey
    Given I configure triplescan from admin settings as "false"
    And I enable only A4 configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Front Side" on Settings
    And  I click "Enable"  Address Document Button on document Scanner Sample Settings
    And I click "Disable" Frontside Button on document Scanner Sample Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen
    When I click finish editing button on edit screen
    Then I should see that Address screen injection appears

  Scenario: I should able to enable "Enable Selfie" button
    Given I clean appium server
    When I open the application
    And I click settings button
    When I scroll to "Enable Selfie" on Settings
    Then I check if Enable Selfie Button is displayed
    When I click Enable Selfie Button on document Scanner Sample Settings
    Then I should see the Enable Selfie Button as enabled

  Scenario: I should be able to see Selfie screen injection during the customer journey
    Given I configure triplescan from admin settings as "false"
    And I enable only selfie configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Front Side" on Settings
    And  I click "Enable" Selfie Button on document Scanner Sample Settings
    And I click "Disable" Frontside Button on document Scanner Sample Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen
    When I click finish editing button on edit screen
    Then I should see that Selfie screen injection appears



  Scenario: I should able to enable "Enable Loading" button
    Given I clean appium server
    When I open the application
    And I click settings button
    When I scroll to "Enable Loading" on Settings
    Then I check if Enable Loading Button is displayed
    When I click Enable Loading Button on document Scanner Sample Settings
    Then I should see the Enable Loading Button as enabled


  Scenario: I should be able to see Loading screen injection during the customer journey
    Given I configure triplescan from admin settings as "false"
    And I enable only front configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Front Side" on Settings
    And I click "Disable" Frontside Button on document Scanner Sample Settings
    And I click "Enable" Loading Button on document Scanner Sample Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen
    When I click finish editing button on edit screen
    Then I should see that Loading screen injection appears
