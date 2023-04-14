Feature: Add - Edit - Delete Positions Under Human Resources Setup

  Background: Login
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Add Positions under Human Resources Setup
      When Navigate to Positions Page
      Then Add new position and click the toggle
      And  Successful message should be displayed

      Scenario:  Search and Edit the Position Data Created in Previous Scenario
        When Navigate to Positions Page
        Then Search the position name added previously
        And  Verify that the correct record found
        Then Click to edit button and change the name then click to save
        And Successful message should be displayed

        Scenario:  Search and Delete the Position  Data Created in Previous Scenario
          When Navigate to Positions Page
          Then Search the position name added previously
          And  Verify that the correct record found
          Then Click to delete icon and confirm the delete confirmation message
          And Successful message should be displayed


