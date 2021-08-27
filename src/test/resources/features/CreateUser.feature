@tag
Feature: API Testing
  I want to verify user end point

  @API	@C1
  Scenario: Create new user
    Given I want to add new user using method Post
    Then I will successfully create user name "jiangkman", job "spv"
