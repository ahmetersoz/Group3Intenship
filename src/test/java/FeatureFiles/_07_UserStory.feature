Feature: Add - Edit - Delete Locations Under  School Setup

  Background: Login
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add  Locations Under Human School Setup
    When Navigate to Locations Page
    Then Add new location and click the toggle
    And  Successful message should be displayed

  Scenario:  Search and Edit the Locations Under School Setup
    When Navigate to Locations Page
    Then Search the location name added previously
    And  Verify that the correct record found
    Then Click to edit button and change the name then click to save
    And Successful message should be displayed

  Scenario:  Search and Delete the Locations Under School Setup
    When Navigate to Locations Page
    Then Search the location name added previously
    And  Verify that the correct record found
    Then Click to delete icon and confirm the delete confirmation message
    And Successful message should be displayed


