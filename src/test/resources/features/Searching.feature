Feature: working on Web Application Amazon

  Scenario: amazon page
    Given user is in Amazon page
    When user selects Books from dropdown
    Then user user searches harrry porter on the text box
    And user clicks on search button
