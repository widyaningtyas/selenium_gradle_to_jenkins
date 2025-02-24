Feature: Login

  @Regression
  Scenario: user should be able to sign up with valid email address
    Given user go to "automationexercise" page
    When user click on login button
    Then user do sign up
      | name  | Lala                            |
      | email | Lalalililololele@mailinator.com |