Feature: Add - Edit - Delete Nationalities under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Add Nationalities to Parameters
    Given  Clicking on the Setup, Parameters, Nationalities options from the menu categories
    When   Add to Nationalities
    Then   Confirmation of successfully




