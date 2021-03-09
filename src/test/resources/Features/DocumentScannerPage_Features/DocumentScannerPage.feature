

Feature: MJCS test cases for the Document Scanner Page

  @BeforeScenarioForDocumentScan
  Scenario: I should be able to tap "Capture" button on Document Scanner Sample
    When  I click Navigate Back button
    And I click Document Scanner Sample button
    Then I click CAPTURE button


  Scenario: I should be able to tap "Upload ID Image" button
    Given I satisfy login preconditions for elbtesting server
    When  I click Navigate Back button
    And I click Document Scanner Sample button
    Then I click Upload ID Image button

#upload id with  before capture


  Scenario: I should be able to see Capture screen of document scanner
    Given I satisfy login preconditions for elbtesting server
    When  I click Navigate Back button
    And I click Document Scanner Sample button
    Then I click CAPTURE button
    Then I should see the capture screen



  Scenario: I should be able to tap Capture button of document scanner
    Given I satisfy login preconditions for elbtesting server
    When  I click Navigate Back button
    And I click Document Scanner Sample button
    Then I click CAPTURE button
    Then I should see the capture screen
    Then I click capture button on the capture screen


  Scenario: I should be able to tap flash button
    Given I satisfy login preconditions for elbtesting server
    When  I click Navigate Back button
    And I click Document Scanner Sample button
    Then I click CAPTURE button
    Then I should see the capture screen
    When I tap to flash button
    Then I should see the flash button as enabled

#Scenario: I should be able to check whether or not flash button enabled
#Scenario: I should be able to check whether or not flash button disabled

  Scenario: I should be able to see switch camera button on the document scanner capture screen
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Scanner Type" on Settings
    And I click switch Button on document Scanner Sample Settings in order to enable it
    Then I should see the switch Button as enabled
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    And I should see switch facing camera button on capture screen

#Scenario: I should be able to check whether or not switch button enabled
#Scenario: I should be able to check whether or not switch button disabled

  Scenario: I should be able to see pop-up test button by tapping longer to info button on the document scanner capture screen
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Scanner Type" on Settings
    And I click Info Button on document Scanner Sample Settings in order to enable it
    Then I should see the Info Button as enabled
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    Then I click CAPTURE button
    Then I should see the capture screen
    When I long tap info button on capture screen
    Then I see pop-up test notification box on the screen

  Scenario: I should be able to see info button on the document capture screen
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Scanner Type" on Settings
    And I click Info Button on document Scanner Sample Settings in order to enable it
    Then I should see the Info Button as enabled
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    And I should see info section on the document capture screen


  Scenario: I should be able to see Enabled Popup on the document scanner capture screen
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Scanner Type" on Settings
    And I click Enable popup on document Scanner Sample Settings in order to enable it
    Then I should see the Enable Popup Button as enabled
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    And I should see Enable Popup on capture screen

  Scenario: I should be able to see the edit screen of manual captured document on document scanner sample
    Given I satisfy login preconditions for elbtesting server
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    When I click capture button on the capture screen
    Then I should see captured document edit screen

  Scenario: I should be able to submit the manual captured document on document scanner sample
    Given I satisfy login preconditions for elbtesting server
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    When I click capture button on the capture screen
    Then I should see captured document edit screen
    When I click finish editing button on edit screen
    Then I should see result pop-up

  Scenario: I should be able to go back to capture screen from edit screen of the manual captured document

    Given I satisfy login preconditions for elbtesting server
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    When I click capture button on the capture screen
    Then I should see captured document edit screen
    When I tap back button of the device
    Then I should see the capture screen

  Scenario: I should be able to tap focus on the capture screen of document scanner sample

    Given I satisfy login preconditions for elbtesting server
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    And I should tap to focus on the screen


  Scenario: I should be able to rotate right the manual captured document on the edit screen
    Given I satisfy login preconditions for elbtesting server
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    When I click capture button on the capture screen
    Then I should see captured document edit screen
    Then I double click rotate right button
    When I click finish editing button on edit screen
    Then I should see result pop-up

  Scenario: I should be able to rotate left the manual captured document on the edit screen
    Given I satisfy login preconditions for elbtesting server
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    When I click capture button on the capture screen
    Then I should see captured document edit screen
    Then I double click rotate left button
    When I click finish editing button on edit screen
    Then I should see result pop-up
    And I should see "Document Name" section on the result popup


  Scenario: I should be able to upload the manual captured document on the edit screen
    Given I satisfy login preconditions for elbtesting server
    And  I click Navigate Back button
    And I click Document Scanner Sample button
    When I click CAPTURE button
    Then I should see the capture screen
    When I click capture button on the capture screen
    Then I should see captured document edit screen
    When I click finish editing button on edit screen
    Then I should see "Document Name" section on the result popup
    When I click ok button on the result popup
    And I click Upload ID Image button
    Then I should see result pop-up
    And I should see "Scan Reference" section on the result popup