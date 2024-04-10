
package StepDefenitions;
 
import Factory.BaseClass;

import PageObjects.LoanCalculatorPage;

import Utilities.AddFluentWait;

import Utilities.Assertions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import org.apache.logging.log4j.Logger;
 
public class LoanTenureCalcPage extends BaseClass {

	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	Logger logger=getLogger();
	LoanCalculatorPage loanCalculatorPageObj = new LoanCalculatorPage(getDriver());
	/*-------------------------------------------------------------------------------------------------------------*/
	@Given("user click the Loan Tenure Calculator button")
	public void user_click_the_loan_tenure_calculator_button() {
		//Waiting for the main menu to load
		wait.waitForMainMenu(getDriver());
		//Navigating to the respective page
		loanCalculatorPageObj.navigatorForLoanTenureCalc();
		//Waiting for all the fields to be visible
		wait.waitForTheTextBoxAndSlider(getDriver());
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validate loan amount textbox and slider")
	public void user_validate_loan_amount_textbox_and_slider() {
		logger.info("---- TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider Started ----");
		//Validating if Loan Amount Text Box is visible
		if(loanCalculatorPageObj.getLoanAmtTextBox().isDisplayed()) 
		{
			myAssert.pass();
		}
		else 
		{
			logger.error("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not visible.");
			System.out.println("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not visible.");
			myAssert.fail();

		}
		//Validating if Loan Amount Text Box is enabled
		if(loanCalculatorPageObj.getLoanAmtTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not enabled.");
			System.out.println("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not enabled.");
			myAssert.fail();
		}
		//Validating if Loan Amount Slider is visible
		if(loanCalculatorPageObj.getLoanAmtSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Slider is not visible.");
			System.out.println("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Slider is not visible.");
			myAssert.fail();
		}
		//Validating if Loan Amount Slider is enabled
		if(loanCalculatorPageObj.getLoanAmtSlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountSlider got failed, Loan Amount Slider is not enabled.");
			System.out.println("TestCase_21_LoanTenureCalculator_ValidatingLoanAmountSlider got failed, Loan Amount Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider Ended ----");
		}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validate scale change for loan amount textbox and slider")
	public void user_validate_scale_change_for_loan_amount_textbox_and_slider() 
	{
		logger.info("---- TestCase_22_LoanTenureCalculator_ScaleChangeForLoanAmountTextBoxAndSlider Started ----");
		//Moving the Slider to Initial Position
		loanCalculatorPageObj.moveLoanAmtSlider(0);
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		//myAssert.assertIt(loanCalculatorPageObj.getLoanAmtTextBoxValue(), "10,00,000", "The initial value of the loan amount textbox is not 10,00,000");
		
		//Moving the slider to Desired Position
		loanCalculatorPageObj.moveLoanAmtSlider(130);
		
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		if(loanCalculatorPageObj.getLoanAmtTextBoxValue().equals("50,00,000")) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_22_LoanTenureCalculator_ScaleChangeForLoanAmountTextBoxAndSlider got failed, Scale Change for Loan Amount Text Box and slider was not successful");
			System.out.println("TestCase_22_LoanTenureCalculator_ScaleChangeForLoanAmountTextBoxAndSlider got failed, Scale Change for Loan Amount Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
		logger.info("---- TestCase_22_LoanTenureCalculator_ScaleChangeForLoanAmountTextBoxAndSlider Ended ----");
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validate EMI textbox and slider")
	public void user_validate_emi_textbox_and_slider() {
		logger.info("---- TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider Started ----");
		//Validating if EMI Text Box is visible		
		if(loanCalculatorPageObj.getEMITextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not visible.");
			System.out.println("TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if EMI Text Box is enabled
		if(loanCalculatorPageObj.getEMITextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not enabled.");
			System.out.println("TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not enabled.");
			myAssert.fail();
		}
		if(loanCalculatorPageObj.getEMISlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_23_LoanTenureCalculator_ValidatingEMISlider got failed, EMI Slider is not visible.");
			System.out.println("TestCase_23_LoanTenureCalculator_ValidatingEMISlider got failed, EMI Slider is not visible.");
			myAssert.fail();
		}
		//Validating if EMI Slider is enabled
		if(loanCalculatorPageObj.getEMISlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_23_LoanTenureCalculator_ValidatingEMISlider got failed, EMI Slider is not enabled.");
			System.out.println("TestCase_23_LoanTenureCalculator_ValidatingEMISlider got failed, EMI Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider Ended ----");
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validate interest rate textbox and slider")
	public void user_validate_interest_rate_textbox_and_slider() {
		logger.info("---- TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider Started ----");
		//Validating if Interest Rate Text Box is visible
		if(loanCalculatorPageObj.getIntRateTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
			System.out.println("TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if Interest Rate Text Box is enabled
		if(loanCalculatorPageObj.getIntRateTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
			System.out.println("TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
			myAssert.fail();
		}
		//Validating if Interest Rate Slider is visible
		if(loanCalculatorPageObj.getIntRateSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_24_LoanTenureCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
			System.out.println("TestCase_24_LoanTenureCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
			myAssert.fail();
		}
		//Validating if Interest Rate Slider is enabled
		if(loanCalculatorPageObj.getIntRateSlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_24_LoanTenureCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
			System.out.println("TestCase_24_LoanTenureCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider Ended ----");
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validate scale change for interest interest rate textbox and slider")
	public void user_validate_scale_change_for_interest_interest_rate_textbox_and_slider() {
		logger.info("---- TestCase_25_LoanTenureCalculator_ScaleChangeForInterestRateTextBoxAndSlider Started ----");
		//Moving the Slider to Initial Position
			loanCalculatorPageObj.moveIntRateSlider(0);
			
			//Validating if the value passed to the text box is same as it is showing in the slider
			//myAssert.assertIt(loanCalculatorPageObj.getIntRateTextBoxValue(), "10.75", "The initial value of the interest rate textbox is not 10.75");
			
			//Moving the slider to Desired Position
			loanCalculatorPageObj.moveIntRateSlider(112);
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		if(loanCalculatorPageObj.getIntRateTextBoxValue().equals("14.25")) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_25_LoanTenureCalculator_ScaleChangeForInterestRateTextBoxAndSlider got failed, Scale Change for Interest Rate Text Box and slider was not successful");
			System.out.println("TestCase_25_LoanTenureCalculator_ScaleChangeForInterestRateTextBoxAndSlider got failed, Scale Change for Interest Rate Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
		logger.info("---- TestCase_25_LoanTenureCalculator_ScaleChangeForInterestRateTextBoxAndSlider Ended ----");
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validate fees and charges textbox and slider")
	public void user_validate_fees_and_charges_textbox_and_slider() {
		logger.info("---- TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider Started ----");
		//Validating if Fees And Charges Text Box is visible
		if(loanCalculatorPageObj.getFeesAndChargesTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
			System.out.println("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if Fees And Charges Text Box is enabled
		if(loanCalculatorPageObj.getFeesAndChargesTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
			System.out.println("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
			myAssert.fail();
		}
		//Validating if Fees And Charges Slider is visible
		if(loanCalculatorPageObj.getFeesAndChargesSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
			System.out.println("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
			myAssert.fail();
		}
		//Validating if Fees And Charges Slider is enabled
		if(loanCalculatorPageObj.getFeesAndChargesSlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
			System.out.println("TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider Ended ----");
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates scale change for loantenure fees and charges textbox and slider")
	public void user_validates_scale_change_for_loantenure_fees_and_charges_textbox_and_slider() {
		logger.info("---- TestCase_27_LoanTenureCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider Started ----");
		//Moving the Slider to Initial Position
		loanCalculatorPageObj.moveFeesAndChargesSlider(0);
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		//myAssert.assertIt(loanCalculatorPageObj.getFeesAndChargesTextBoxValue(), "10,000", "The initial value of the fees and charges textbox is not 10,000");
		
		//Moving the slider to Desired Position
		loanCalculatorPageObj.moveFeesAndChargesSlider(97);

		
		//Validating if the value passed to the text box is same as it is showing in the slider
		if(loanCalculatorPageObj.getFeesAndChargesTextBoxValue().equals("25,000")) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_27_LoanTenureCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider got failed, Scale Change for Fees And Charges Text Box and slider was not successful");
			System.out.println("TestCase_27_LoanTenureCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider got failed, Scale Change for Fees And Charges Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
		logger.info("---- TestCase_27_LoanTenureCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider Ended ----");
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@Then("Loan Tenure UI Check validation is successful")
	public void loan_tenure_ui_check_validation_is_successful() {
	    System.out.println("Loan Tenure UI Check validation is successful");
	}

 
}

