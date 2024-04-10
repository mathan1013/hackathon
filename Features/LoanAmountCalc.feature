Feature: Loan Amount Calculator UI Check

  @regression
  Scenario: Loan Amount Calculator UI Check
    Given user click the Loan Amount Calculator button
    When user validates EMI textbox and slider
    And user validates interest rate textbox and slider
    And user validates scale change for interest rate textbox and slider
    And user validates loan tenure textbox and slider
    And user validates scale change for loan tenure textbox and slider
    And user validates fees and charges textbox and slider
    And user validates year and month option
    And user validates scale change for loanamount fees and charges textbox and slider
    Then Loan Amount Calculator UI Check validation is successful
