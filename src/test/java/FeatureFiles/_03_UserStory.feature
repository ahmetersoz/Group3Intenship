Feature: Add - Edit - Delete Document Types under Parameters Setup

Background:
  Given Navigate to Campus
  When Enter username and password and click login button
  Then User should login successfully

    Scenario: Add Document Types to Parameters
      Given Clicking on the Setup, Parameters, Document Types options from the menu categories
      When  Add to Document Types
      Then  Confirmation of successfully

    Scenario: Edit Document Types to Parameters
      Given Clicking on the Setup, Parameters, Document Types options from the menu categories
      When  Edit to Document Types
      Then  Confirmation of successfully

      Scenario: Delete Document Types to Parameters
        Given Clicking on the Setup, Parameters, Document Types options from the menu categories
        When  Delete to Document Types
        Then  Confirmation of successfully
