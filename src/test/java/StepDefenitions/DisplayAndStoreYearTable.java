package StepDefenitions;
 
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.Logger;

import Factory.BaseClass;
import PageObjects.HomeLoanEMICalculatorPage;
import PageObjects.emiCalculatorHomePage;
import Utilities.WriteExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
 
public class DisplayAndStoreYearTable extends BaseClass {
	emiCalculatorHomePage emi = new emiCalculatorHomePage(getDriver());
	HomeLoanEMICalculatorPage HomeLoanPageObj = new HomeLoanEMICalculatorPage(getDriver());
	Logger logger = BaseClass.getLogger();
	WriteExcel write = new WriteExcel();
	
	
	@Given("the user scroll to the table")
	public void the_user_scroll_to_the_table() {
		logger.info("---- TestCase_02_DisplayingTheEMIPaymentTable Started ----");
	    // Write code here that turns the phrase above into concrete actions
		emi.scrollToTable();
	   // throw new io.cucumber.java.PendingException();
	}

//--------------------------------------------------------------------------------------------------------------
	
	@Then("the user click on the years")
	public void the_user_click_on_the_years() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		emi.clickOnYears();
	}
	
 //-------------------------------------------------------------------------------------------------------------- 
	
	@And("display the EMI data")
	public void display_the_emi_data() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		emi.printTheEMIPaymentTable();
		logger.info("---- TestCase_02_DisplayingTheEMIPaymentTable Ended ----");
	}
	
 //--------------------------------------------------------------------------------------------------------------	
	
	@Given("the user navigates to HomeLoanPage")
	public void the_user_navigates_to_home_loan_page() {
		logger.info("---- TestCase_03_StoringTheYearTableInExcel Started ----");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		HomeLoanPageObj.navigator();
	}
 
 //--------------------------------------------------------------------------------------------------------------
	
	@Then("the user scroll to table")
	public void the_user_scroll_to_table() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		HomeLoanPageObj.scrollToTable();
	}
	
 //--------------------------------------------------------------------------------------------------------------
	
	@Then("writing data into the excel")
	public void writing_data_into_the_excel() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
        String[][] datas = HomeLoanPageObj.getTableData();
		
		//Writing the data into the excel sheet
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); 	// Timestamp for the excel file
		String fileName = "YearTable" + timeStamp + ".xlsx";
		String path = ".//TestData/" + fileName;
		write.writeExcel(datas, path);
		logger.info("---- TestCase_03_StoringTheYearTableInExcel Ended ----");
	}
	
 
 
}