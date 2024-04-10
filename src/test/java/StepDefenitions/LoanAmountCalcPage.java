package StepDefenitions;
 
import Factory.BaseClass;
import PageObjects.LoanCalculatorPage;
import Utilities.AddFluentWait;
import Utilities.Assertions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.When;
 
public class LoanAmountCalcPage extends BaseClass
{
	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	LoanCalculatorPage loanCalculatorPageObj = new LoanCalculatorPage(getDriver());
	Logger logger=getLogger();
	/*-------------------------------------------------------------------------------------------------------------*/
	@Given("user click the Loan Amount Calculator button")
	public void user_click_the_loan_amount_calculator_button() {
		//Waiting for the main menu to load
		wait.waitForMainMenu(getDriver());
		//Navigating to the respective page
		loanCalculatorPageObj.navigatorForLoanAmountCalc();
		//Waiting for all the fields to be visible
		wait.waitForTheTextBoxAndSlider(getDriver());
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates EMI textbox and slider")
	public void user_validates_emi_textbox_and_slider() {
		logger.info("---- TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider Started ----");
		//Validating if EMI Text Box is visible
		if(loanCalculatorPageObj.getEMITextBox().isDisplayed()) 
		{
			myAssert.pass();
		}
		else 
		{
			logger.error("TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not visible.");
			System.out.println("TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if EMI Text Box is enabled
		if(loanCalculatorPageObj.getEMITextBox().isEnabled()) 
		{
			myAssert.pass();
		}
		else 
		{
			logger.error("TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not enabled.");
			System.out.println("TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider got failed, EMI Text Box is not enabled.");
			myAssert.fail();
		}
		if(loanCalculatorPageObj.getEMISlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_13_LoanAmtCalculator_ValidatingEMISlider got failed, EMI Slider is not visible.");
			System.out.println("TestCase_13_LoanAmtCalculator_ValidatingEMISlider got failed, EMI Slider is not visible.");
			myAssert.fail();
		}
		//Validating if EMI Slider is enabled
		if(loanCalculatorPageObj.getEMISlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_13_LoanAmtCalculator_ValidatingEMISlider got failed, EMI Slider is not enabled.");
			System.out.println("TestCase_13_LoanAmtCalculator_ValidatingEMISlider got failed, EMI Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider Ended ----");
	}
 
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates interest rate textbox and slider")
	public void user_validates_interest_rate_textbox_and_slider() {
		logger.info("---- TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider Started ----");
		//Validating if Interest Rate Text Box is visible
		if(loanCalculatorPageObj.getIntRateTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
			System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if Interest Rate Text Box is enabled
		if(loanCalculatorPageObj.getIntRateTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
			System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
			myAssert.fail();
		}
		if(loanCalculatorPageObj.getIntRateSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
			System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
			myAssert.fail();
		}
		//Validating if Interest Rate Slider is enabled
		if(loanCalculatorPageObj.getIntRateSlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
			System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider Ended ----");
	}
 
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates scale change for interest rate textbox and slider")
	public void user_validates_scale_change_for_interest_rate_textbox_and_slider() {
		logger.info("---- TestCase_15_LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider Started ----");
		
		   //Moving the Slider to Initial Position
			loanCalculatorPageObj.moveIntRateSlider(0);
			
			//Validating if the value passed to the text box is same as it is showing in the slider
			//myAssert.assertIt(loanCalculatorPageObj.getIntRateTextBoxValue(), "10.75", "The initial value of the loan amount textbox is not 10.75");
			
			//Moving the slider to Desired Position
			loanCalculatorPageObj.moveIntRateSlider(112);
			//Validating if the value passed to the text box is same as it is showing in the slider
			
		if(loanCalculatorPageObj.getIntRateTextBoxValue().equals("14.25")) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_15_LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider got failed, Scale Change for Interest Rate Text Box and slider was not successful");
			System.out.println("TestCase_15_LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider got failed, Scale Change for Interest Rate Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
		logger.info("---- TestCase_15_LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider Ended ----");
	}
 
	
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates loan tenure textbox and slider")
	public void user_validates_loan_tenure_textbox_and_slider() {
		logger.info("---- TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider Started ----");
		//Validating if Loan Tenure Text Box is visible
		if(loanCalculatorPageObj.getLoanTenureTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not visible.");
			System.out.println("TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if Loan Tenure Text Box is enabled
		if(loanCalculatorPageObj.getLoanTenureTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not enabled.");
			System.out.println("TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not enabled.");
			myAssert.fail();
		}
		if(loanCalculatorPageObj.getLoanTenureSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_11_LoanAmtCalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not visible.");
			System.out.println("TestCase_11_LoanAmtCalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not visible.");
			myAssert.fail();
		}
		//Validating if Loan Tenure Slider is enabled
		if(loanCalculatorPageObj.getLoanTenureSlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_11_LoanAmtCalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not enabled.");
			System.out.println("TestCase_11_LoanAmtCalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider Ended ----");
	}
 
	
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates scale change for loan tenure textbox and slider")
	public void user_validates_scale_change_for_loan_tenure_textbox_and_slider()
	{
		logger.info("---- TestCase_17_LoanAmtCalculator_ScaleChangeForLoanTenureTextBoxAndSlider Started ----");
		//Moving the Slider to Initial Position
		loanCalculatorPageObj.moveLoanTenureSlider(0);	
		//Validating if the value passed to the text box is same as it is showing in the slider
		//myAssert.assertIt(loanCalculatorPageObj.getLoanTenureTextBoxValue(), "5", "The initial value of the loan tenure textbox is not 5");
		//Moving the slider to Desired Position
		loanCalculatorPageObj.moveLoanTenureSlider(105);
		
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		if(loanCalculatorPageObj.getLoanTenureTextBoxValue().equals("10")) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_17_LoanAmtCalculator_ScaleChangeForLoanTenureTextBoxAndSlider got failed, Scale Change for Loan Tenure Text Box and slider was not successful");
			System.out.println("TestCase_17_LoanAmtCalculator_ScaleChangeForLoanTenureTextBoxAndSlider got failed, Scale Change for Loan Tenure Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
		logger.info("---- TestCase_17_LoanAmtCalculator_ScaleChangeForLoanTenureTextBoxAndSlider Ended ----");

	}
 
	
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates fees and charges textbox and slider")
	public void user_validates_fees_and_charges_textbox_and_slider() {
		logger.info("---- TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider Started ----");
		//Validating if Fees And Charges Text Box is visible
		if(loanCalculatorPageObj.getFeesAndChargesTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
			System.out.println("TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if Fees And Charges Text Box is enabled
		if(loanCalculatorPageObj.getFeesAndChargesTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
			System.out.println("TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
			myAssert.fail();
		}
		if(loanCalculatorPageObj.getFeesAndChargesSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_13_LoanAmtCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
			System.out.println("TestCase_13_LoanAmtCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
			myAssert.fail();
		}
		//Validating if Fees And Charges Slider is enabled
		if(loanCalculatorPageObj.getFeesAndChargesSlider().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_13_LoanAmtCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
			System.out.println("TestCase_13_LoanAmtCalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
			myAssert.fail();
		}
		logger.info("---- TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider Ended ----");
	}
 
	
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates year and month option")
	public void user_validates_year_and_month_option() {
		logger.info("---- TestCase_19_LoanAmtCalculator_ValidationForYearAndMonthOption Started ----");
		//Clicking on the year button
		loanCalculatorPageObj.clickYear();
		//Storing the value of year in a string 
		String yearVal = loanCalculatorPageObj.getLoanTenureTextBoxValue();
		//Converting the year value to the month value
		int yearValInInt = Integer.parseInt(yearVal);
		//Clicking on the month Button
		loanCalculatorPageObj.clickMonth();
		//Storing the value of month in a string 
		String monthVal = loanCalculatorPageObj.getLoanTenureTextBoxValue();
		//Asserting the values
		if(monthVal.equals(Integer.toString(yearValInInt*12))) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_19_LoanAmtCalculator_ValidationForYearAndMonthOption got failed, The data flow between the year and month is not proper in the Loan Amount Calculator Section.");
			System.out.println("TestCase_19_LoanAmtCalculator_ValidationForYearAndMonthOption got failed, The data flow between the year and month is not proper in the Loan Amount Calculator Section..");
			myAssert.fail();
		}
		logger.info("---- TestCase_19_LoanAmtCalculator_ValidationForYearAndMonthOption Ended ----");
	}
	
	
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("user validates scale change for loanamount fees and charges textbox and slider")
	public void user_validates_scale_change_for_loanamount_fees_and_charges_textbox_and_slider()
	{
		logger.info("---- TestCase_20_LoanAmtCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider Started ----");
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
			logger.error("TestCase_20_LoanAmtCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider got failed, Scale Change for Fees And Charges Text Box and slider was not successful");
			System.out.println("TestCase_20_LoanAmtCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider got failed, Scale Change for Fees And Charges Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
		logger.info("---- TestCase_20_LoanAmtCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider Ended ----");
	}
 
	
	/*-------------------------------------------------------------------------------------------------------------*/
	@Then("Loan Amount Calculator UI Check validation is successful")
	public void loan_amount_calculator_ui_check_validation_is_successful() {
	}
 
}
