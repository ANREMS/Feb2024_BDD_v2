
Feature: Registration
As a user I want to register

  Scenario Outline: Registration
    Given I am on the landing page
    When I click on the registration button
    And User fills the registration form with valid data "<gender>" "<firstname>" "<lastname>" "<DOBDay>" "<DOBMonth>" "<DOBYear>" "<email>" "<companyname>" "<newsletter>" "<password>" "<passwordconfirm>"
    And I click on the Register button and Continue button
    Then I should be on the home page

    Examples:
      |gender     | firstname | lastname | DOBDay | DOBMonth | DOBYear |email            |  companyname  | newsletter |password | passwordconfirm |
      | Male       | John       | doe     |25       |March    |1990     |johndoe1@test.com|johndoe Limited  |Yes         |Johndoe  |Johndoe       |