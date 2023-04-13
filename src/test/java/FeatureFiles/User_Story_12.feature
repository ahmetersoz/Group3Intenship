Feature: Add - Edit - Delete Nationalities under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Nationalities to Parameters
    Given  Clicking on the Setup, Parameters, Nationalities options from the menu categories
    When   Add to Nationalities
    Then   Confirmation of successfully

  Scenario: Edit Nationalities to Parameters
    Given  Clicking on the Setup, Parameters, Nationalities options from the menu categories
    When   Edit to Nationalities
    Then   Confirmation of successfully

  Scenario: Delete Nationalities to Parameters
    Given  Clicking on the Setup, Parameters, Nationalities options from the menu categories
    When   Delete to Nationalities
    Then   Confirmation of successfully




