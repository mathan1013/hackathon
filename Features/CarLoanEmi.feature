Feature: Car loan EMI calculator
 
  @sanity 
  Scenario Outline: Enter the Valid Credentials
    Given the user click car loan
    Then enter the values with excel row "<row_index>"
    And the user clicks on the year button
    Then the user scroll to the table
    Then the user click on the years
    And display the EMI data
 
    Examples:
      | row_index |
      |         1 |
  Scenario: Extracting the results
    Given the user navigates to HomeLoanPage
    Then the user scroll to table
    And writing data into the excel