Feature: Loan Tenure Calculator UI Check

  @regression
  Scenario: Loan Tenure Calculator UI Check
    Given user click the Loan Tenure Calculator button
    When user validate loan amount textbox and slider
    And user validate scale change for loan amount textbox and slider
    And user validate EMI textbox and slider
    And user validate interest rate textbox and slider
    And user validate scale change for interest interest rate textbox and slider
    And user validate fees and charges textbox and slider
    And user validates scale change for loantenure fees and charges textbox and slider
    Then Loan Tenure UI Check validation is successful
