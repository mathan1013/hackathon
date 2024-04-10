package Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class AddFluentWait {
	public FluentWait<WebDriver> wait;
	
	//Common Wait for all Pages
	// Waiting for the Menu button on the HomePage
	public void waitForMainMenu(WebDriver driver) {
		wait = new FluentWait<WebDriver> (driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("menu-item-dropdown-2696")));
	}
	
	
	// 1.Wait methods for the HomeLoanEMICalculatorPage
	// Waiting for the Table to load on the Home Loan EMI Calculator Page
	public void waitForTheTable(WebDriver driver) {
		wait = new FluentWait<WebDriver> (driver);
		wait.withTimeout(Duration.ofSeconds(25));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class = 'noextras']/tbody/tr[@class = 'row no-margin yearlypaymentdetails']")));
	}
	
	
	
	// 2.Wait methods for the InterestAmountForCurrentYearPage
	// Waiting for the Car Loan in the Interest Amount For Current Year page
	public void waitForTheCarLoan(WebDriver driver) {
		wait = new FluentWait<WebDriver> (driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("car-loan")));
	}
	
	
	// 3.Wait Methods for the LoanCalculatorPage
	// Waiting for the Fields
	public void waitForTheTextBoxAndSlider(WebDriver driver) {
		wait = new FluentWait<WebDriver> (driver);
		wait.withTimeout(Duration.ofSeconds(25));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class = 'sep toggle-visible']"))));
	}
}
