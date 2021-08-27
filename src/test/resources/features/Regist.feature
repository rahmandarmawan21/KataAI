@Regress @Reg
Feature: Register
  I want register to website

  @Positive @Reg1
  Scenario: New account to register
    Given Already open the "http://automationpractice.com/" website
    When I click signin menu
    And I will be directed to register page
    And I input email "<emails>"
    And Click create an account button
    And I will direct to register form
    And I choose tittle "<tittle>"
    And I input first name "<fname>" last name "<lname>"
    And I input password "<pass>" date of birth "<day>" "<month>" "<year>"
    And I input address "<addres>"
    And I input city "<city>"
    And I input state "<state>"
    And I input post code "<postcode>"
    And I input phone number "<phone>"
    And I input referance "<reffaddress>"
    Then I click register button

    Examples:
      |emails             |tittle|fname |lname   |pass     |day|month  |year|addres     |city      |state  |postcode|phone       |reffaddress|
      |cobatest@gmail.com |Mr    |Rahman|darmawan|123123123|21 |January|1993|pedongkelan|Los Angles|Alaska |13790   |087788119090|gas alan   |
