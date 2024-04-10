package StepDefenitions;
import PageObjects.LoanCalculatorPage;
import Utilities.AddFluentWait;
import Utilities.Assertions;
import Factory.BaseClass;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMIcalcPage extends BaseClass
{
 
	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	LoanCalculatorPage LoanCalculatorPageObj = new LoanCalculatorPage(getDriver());
	Logger logger = BaseClass.getLogger();

	
	@Given("the user navigates to emi calculator page")
	public void the_user_navigates_to_emi_calculator_page()
	{
		
		//Waiting for the main menu to load
		wait.waitForMainMenu(getDriver());
		//Navigating to the respective page
		LoanCalculatorPageObj.navigatorForEMICalc();

	}
 /*-------------------------------------------------------------------------------------------------------------*/
	@When("the LoanAmount Textbox and Slider is visible and enabled to the user")
	public void the_loan_amount_textbox_and_slider_is_visible_and_displayed_to_the_user() {
		
		logger.info("-----TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider  started.------");
		//Waiting for all the fields to be visible
		wait.waitForTheTextBoxAndSlider(getDriver());
		//Validating if Loan Amount Text Box is visible
		if(LoanCalculatorPageObj.getLoanAmtTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not visible.");
			System.out.println("TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not visible.");
			myAssert.fail();
		}
		//Validating if Loan Amount Text Box is enabled
		if(LoanCalculatorPageObj.getLoanAmtTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not enabled.");
			System.out.println("TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider got failed, Loan Amount Text Box is not enabled.");
			myAssert.fail();
		}
		//Validating if Loan Amount Slider is visible
		if(LoanCalculatorPageObj.getLoanAmtSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_04_EMICalculator_ValidatingLoanAmountSlider got failed, Loan Amount Slider is not visible.");
			System.out.println("TestCase_04_EMICalculator_ValidatingLoanAmountSlider got failed, Loan Amount Slider is not visible.");
			myAssert.fail();
		}
		
		//Validating if Loan Amount Slider is enabled
		if(LoanCalculatorPageObj.getLoanAmtSlider().isEnabled()) {
			myAssert.pass();
			logger.info("TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider ended.");
		}
		else {
			logger.error("TestCase_04_EMICalculator_ValidatingLoanAmountSlider got failed, Loan Amount Slider is not enabled.");
			System.out.println("TestCase_04_EMICalculator_ValidatingLoanAmountSlider got failed, Loan Amount Slider is not enabled.");
			myAssert.fail();
		}
		
 /*-------------------------------------------------------------------------------------------------------------*/
	    
	}

	@When("the scale change done by user reflects correctly in LoanAmount Textbox")
	public void the_scale_change_done_by_user_reflects_correctly_in_loan_amount_textbox() 
	{
		logger.info("TestCase_05_EMICalculator_ScaleChangeForLoanAmountTextBoxAndSlider started.");
		//Waiting for all the fields to be visible
		wait.waitForTheTextBoxAndSlider(getDriver());
		
		//Moving the Slider to Initial Position
		LoanCalculatorPageObj.moveLoanAmtSlider(0);
		
		/*//Validating if the value passed to the text box is same as it is showing in the slider
		myAssert.assertIt(LoanCalculatorPageObj.getLoanAmtTextBoxValue(), "10,00,000", "The initial value of the loan amount textbox is not 10,00,000");*/
		
		//Moving the slider to Desired Position
		LoanCalculatorPageObj.moveLoanAmtSlider(130);
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		if(LoanCalculatorPageObj.getLoanAmtTextBoxValue().equals("50,00,000")) {
			myAssert.pass();
			logger.info("TestCase_05_EMICalculator_ScaleChangeForLoanAmountTextBoxAndSlider started.");
		}
		else {
			logger.error("TestCase_05_EMICalculator_ScaleChangeForLoanAmountTextBoxAndSlider got failed, Scale check for Loan Amount Text Box and slider was not successful.");
			System.out.println("TestCase_03_03_EMICalculator_ScaleChangeForLoanAmountTextBoxAndSlider got failed, Scale check for Loan Amount Text Box and Slider was unsuccessful.");
			myAssert.fail();
		}
		
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("the InterestRate Textbox and Slider is visible and enabled to the user")
	public void the_interest_rate_textbox_and_slider_is_visible_and_displayed_to_the_user()
	{
	    
		logger.info("TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider started.");
		//Validating if Interest Rate Text Box is visible
		if(LoanCalculatorPageObj.getIntRateTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
			System.out.println("TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
			myAssert.fail();
		}
		
		//Validating if Interest Rate Text Box is enabled
		if(LoanCalculatorPageObj.getIntRateTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
			System.out.println("TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
			myAssert.fail();
		}
		//Validating if Interest Rate Slider is visible
		if(LoanCalculatorPageObj.getIntRateSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_06_EMICalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
			System.out.println("TestCase_06_EMICalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
			myAssert.fail();
		}
		
		//Validating if Interest Rate Slider is enabled
		if(LoanCalculatorPageObj.getIntRateSlider().isEnabled()) {
			myAssert.pass();
			logger.info("TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider ended.");
		}
		else {
			logger.error("TestCase_06_EMICalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
			System.out.println("TestCase_06_EMICalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
			myAssert.fail();
		}
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("the scale change done by user reflects correctly in InterestRate Textbox")
	public void the_scale_change_done_by_user_reflects_correctly_in_interest_rate_textbox() 
	{
		
		logger.info("TestCase_07_EMICalculator_ScaleChangeForInterestRateTextBoxAndSlider started");
		//Moving the Slider to Initial Position
		LoanCalculatorPageObj.moveIntRateSlider(0);
		
		/*//Validating if the value passed to the text box is same as it is showing in the slider
		myAssert.assertIt(LoanCalculatorPageObj.getIntRateTextBoxValue(), "10.75", "The initial value of the interest rate textbox is not 10.75");*/
		
		//Moving the slider to Desired Position
		LoanCalculatorPageObj.moveIntRateSlider(112);
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		if(LoanCalculatorPageObj.getIntRateTextBoxValue().equals("14.25")) {
			myAssert.pass();
			logger.info("TestCase_07_EMICalculator_ScaleChangeForInterestRateTextBoxAndSlider ended");
		}
		else {
			logger.error("TestCase_07_EMICalculator_ScaleChangeForInterestRateTextBoxAndSlider got failed, Scale Change for Interest Rate Text Box and slider was not successful");
			System.out.println("TestCase_07_EMICalculator_ScaleChangeForInterestRateTextBoxAndSlider got failed, Scale Change for Interest Rate Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("the LoanTenure Textbox and Slider is visible and enabled to the user")
	public void the_loan_tenure_textbox_and_slider_is_visible_and_displayed_to_the_user()
	{
		
		logger.info("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider started.");
		//Waiting for all the fields to be visible
		wait.waitForTheTextBoxAndSlider(getDriver());
		
		//Validating if Loan Tenure Text Box is visible
		if(LoanCalculatorPageObj.getLoanTenureTextBox().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not visible.");
			System.out.println("TestCase_08_EMICalculator_ValidatingLoanTenureTextBox got failed, Loan Tenure Text Box is not visible.");
			myAssert.fail();
		}
		
		//Validating if Loan Tenure Text Box is enabled
		if(LoanCalculatorPageObj.getLoanTenureTextBox().isEnabled()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not enabled.");
			System.out.println("TestCase_08_EMICalculator_ValidatingLoanTenureTextBox got failed, Loan Tenure Text Box is not enabled.");
			myAssert.fail();
		}
		//Validating if Loan Tenure Slider is visible
		if(LoanCalculatorPageObj.getLoanTenureSlider().isDisplayed()) {
			myAssert.pass();
		}
		else {
			logger.error("TestCase_08_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not visible.");
			System.out.println("TestCase_08_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not visible.");
			myAssert.fail();
		}
		
		//Validating if Loan Tenure Slider is enabled
		if(LoanCalculatorPageObj.getLoanTenureSlider().isEnabled()) {
			myAssert.pass();
			logger.info("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider ended.");
		}
		else {
			logger.error("TestCase_08_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not enabled.");
			System.out.println("TestCase_08_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not enabled.");
			myAssert.fail();
		}
	    
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("the scale change done by user reflects correctly in LoanTenure Textbox")
	public void the_scale_change_done_by_user_reflects_correctly_in_loan_tenure_textbox() 
	{
		
		
		        logger.info("TestCase_09_EMICalculator_ScaleChangeForLoanTenureTextBoxAndSlider started");
		        //Moving the Slider to Initial Position
				LoanCalculatorPageObj.moveLoanTenureSlider(0);
				
				/*//Validating if the value passed to the text box is same as it is showing in the slider
				myAssert.assertIt(LoanCalculatorPageObj.getLoanTenureTextBoxValue(), "5", "The initial value of"
																+ " the loan tenure textbox is not"
																+ " 5");*/
				
				//Moving the slider to Desired Position
				LoanCalculatorPageObj.moveLoanTenureSlider(105);
				
				//Validating if the value passed to the text box is same as it is showing in the slider
				if(LoanCalculatorPageObj.getLoanTenureTextBoxValue().equals("10")) {
					myAssert.pass();
					logger.info("TestCase_09_EMICalculator_ScaleChangeForLoanTenureTextBoxAndSlider ended");
				}
				else {
					logger.error("TestCase_09_EMICalculator_ScaleChangeForLoanTenureTextBoxAndSlider got failed, Scale Change for Loan Tenure Text Box and slider was not successful");
					System.out.println("TestCase_09_EMICalculator_ScaleChangeForLoanTenureTextBoxAndSlider got failed, Scale Change for Loan Tenure Text Box and Slider was unsuccessful");
					myAssert.fail();
				}
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("the FeesAndCharge Textbox and Slider is visible and enabled to the user")
	public void the_fees_and_charge_textbox_and_slider_is_visible_and_displayed_to_the_user()
	{
		
		        
		
		       logger.info("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider started.");
		       //Validating if Fees And Charges Text Box is visible
				if(LoanCalculatorPageObj.getFeesAndChargesTextBox().isDisplayed()) {
					myAssert.pass();
				}
				else {
					logger.error("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
					System.out.println("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
					myAssert.fail();
				}
				
				//Validating if Fees And Charges Text Box is enabled
				if(LoanCalculatorPageObj.getFeesAndChargesTextBox().isEnabled()) {
					myAssert.pass();
				}
				else {
					logger.error("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
					System.out.println("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
					myAssert.fail();
				}
				//Validating if Fees And Charges Slider is visible
				if(LoanCalculatorPageObj.getFeesAndChargesSlider().isDisplayed()) {
					myAssert.pass();
				}
				else {
					logger.error("TestCase_10_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
					System.out.println("TestCase_10_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
					myAssert.fail();
				}
				
				//Validating if Fees And Charges Slider is enabled
				if(LoanCalculatorPageObj.getFeesAndChargesSlider().isEnabled()) {
					myAssert.pass();
					logger.info("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider ended.");
				}
				else {
					logger.error("TestCase_10_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
					System.out.println("TestCase_10_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
					myAssert.fail();
				}
	    
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("the scale change done by user reflects correctly in FeesAndCharge Textbox")
	public void the_scale_change_done_by_user_reflects_correctly_in_fees_and_charge_textbox() 
	{   
		
		logger.info("TestCase_11_EMICalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider started");
		//Moving the Slider to Initial Position
		LoanCalculatorPageObj.moveFeesAndChargesSlider(0);
		
		/*//Validating if the value passed to the text box is same as it is showing in the slider
		myAssert.assertIt(LoanCalculatorPageObj.getFeesAndChargesTextBoxValue(), "10,000", "The initial value of the fees and charges textbox is not 10,000");*/
		
		//Moving the slider to Desired Position
		LoanCalculatorPageObj.moveFeesAndChargesSlider(97);
		
		//Validating if the value passed to the text box is same as it is showing in the slider
		if(LoanCalculatorPageObj.getFeesAndChargesTextBoxValue().equals("25,000")) {
			myAssert.pass();
			logger.info("TestCase_11_EMICalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider ended");
		}
		else {
			logger.error("TestCase_11_EMICalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider got failed, Scale Change for Fees And Charges Text Box and slider was not successful");
			System.out.println("TestCase_11_EMICalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider got failed, Scale Change for Fees And Charges Text Box and Slider was unsuccessful");
			myAssert.fail();
		}
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@When("the YearAndMonth change done by user reflects correctly")
	public void the_year_and_month_change_done_by_user_reflects_correctly()
	{
		
		
		logger.info("TestCase_12_EMICalculator_ValidationForYearAndMonthOption started.");
		//Waiting for all the fields to be visible
		wait.waitForTheTextBoxAndSlider(getDriver());
		
		//Clicking on the year button
		LoanCalculatorPageObj.clickYear();
		
		//Storing the value of year in a string 
		String yearVal = LoanCalculatorPageObj.getLoanTenureTextBoxValue();
		
		//Converting the year value to the month value
		int yearValInInt = Integer.parseInt(yearVal);
		
		//Clicking on the month Button
		LoanCalculatorPageObj.clickMonth();
		
		//Storing the value of month in a string 
		String monthVal = LoanCalculatorPageObj.getLoanTenureTextBoxValue();
		
		//Asserting the values
		if(monthVal.equals(Integer.toString(yearValInInt*12))) {
			myAssert.pass();
			logger.info("TestCase_12_EMICalculator_ValidationForYearAndMonthOption ended.");
		}
		else {
			logger.error("TestCase_12_EMICalculator_ValidationForYearAndMonthOption got failed, The data flow between the year and month is not proper in the EMI Calculator Section.");
			System.out.println("TestCase_12_EMICalculator_ValidationForYearAndMonthOption got failed, The data flow between the year and month is not proper in the EMI Calculator Section..");
			myAssert.fail();
		}
	}
	/*-------------------------------------------------------------------------------------------------------------*/
	@Then("the EMIcalculator page UI checks are validated")
	public void the_em_icalculator_page_ui_checks_are_validated() 
	{
	    System.out.println("UI checks in Loan Calculator page is done");
	}



}
