 #Given: preconditions are mentioned in the given
  #When: purpose of this is to describe user action (you can use and here)
  #And(for when): this is for multiple user actions!!
  #Then: the purpose is to observe the expected output (you can use And here)(reference is displayed)
  #And(for then): if another reference is also displayed



 Feature: MJCS test cases for the Main Page

   Scenario: I should able to click "Customer Journey Sample" button.
     Given I clean appium server
     When I open the application
     Then I check if Customer Journey Sample button is displayed
     And I click customer journey button


   Scenario: I should able to click "Liveness Fragment Sample" button
     When I open the application
     Then I check if liveness button is displayed
     And  I click Liveness Fragment Sample button


   Scenario: I should able to click "Document Scanner Sample" button
     When I open the application
     Then I check if Document Scanner button is displayed
     And I click Document Scanner Sample button


   Scenario: I should able to click  "Hotswap Sample" button
     When I open the application
     Then I check if Hotswap Sample button is displayed
     And I click Hotswap Sample button


   Scenario: I should able to click  "Manual Extraction" button
     When I open the application
     Then I check if Manual Extraction button is displayed
     And  I click Manual Extraction button


   Scenario: I should able to see " MJCS" label in main view
     When I open the application
     Then I check if MJCS Label is displayed


   Scenario: I should able to click  "Settings" button
     When I open the application
     Then I check if settings button is displayed
     And I click settings button


   Scenario: I should able to click  "Navigate Back Button" button
     When I open the application
     And I click settings button
     Then I check if Navigate Back Button is displayed
     And I click Navigate Back button
