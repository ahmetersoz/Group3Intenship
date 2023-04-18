Feature: Add - Edit - Delete Grade Levels under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Grade Levels to Parameters
    Given  Clicking on the Setup, Parameters, Grade Levels options from the menu categories
    When   Add to Grade Levels
    Then   Confirmation of successfully

    Scenario: Edit Grade Levels to Parameters
      Given Clicking on the Setup, Parameters, Grade Levels options from the menu categories
      When  Edit to Grade Levels
      When  Confirmation of successfully

    Scenario: Delete Grade Levels to Parameters
      Given  Clicking on the Setup, Parameters, Grade Levels options from the menu categories
      When   Delete to Grade Levels
      Then   Confirmation of successfully






