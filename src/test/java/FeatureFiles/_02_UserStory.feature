Feature: I should be able to Add-Edit-Delete Attestations under Human Resources Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Attestations position to Human Resources
     When Navigate to Attestations page
     Then Add new attestations and click the toggle
     And Successful message should be displayed

  Scenario: Edit position Attestations position to Human Resources
    When Navigate to Attestations page
    Then Search the position attestations added previously
    And Verify that the correct record found to attestations
    Then Click to edit button and change the attestations then click to save
    And Successful message should be displayed

  Scenario: Delete position Attestations position to Human Resources
    When Navigate to Attestations page
    Then Search the position attestations added previously
    And Verify that the correct record found to attestations
    Then Click to delete button and confirm the delete confirmation message
    And  Successful message should be displayed




