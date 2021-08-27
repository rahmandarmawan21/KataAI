@Test
Feature: API Testing
  I want to verify user end point

  @API	@G1
  Scenario: Get user detail
    Given I want to see the detail of user with id ""
    Then I should see the users detail with
      |id|name|email|gender|status|
      |1307|askkd|gggdd@masa.com|Female|Active|
