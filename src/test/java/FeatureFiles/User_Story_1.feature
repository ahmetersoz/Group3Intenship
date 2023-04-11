Feature: Add - Edit - Delete Position Categories Under Human Resources Setup

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    @ParallelTest
    Scenario: Add Position Categories to Human Resources
      Given Clicking selected options in the campus menu
      When  Add to position category
      When  Confirmation of successfully

    @ParallelTest
     Scenario: Edit Position Categories to Human Resources
       Given Clicking selected options in the campus menu
       When  Edit to position category
       Then  Confirmation of successfully

     @ParallelTest
     Scenario: Delete Position Categories to Human Resources
       Given Clicking selected options in the campus menu
       When  Delete to position category
       Then  Confirmation of successfully
