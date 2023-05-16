Feature: welcome to cucumber

  Scenario: working on web application
    Given user is in Orange Hrm page
    When user specifies username and pwd
    And user click on submit button
    Then user navigated to home page
