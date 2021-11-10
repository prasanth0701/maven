package org.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner_Class extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = getBrowser("chrome");
		getURL("http://automationpractice.com/index.php");
		// driver.getTitle();

		POM_Elements a = new POM_Elements(driver);
		clickOnElement(a.getClickcart());
		explicitwait(a.getProceedbutton(), 30);
		explicitwait(a.getCheckoutbutton(), 30);
		inputValueElement(a.getEmail(), "sppras2581@gmail.com");
		clickOnElement(a.getSubmit());

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		WebElement gender = wait2.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		gender.click();

		inputValueElement(a.getFname(), "prasanth");
		inputValueElement(a.getLname(), "sp");
		inputValueElement(a.getPassword(), "868524");

		driver.getTitle();

		selectByIndex(a.getDate(), 27);
		selectByIndex1(a.getMonth(), 3);
		selectByValue(a.getYears(), "1997");

		inputValueElement(a.getCompany(), "Wabco");
		inputValueElement(a.getAddress1(), "7g,rainbow colony");
		inputValueElement(a.getAddress2(), "north street");
		inputValueElement(a.getCity(), "Chennai");

		inputValueElement(a.getPostcode(), "45454");
		selectByVisibleText(a.getState(), "New Jersey");

		inputValueElement(a.getOtherss(), "opposite to theatre");
		inputValueElement(a.getPhone_no(), "8484444546");
		inputValueElement(a.getStreet(), "gandhi nagar");
		clickOnElement(a.getSubmit2());
		clickOnElement(a.getProceed2());

		clickOnElement(a.getCheckboxbutton());
		clickOnElement(a.getProceed3());

		explicitwait(a.getBankwire(), 20);
		System.out.println("---------------");
		clickOnElement(a.getSubmit3());

		sleep();
		maximize();
		getElementText(a.getPurchasestatement());

		sleep();

	}
}
