@Regress @Log
Feature: Login
  I want login to website

  @Positive @Logn1
  Scenario: Successfully login
    Given Already open the "http://automationpractice.com/" website
    And I click signin menu
    When I will be directed to login page
    And I input valid email "<emails>" and password "<pass>"
    And Click login button
    Then I will succsessfully login

    Examples:
    |emails             |pass     |
    |cobatest@gmail.com |123123123|