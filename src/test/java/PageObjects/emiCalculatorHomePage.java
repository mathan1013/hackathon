package PageObjects;
 import Factory.BaseClass;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
public class emiCalculatorHomePage extends BasePage{
	
	//public WebDriver driver;
	
	
	
	public emiCalculatorHomePage(WebDriver driver) 
	{
		super(driver);
	}
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	
	//*********************************Web Elements For EmiCalculators Page*********************************//
	
	//EMI Calculator Element
	@FindBy(xpath = "//a[@title = 'EMI Calculator']")
	WebElement emiCalcBtn;
	
	//Car Loan Element
	@FindBy(id = "car-loan")
	WebElement carLoan;
	
	//Car Loan Amount Text Box
	@FindBy(id = "loanamount")
	WebElement carLoanAmtTextBox;
	
	//Loan Interest Text Box
	@FindBy(id = "loaninterest")
	WebElement intRateTextBox;
	
	//Loan Tenure Slider
	@FindBy(xpath = "//*[@id='loantermslider']/span")
	WebElement loanTenSlider;
	
	//Loan Tenure Year Button
	@FindBy(xpath = "//label[@class = 'btn btn-secondary active']/input[@id = 'loanyears']")
	WebElement year;
	
	//Year 2024 in the table
	@FindBy(xpath = "//td[@id = 'year2024']")
	WebElement year2024;
	
	//Year 2025 in the table
	@FindBy(xpath = "//td[@id = 'year2025']")
	WebElement year2025;
	
	//Months of 2024
	@FindBy(xpath = "//tr[@id = 'monthyear2024']/td/div/table/tbody/tr")
	List<WebElement> months2024;
	
	//Months of 2025
	@FindBy(xpath = "//tr[@id = 'monthyear2025']/td/div/table/tbody/tr")
	List<WebElement> months2025;
	
	//*********************************Actions and Methods For EmiCalculators Page*********************************//
	
	//Navigator for the page
	public void navigator() {
		emiCalcBtn.click();
	}
	//Clicking on the car loan element
	public void clickCarLoan() {
		carLoan.click();
	}
	//Sending value to the Loan Amount Text Box
	public void setLoanAmt(String amt) {
		//js.executeScript("arguments[0].value=\""+amt+"\"",carLoanAmtTextBox);
		carLoanAmtTextBox.clear();
		carLoanAmtTextBox.sendKeys(amt);
	}
	//Sending value to the Loan Interest Text Box
	public void setInterest(String interest) {
		js.executeScript("arguments[0].value=\""+interest+"\"", intRateTextBox);
		//intRateTextBox.clear();
		//intRateTextBox.sendKeys(interest);
	}
	//Sliding the Loan Tenure Slider
	public void moveLoanTenureSlider(int x) {
		//js.executeScript("arguments[0].scrollIntoView(true)", loanTenSlider);
		Actions act = new Actions(driver);
		act.moveToElement(loanTenSlider);
		act.perform();
		
		act.dragAndDropBy(loanTenSlider,x,0).build().perform();
	}
	//Clicking on Loan Tenure Year Button
	public void clickOnYear() {
		js.executeScript("arguments[0].click();", year);
	
	}
	//Scrolling to the Table Element
	public void scrollToTable() {
		//js.executeScript("arguments[0].scrollIntoView();", year2024);
		Actions act = new Actions(driver);
		act.moveToElement(year2024);
		act.perform();
	}
	//Clicking on 2024 and 2025
		public void clickOnYears() {
			js.executeScript("arguments[0].click();", year2024);
			//year2024.click();
			js.executeScript("arguments[0].click();", year2025);
			
			
		}
	//Printing the EMI Payment Table
	public void printTheEMIPaymentTable() {
		int cols = 3;
		//Printing the row of year 2024
		
		for(int j = 0; j < cols; j++) {
			System.out.print(driver.findElement(By.xpath("//tbody/tr[@class = "
							+ "'row no-margin yearlypaymentdetails'][1]/"
							+ "td["+(j + 1)+"]\t")).getText());
		}
		System.out.println(); //Moving the cursor to next line
		//Printing the rows of months under year 2024
		for(int i = 0; i < months2024.size(); i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(driver.findElement(By.xpath("//tr[@id = "
								+ "'monthyear2024']/td/div/table/tbody/tr["+(i+1)+"]/"
								+ "td["+(j+1)+"]\t")).getText());
			}
			System.out.println();
		}
		//Printing the row of year 2025
		for(int j = 0; j < cols; j++) {
			System.out.print(driver.findElement(By.xpath("//tbody/tr[@class = "
							+ "'row no-margin yearlypaymentdetails'][2]/td["+(j + 1)+"]"
							+ "\t")).getText());
		}
		System.out.println(); //Moving the cursor to next line
		//Printing the rows of months under year 2025
		for(int i = 0; i < months2025.size(); i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(driver.findElement(By.xpath("//tr[@id = 'monthyear2025']/td/div/table/tbody/tr["+(i+1)+"]/td["+(j+1)+"]\t")).getText());
			}
			System.out.println();
		}
		Actions act = new Actions(driver);
		act.moveToElement(year2025);
		act.perform();
	}
}
