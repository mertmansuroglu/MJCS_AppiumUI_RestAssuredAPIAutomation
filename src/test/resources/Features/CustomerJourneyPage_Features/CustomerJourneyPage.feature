

Feature: MJCS test cases for the Customer Journey

  ##settings button should be in customer journey view3
##customer journey should have back button
  @ScenarioForCustomerJourney
  Scenario: I should be able to click "Start Customer Journey" button
    Given I clean appium server
    When I open the application
    Then I check if Customer Journey Sample button is displayed
    When I click customer journey button
    Then I check if Start Customer Journey button is displayed
    When I click start customer journey button

  Scenario: I should be able to see Capture screen of Customer Journey Sample
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    When I click customer journey button
    Then I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey

  Scenario: I should be able to tap the Capture button of Customer Journey Sample
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen


  Scenario: I should be able to tap focus on the capture screen of customer journey sample
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    And  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I should tap to focus on the screen for customer journey


  Scenario: I should be able to go back to capture screen from the edit screen of the manual captured document
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I tap back button of the device
    Then I should see the capture screen of Customer Journey

  Scenario: I should be able to rotate right the manual captured document on the edit screen
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    Then I double click rotate right button on customer journey
    Then I click finish editing button on edit screen of customer journey

  Scenario: I should be able to rotate left the manual captured document on the edit screen
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    Then I double click rotate left button on customer journey
    Then I click finish editing button on edit screen of customer journey


  Scenario: I should be able to uplaod the manual captured document on the edit screen
    Given  I configure triplescan from admin settings as "false"
    And I enable only front configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    Then I click finish editing button on edit screen of customer journey
    And I wait until  manual capture is completed
    When I see the result page
    Then I should see the High level Result

  Scenario: I should be able to upload the not supported document with manual capture by triplescan enabled
    Given I configure triplescan from admin settings as "true"
    And I enable only front configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should wait until triplescan process is finished
    And I wait until  manual capture is completed
    Then I should see the High level Result

  Scenario: I should be able to upload the passed document with smart capture  by triplescan enabled
    Given I configure triplescan from admin settings as "true"
    And I enable only front configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "1" second
    Then I should select "Pass" from Quality Check error
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I wait until frontside smartcapture is completed
    When I see the result page
    Then I should see the High level Result

  Scenario: I should be able to see the A4 step during the journey without screen injection
    Given I configure triplescan from admin settings as "false"
    And I enable only A4 configuration from Api
    And I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Address Document" on Settings
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should check enable smartcapture dummy button as disabled
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    And I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    Then I click finish editing button on edit screen of customer journey
    Then I should see that Address step appears

###I should be able to see the selfie step during the journey without screen injection

###I should be able to see the liveness step during the journey without screen injection


  Scenario: I should be able to check High Level Result on the investigation studio after smartcapturing the document
    Given I satisfy login preconditions for elbtesting server
    And  I enable only front configuration from Api
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCS Journey Definition" journey definition on the list
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "1" second
    Then I should select "Pass" from Quality Check error
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I wait until frontside smartcapture is completed
    When I see the result page
    Then I should see the High level Result
    And HLR result should be same in investigation studio

  Scenario: I should able to smartcapture the document by enabling the expiry check
    Given I enable expiry check from admin settings
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "1" second
    Then I should select "Pass" from Quality Check error
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I wait until frontside smartcapture is completed
    When I see the result page
    Then I should see the High level Result
    And HLR in result page should be "expired"




  Scenario: I should able to smartcapture the document with newly added journey definition
    Given I add new journey definition named as "MJCSDemo" from api side with only front
    Given I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "MJCSDemo" journey definition on the list
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "1" second
    Then I should select "Pass" from Quality Check error
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I wait until frontside smartcapture is completed
    When I see the result page
    Then I should see the High level Result


#  Scenario: I should able to see server unreachable popup in case of entering credentials wrongly(Manual Capture)
#    Given I satisfy login preconditions for elbtesting server
#    Then I enter the following Baselink "failUrl"
#    When  I click Navigate Back button
#    Then I check if Customer Journey Sample button is displayed
#    Then I click customer journey button
#    And I check if Start Customer Journey button is displayed
#    When I click start customer journey button
#    Then I should see the capture screen of Customer Journey
#    And I click capture button of customer journey on the capture screen
#    Then I should see captured document edit screen
#    When I click finish editing button on edit screen
#    Then I should wait until Server Unreachable popup appears


#  Scenario: I should able to see server unreachable popup in case of entering credentials wrongly(smartcapture)
#    Given I satisfy login preconditions for elbtesting server
#    Then I enter the following Baselink "failUrl"
#    When I scroll to "Enable Manual Capture Dummy" on Settings
#    Then I should enable smart capture dummy
#    And I set smartcapture timeout to "1" second
#    Then I should select "Pass" from Quality Check error
#    When  I click Navigate Back button
#    Then I check if Customer Journey Sample button is displayed
#    Then I click customer journey button
#    And I check if Start Customer Journey button is displayed
#    When I click start customer journey button
#    Then I should wait until Server Unreachable popup appears












