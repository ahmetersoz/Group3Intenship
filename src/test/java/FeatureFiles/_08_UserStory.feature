Feature: I should be able to Add-Edit-Delete Departments under School Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add position Departments position to School Setup
     When Navigate to Departments page
     Then Add new Department account page
     And Successful message should be displayed

  Scenario: Edit position Departments position to School Setup
    When Navigate to Departments page
    And Verify that the correct record found to department
    Then Click to edit button and change the  then click to save
    And  Successful message should be displayed

  Scenario: Delete position Departments position to School Setup
    When Navigate to Departments page
    Then Click to delete button  and confirm the delete confirmation message
    And Successful message should be displayed






