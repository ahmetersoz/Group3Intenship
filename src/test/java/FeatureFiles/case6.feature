Feature: Add - Edit - Delete Degree Levels Under Parameter Settings

  Background:
    Given Go to Given Site
    When Enter the username and password and click the login button
    Then User should login successfully

  Scenario: Adding Degree Levels to Parameters
   Given by clicking Settings, Parameters, Degree Levels in the menu categories.
    When Added to Grade Levels
    Then confirm successfully

  Scenario: Edit Grade Levels by Parameters
  Given by clicking the Settings, Parameters, Degree Levels options from the menu categories.
    When Editing Class Levels
    When successfully approved

  Scenario: Delete Grade Levels to Parameters
  Given by clicking the Settings, Parameters, Degree Levels options from the menu categories.
    When Deleted to Grade Levels
    Then successfully approved


