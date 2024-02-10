Feature: Login Feature
  bu test login özelliğin test eder

  Scenario: Valid username- valid password
    Given User is on login page
    When User enters valid username
    And  User enters valid password
    And user cliks login button
    Then User schould succesfully login the system

