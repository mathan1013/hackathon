Feature: UI checks in EMI calculator page

  @regression
  Scenario: EMIcalculator UI Validation
    Given the user navigates to emi calculator page
    When the LoanAmount Textbox and Slider is visible and enabled to the user
    And the scale change done by user reflects correctly in LoanAmount Textbox
    And the InterestRate Textbox and Slider is visible and enabled to the user
    And the scale change done by user reflects correctly in InterestRate Textbox
    And the LoanTenure Textbox and Slider is visible and enabled to the user
    And the scale change done by user reflects correctly in LoanTenure Textbox
    And the FeesAndCharge Textbox and Slider is visible and enabled to the user
    And the scale change done by user reflects correctly in FeesAndCharge Textbox
    And the YearAndMonth change done by user reflects correctly  
    Then the EMIcalculator page UI checks are validated
    