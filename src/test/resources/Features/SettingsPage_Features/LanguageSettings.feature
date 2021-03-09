Feature: MJCS test cases for the language settings which belong to the settings page

  @ScenarioForCustomerJourney
  Scenario: I should be able to enable "Enable Language Selection" layout
    When I scroll to "Enable Language Selection" on Settings
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    Then I should see Enable language selection as enabled

  Scenario: I should be able to click "language selection" layout
    Given I clean appium server
    When I open the application
    And I click settings button
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout

  Scenario: I should be able to select "English" language
    Given I clean appium server
    When I open the application
    And I click settings button
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select English language

  Scenario: I should be able to see english language is applied for the capture screen
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select English language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen language is english

  Scenario: I should be able to see the error message in english after exiting the journey
    And  I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select English language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I tap back button of the device
    Then I should see the error message in english


  Scenario: I should be able to select "Turkish" language
    Given I clean appium server
    When I open the application
    And I click settings button
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language


  Scenario: I should be able to see the text of info popup for frontside section as turkish
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen language is turkish

  Scenario: I should be able to see the text of upload popup title in turkish
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the text of upload popup title in turkish

  Scenario: I should be able to see the text of upload popup message in turkish
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the text of upload popup message in turkish


  Scenario: I should be able to see the text of info popup for selfie section as turkish
    Given I configure triplescan from admin settings as "false"
    And  I enable only selfie configuration from Api
    And I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the selfie section with Turkish Language

  Scenario: I should be able to see the description label of liveness detection screen in turkish
    Given I configure triplescan from admin settings as "false"
    And  I enable only Liveness configuration from Api
    And I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the description label of liveness detection screen in turkish

  Scenario: I should be able to see the proceed button of liveness detection screen in turkish
    Given I configure triplescan from admin settings as "false"
    And  I enable only Liveness configuration from Api
    And I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the proceed button of liveness detection screen in turkish

  Scenario: I should be able to see the liveness message label in turkish
    Given I configure triplescan from admin settings as "false"
    And  I enable only Liveness configuration from Api
    And I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the proceed button of liveness detection screen in turkish
    When I tap proceed button of liveness detection
    Then I should see liveness message for the look straight in turkish

  Scenario: I should be able to see the liveness animation view in turkish
    Given I configure triplescan from admin settings as "false"
    And  I enable only Liveness configuration from Api
    And I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the proceed button of liveness detection screen in turkish
    When I tap proceed button of liveness detection
    Then I should see liveness animation view in turkish


  Scenario: I should be able to see the text of info popup for A4 section as turkish
    Given I configure triplescan from admin settings as "false"
    And  I enable only A4 configuration from Api
    And I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see the Adress section with Turkish Language



  Scenario: I should be able to see the text of info popup for Try again as turkish
    Given I configure triplescan from admin settings as "true"
    And  I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    When I click finish editing button on edit screen of customer journey
    Then I should see that recapture the document popup appears in turkish language

  Scenario: I should be able to see the text of finish editing button as turkish on the document edit screen
    Given I configure triplescan from admin settings as "false"
    And  I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    And I should see finish editing button in turkish

  Scenario: I should be able to see the error message in turkish after exiting the journey
    Given I configure triplescan from admin settings as "false"
    And  I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    When  I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should see the capture screen of Customer Journey
    When I click capture button of customer journey on the capture screen
    Then I should see captured document edit screen on customer journey
    And I should see finish editing button in turkish


  Scenario: I should be able to click cancel button on language selection view
    Given I clean appium server
    When I open the application
    And I click settings button
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    And I check if cancel button is enabled
    Then I click cancel button

  Scenario: I should be able to see the text of blur check as turkish on the capture screen
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    Then  I only enable the BLUR check buttonn
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "5" second
    Then I should select "Blur" from Quality Check error
    When I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should wait until blur check alert appears in turkish

  Scenario: I should be able to see the text of glare check as turkish on the capture screen
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    Then I only enable the Glare check buttonn
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "5" second
    Then I should select "Blur" from Quality Check error
    When I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should wait until glare check alert appears in turkish


  Scenario: I should be able to see the text of low res check as turkish on the capture screen
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    Then I only enable the Low Res check buttonn
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "5" second
    Then I should select "Glare" from Quality Check error
    When I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should wait until Low res check alert appears in turkish

  Scenario: I should be able to see the text of boundary check as turkish on the capture screen
    Given I satisfy login preconditions for elbtesting server
    Then I check if Enable language selection button is displayed
    And I click Enable language selection button in order to enable it
    And I check if Language Selection layout is enabled
    And I click Language Selection layout
    Then I select Turkish language
    Then I only enable the Boundary check buttonn
    When I scroll to "Enable Manual Capture Dummy" on Settings
    Then I should enable smart capture dummy
    And I set smartcapture timeout to "5" second
    Then I should select "Boundary" from Quality Check error
    When I click Navigate Back button
    Then I check if Customer Journey Sample button is displayed
    Then I click customer journey button
    And I check if Start Customer Journey button is displayed
    When I click start customer journey button
    Then I should wait until Boundary check alert appears in turkish