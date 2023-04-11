Feature: Add - Edit - Delete Fields under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Add Fields to Parameters
    Given  Clicking on the Setup, Parameters, Fields options from the menu categories
    When   Add to Fields
    Then   Confirmation of successfully

  Scenario: Edit Fields to Parameters
    Given  Clicking on the Setup, Parameters, Fields options from the menu categories
    When   Edit to Fields
    Then   Confirmation of successfully

  Scenario: Delete Fields to Parameters
    Given  Clicking on the Setup, Parameters, Fields options from the menu categories
    When   Delete to Fields
    Then   Confirmation of successfully
