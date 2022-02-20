Feature: SignUp Test

  @signup
  Scenario: SignUp with valid student information
    Given I am at the TalentTek homepage
    And I click on Create new account button
    And I enter valid student information
    And I agree with terms and condition
    When I click on submit button
    Then I will be able to create account successfully