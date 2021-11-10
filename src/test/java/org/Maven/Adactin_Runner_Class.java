package org.Maven;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class Adactin_Runner_Class extends Adactin_Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException{
		driver=getBrowser("chrome");
		getURL("https://adactinhotelapp.com/");
		max();
		
		Adactin_POM1_LoginPage a=new Adactin_POM1_LoginPage(driver);
		inputValueElement(a.getName(), "prasanth35");
		inputValueElement(a.getPwrd(), "9976114764");
		clickOnElement(a.getLoginbutton());
		

		Adactin_POM2_RoomBookPage b=new Adactin_POM2_RoomBookPage(driver);
		selectByIndex(b.getLocation(), 3);
  		selectByIndex(b.getHotel(), 3);
		selectByIndex(b.getRoomtype(), 2);
	    clearAndInput(b.getCheckin(), "17/11/2022");
		clearAndInput(b.getCheckout(), "18/11/2022");
		selectByVisibleText(b.getAdultcount(), "4 - Four");
		selectByValue(b.getChildcount(), "1");
		clickOnElement(b.getSubmitbutton());
		clickOnElement(b.getRadiobutton());
		clickOnElement(b.getContinuebutton());
		
		
		Adactin_POM3_RegisterPage c=new Adactin_POM3_RegisterPage(driver);
		inputValueElement(c.getFirstname(), "pras");
		inputValueElement(c.getLastname(), "s");
		inputValueElement(c.getAddress(), "9n,kamala theatre road,chennai");
		inputValueElement(c.getCardnumber(), "4568654856321756");
		selectByIndex(c.getCardtype(), 2);
		selectByIndex(c.getCardmonth(), 8);
		selectByVisibleText(c.getCardyear(), "2022");
		inputValueElement(c.getCardcvv(), "700");
		clickOnElement(c.getBooknowbutton());
		explicitWait(c.getItiner(),30);
		explicitWait(c.getCheckboxbutton1(), 30);
		explicitWait(c.getCheckboxbutton2(),30);
		explicitWait(c.getCancelbutton(),30);
		
		explicitWaitForAlert(20);
		alertAccept();
		screenshot();
		clickOnElement(c.getLogoutbutton());

	}	
}
