Feature: Add - Edit - Delete Subject Categories under Education Setup

Background:
  Given Navigate to Campus
  When Enter username and password and click login button
  Then User should login successfully

  Scenario: Add Subject Categories to Education
    Given  Clicking on the Setup, Education, Subject Categories options from the menu categories
    When   Add to Subject Categories
    Then   Confirmation of successfully

    Scenario: Edit Subject Categories to Education
    Given Clicking on the Setup, Education, Subject Categories options from the menu categories
    When  Edit to Subject Categories
    Then  Confirmation of successfully

      Scenario: Delete Subject Categories to Education
        Given Clicking on the Setup, Education, Subject Categories options from the menu categories
        When  Delete to Subject Categories
        Then  Confirmation of successfully

