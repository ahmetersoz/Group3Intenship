Feature: Add - Edit - Delete Bank Account Under Parameter Setup

  Background: Login
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Bank Account Under Parameter Setup
    When Navigate to Bank Account Page
    Then Add new Bank Account and click the toggle
    And  Successful message should be displayed

  Scenario:  Search and Edit the Bank Account Under Data Created in Previous Scenario
    When Navigate to Bank Account Page
    Then Search the Bank Account name added previously
    And  Verify that the correct record found
    Then Click to edit button and change the iban then click to save
    And Successful message should be displayed

  Scenario:  Search and Delete the Bank Account  Data Created in Previous Scenario
    When Navigate to Bank Account Page
    Then Search the Bank Account name added previously
    And  Verify that the correct record found
    Then Click to delete icon for remove the account and confirm the delete confirmation message
    And Successful message should be displayed