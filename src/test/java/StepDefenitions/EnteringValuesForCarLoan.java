package StepDefenitions;
 
import java.util.HashMap;
import java.util.List;
 
import Factory.BaseClass;
import org.apache.logging.log4j.Logger;
import PageObjects.emiCalculatorHomePage;
import Utilities.AddFluentWait;
import Utilities.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class EnteringValuesForCarLoan extends BaseClass{
	
	AddFluentWait wait = new AddFluentWait();
	List<HashMap<String, String>> datamap;
	Logger logger = BaseClass.getLogger();
	
	@Given("the user click car loan")
	public void the_user_click_car_loan() {
		logger.info("---- TestCase_01_EnteringRequiredValuesInHomePage Started ----");
	    // Write code here that turns the phrase above into concrete actions
		emiCalculatorHomePage emi = new emiCalculatorHomePage(getDriver());
		wait.waitForMainMenu(getDriver());
		emi.clickCarLoan();
	   // throw new io.cucumber.java.PendingException();
	}
 
	@Then("enter the values with excel row {string}")
	public void enter_the_values_with_excel_row(String rows) {
	    // Write code here that turns the phrase above into concrete actions
		 datamap=DataReader.data("C:\\Users\\2318517\\Downloads\\Cucumber_EMI_CODEZILLA 1\\Cucumber_EMI_CODEZILLA\\Hackathon_Project\\TestData\\CarLoanData.xlsx", "Sheet1");
 
	        int index=Integer.parseInt(rows)-1;
	        String loanAmount= datamap.get(index).get("loan_amount");
	        String interest= datamap.get(index).get("interest");
	        String tenure= datamap.get(index).get("tenure");
	        System.out.println(loanAmount+" "+interest+" "+tenure);
	        emiCalculatorHomePage emi = new emiCalculatorHomePage(getDriver());
	        emi.setLoanAmt(loanAmount);
	        emi.setInterest(interest);
	        emi.moveLoanTenureSlider(-375);
	    //throw new io.cucumber.java.PendingException();
	        
	}
 
	@When("the user clicks on the year button")
	public void the_user_clicks_on_the_year_button() {
	    // Write code here that turns the phrase above into concrete actions
		emiCalculatorHomePage emi = new emiCalculatorHomePage(getDriver());
		emi.clickOnYear();
	   // throw new io.cucumber.java.PendingException();
		logger.info("---- TestCase_01_EnteringRequiredValuesInHomePage Ended ----");
		
	}
	
 
}