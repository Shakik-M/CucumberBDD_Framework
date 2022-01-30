Feature: Login Test

  Scenario: Login with valid email and password
    Given I am at the TalentTek hmepage
    And I enter valid email address
    And I enter valid password
    When I click on the Login Button
    Then I should be able to login successfully

  Scenario: Login with invalid email and password
    Given I am at the TalentTek hmepage
    And I enter valid email address
    And I enter valid password
    When I click on the Login Button
    Then I should be able to login successfully
