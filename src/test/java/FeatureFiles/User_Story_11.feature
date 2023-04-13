Feature: Add - Edit - Delete Discounts under Parameters Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Discounts to Parameters
    Given  Clicking on the Setup, Parameters, Discounts options from the menu categories
    When   Add to Discounts
    Then   Confirmation of successfully

  Scenario: Edit Discounts to Parameters
    Given  Clicking on the Setup, Parameters, Discounts options from the menu categories
    When   Edit to Discounts
    Then   Confirmation of successfully

    Scenario: Delete Discounts to Parameters
      Given Clicking on the Setup, Parameters, Discounts options from the menu categories
      When  Delete to Discounts
      Then  Confirmation of successfully




