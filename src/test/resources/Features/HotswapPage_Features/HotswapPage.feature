


  Feature: MJCS test cases for the HotSwap Page


  Scenario: I should be able to check "Enter profile file name" textbox
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    Then I check if Enter profile file name textbox is displayed


  Scenario: I should be able to check "Enter tag name" textbox
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    Then I check if Enter tag name textbox is displayed


  Scenario: I should be able to check "Get profile Info from list" button
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    When I scroll to "GET PROFILE INFO FROM LIST" on HotSwap Sample Settings
    And I check if Get profile Info from list button is  displayed


  Scenario: I should be able to check "Get profile Info from Tag" button
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    When I scroll to "GET PROFILE INFO FROM TAG" on HotSwap Sample Settings
    And I check if Get profile Info from tag button is  displayed


  Scenario: I should be able to check "Hotswap" label
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    And I check if Hotswap label is  displayed


  Scenario: I should be able to check "Install Profile" button
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    Then I check if Install Profile button is  displayed


  Scenario: I should be able to check "Processing Mode" button
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    When I scroll to "SELECT PROFILE FROM LIST" on HotSwap Sample Settings
    And I check if Processing Mode button is  displayed


  Scenario: I should be able to check "Remove Profile" button
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    And I check if Remove Profile button is  displayed


  Scenario: I should be able to check "Scan document" buttonn
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    When I scroll to "PROCESSING MODE" on HotSwap Sample Settings
    And I check if Scan document button is  displayed


  Scenario: I should be able to check "Select Profile From List" button
    Given I clean appium server
    When I open the application
    When I check if Hotswap Sample button is displayed
    And I click Hotswap Sample button
    When I scroll to "SELECT PROFILE FROM LIST" on HotSwap Sample Settings
    And I check if Select Profile From List button is  displayed
