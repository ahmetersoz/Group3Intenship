Feature: Add - Edit - Delete Degree Levels Under Parameter Settings

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Degree Levels to Parameters
    Given Click Setup, Parameters, Class Levels in the menu category.
   When that grade levels have been added
  Then confirm successfully

  Scenario: edit levels by parameter levels It is
  Given by clicking the Setup, Parameters, Grade Levels options.
 When confirm grade levels
  Then accurately and successfully

  Scenario: Delete Grade Levels to Parameters
  Given Deletion is done by clicking the Setup, Parameters, Grade Levels options from the menu categories.
  When Verify Class Levels Have Been Deleted
    Then   Confirmation of successfully

