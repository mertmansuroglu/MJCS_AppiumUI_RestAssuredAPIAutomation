


  #Given: preconditions are mentioned in the given
  #When: purpose of this is to describe user action (you can use and here)
  #And(for when): this is for multiple user actions!!
  #Then: the purpose is to observe the expected output (you can use And here)(reference is displayed)
  #And(for then): if another reference is also displayed

Feature: MJCS test cases for the Journey Definition settings which belong to the settings page

  Scenario: I should able to click  "select journey def" button
    Given  I add new journey definition named as "Mert" from api side with only front
    And  I satisfy login preconditions for elbtesting server
    When I scroll to "Select Journey Definition" on Settings
    And I click Select Journey definition button
    Then I see the "Mert" journey definition on the list





