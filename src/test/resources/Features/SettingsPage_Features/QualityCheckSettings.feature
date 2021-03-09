




  Feature: MJCS test cases for the Quality Check settings which belong to the settings page

    @ScenarioForCustomerJourney
    Scenario: I should be able to enable "Enable Boundary Check" button
    Given I clean appium server
    When I open the application
    And I click settings button
    When I scroll to "Enable Boundary Check" on Settings
    Then I check if Enable Boundary Check button is displayed
    When I click Enable Boundary Check button in order to enable it
    Then I should see the boundary check button as enabled

    Scenario: I should be able to see "Boundary Check" on the capture screen enabled only boundary checks
      Given I satisfy login preconditions for elbtesting server
      And  I only enable the BOUNDARY check  button
      Then I should see the boundary check button as enabled
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Boundary" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until boundary check alert appears

    Scenario: I should be able to see "Boundary Check" on the capture screen enabled all checks
      Given I satisfy login preconditions for elbtesting server
      And I enable all quality checks
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Boundary" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until boundary check alert appears

    Scenario: I should be able to see "Boundary Check" on the capture screen enabled only boundary,blur
      Given I satisfy login preconditions for elbtesting server
      And I click Enable Alert Check button in order to enable it
      And I click Enable Boundary Check button in order to enable it
      And I click Enable Blur Check button in order to enable it
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Boundary" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until boundary check alert appears


    Scenario: I should be able to enable  "Enable Blur Check" button
    Given I open the application
    And I click settings button
    Then I check if Enable Blur Check button is displayed
    When I click Enable Blur Check button in order to enable it
    Then I should see the Blur check button as enabled

    Scenario: I should be able to see "Blur Check" on the capture screen
      Given I satisfy login preconditions for elbtesting server
      And  I only enable the BLUR check button
      Then I should see the Blur check button as enabled
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Blur" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until blur check alert appears

    Scenario: I should be able to see "Blur Check" on the capture screen enabled only blur,glare
      Given I satisfy login preconditions for elbtesting server
      And I click Enable Glare Check button in order to enable it
      And I click Enable Alert Check button in order to enable it
      And I click Enable Blur Check button in order to enable it
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Blur" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until blur check alert appears

    Scenario: I should be able to see "Blur Check" on the capture screen enabled all checks
      Given I satisfy login preconditions for elbtesting server
      And I enable all quality checks
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Blur" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until blur check alert appears

  Scenario: I should be able to enable  "Enable Glare Check" button
    Given I open the application
    And I click settings button
    Then I check if Enable Glare Check button is displayed
    When I click Enable Glare Check button in order to enable it
    Then I should see the Glare check button as enabled

    Scenario: I should be able to see "Glare Check" on the capture screen enabled only glare,boundary checks
      Given I satisfy login preconditions for elbtesting server
      And  I click Enable Glare Check button in order to enable it
      And I click Enable Boundary Check button in order to enable it
      And I click Enable Alert Check button in order to enable it
      Then I should see the Glare check button as enabled
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Glare" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until GLARE check alert appears

    Scenario: I should be able to see "Glare Check" on the capture screen enabled all checks
      Given I satisfy login preconditions for elbtesting server
      And   I enable all quality checks
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Glare" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until GLARE check alert appears

    Scenario: I should be able to see "Glare Check" on the capture screen enabled only glare,blur
      Given I satisfy login preconditions for elbtesting server
      And  I click Enable Glare Check button in order to enable it
      And I click Enable Blur Check button in order to enable it
      And I click Enable Alert Check button in order to enable it
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Glare" from Quality Check error
      When  I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until GLARE check alert appears

  Scenario: I should be able to enable  "Enable Low Res Check" button
    Given I open the application
    And I click settings button
    Then I check if Enable Low Res Check button is displayed
    When I click Enable Low Res Check button in order to enable it
    Then I should see the Low Res check button as enabled

    Scenario: I should be able to see "Low Res Check" on the capture screen
      Given I satisfy login preconditions for elbtesting server
      And  I only enable the LOW RES check button
      Then I should see the Low Res check button as enabled
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Resolution" from Quality Check error
      When I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until low res check alert appears

    Scenario: I should be able to see "Low Res Check" on the capture screen enabled all checks
      Given I satisfy login preconditions for elbtesting server
      And   I enable all quality checks
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Resolution" from Quality Check error
      When I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until low res check alert appears

    Scenario: I should be able to see "Low Res Check" on the capture screen enabled only lowRes,Blur check
      Given I satisfy login preconditions for elbtesting server
      And   I click Enable Low Res Check button in order to enable it
      And  I click Enable Alert Check button in order to enable it
      And I click Enable Blur Check button in order to enable it
      When I scroll to "Enable Manual Capture Dummy" on Settings
      Then I should enable smart capture dummy
      And I set smartcapture timeout to "5" second
      Then I should select "Resolution" from Quality Check error
      When I click Navigate Back button
      Then I check if Customer Journey Sample button is displayed
      Then I click customer journey button
      And I check if Start Customer Journey button is displayed
      When I click start customer journey button
      Then I should wait until low res check alert appears

  Scenario: I should be able to enable  "Enable Alert Check" button
    Given I open the application
    And I click settings button
    Then I check if Alert Check button is displayed
    When I click Enable Alert Check button in order to enable it
    Then I should see the Alert check button as enabled



