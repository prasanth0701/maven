package com.testng;

import java.io.IOException;

import org.Maven.Adactin_Runner_Class;
import org.Maven.Base_Class;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_manager_Adactin;

public class TestNG_Adactin extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_manager_Adactin pom = new Page_Object_manager_Adactin(driver);
	static Logger log=Logger.getLogger(Adactin_Runner_Class.class);

	@Test(priority = 3)
	private void log4j() {
		PropertyConfigurator.configure("log4j.properties");

		log.info("Automation Session started");

		log.info("Initiating url");
	}
	String data[]= 
			{"https://adactinhotelapp.com/"};
	
	
	@DataProvider(name="url")
	private String[] data() {
      return data;
	}
	

	@Test(priority = -2,dataProvider = "url")
	private void launch_Browser(String url) throws Throwable {
		//String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);
		maximize();
	}
	@Test(priority=-1,dependsOnMethods = "launch_Browser")
	@Parameters({"Name","Password"})
	private void adactin_Signin(String name,String pwrd) throws Throwable {
		//String name = Particular_Data_From_Excel("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\Excel\\Adactin test case.xlsx", 1, 5);
        inputValueElement(pom.getInstanceLp().getName(), name);
		//String pwrd = Particular_Data_From_Excel("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\Excel\\Adactin test case.xlsx", 2, 5);
		inputValueElement(pom.getInstanceLp().getPwrd(), pwrd);
		clickOnElement(pom.getInstanceLp().getLoginbutton());
	}
	@Test(dependsOnMethods = "adactin_Signin")
	private void hotel_Booking() throws Throwable {
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		Dropdown("byIndex", pom.getInstanceRbp().getLocation(), location);

		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		Dropdown("byIndex", pom.getInstanceRbp().getHotel(), hotel);

		String roomtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomtype();
		Dropdown("byIndex", pom.getInstanceRbp().getRoomtype(), roomtype);

		String checkin = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckin();
		clearAndInput(pom.getInstanceRbp().getCheckin(), checkin);

		String checkout = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckout();
		clearAndInput(pom.getInstanceRbp().getCheckout(), checkout);

		String adultcount = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdultcount();
		selectByVisibleText(pom.getInstanceRbp().getAdultcount(), adultcount);

		String childcount = File_Reader_Manager.getInstanceFRM().getInstanceCR().getChildcount();
		selectByValue(pom.getInstanceRbp().getChildcount(), childcount);

		clickOnElement(pom.getInstanceRbp().getSubmitbutton());
		clickOnElement(pom.getInstanceRbp().getRadiobutton());
		clickOnElement(pom.getInstanceRbp().getContinuebutton());
	}
	@Test(priority = 1)
	private void registration_Process() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		inputValueElement(pom.getInstanceRp().getFirstname(), firstname);

		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		inputValueElement(pom.getInstanceRp().getLastname(), lastname);

		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		inputValueElement(pom.getInstanceRp().getAddress(), address);

		String cardnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardnumber();
		inputValueElement(pom.getInstanceRp().getCardnumber(), cardnumber);

		String cardtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardtype();
		Dropdown("byIndex", pom.getInstanceRp().getCardtype(), cardtype);

		String cardmonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardmonth();
		Dropdown("byIndex", pom.getInstanceRp().getCardmonth(), cardmonth);

		String cardyear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardyear();
		selectByVisibleText(pom.getInstanceRp().getCardyear(), cardyear);

		String cardcvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardcvv();
		inputValueElement(pom.getInstanceRp().getCardcvv(), cardcvv);

		clickOnElement(pom.getInstanceRp().getBooknowbutton());
		
}
	@Test(priority=2)
	private void itener_Logout() throws IOException {
		explicitWait(pom.getInstanceRp().getItiner(), 30);
		explicitWait(pom.getInstanceRp().getCheckboxbutton1(), 30);
		explicitWait(pom.getInstanceRp().getCheckboxbutton2(), 30);
		explicitWait(pom.getInstanceRp().getCancelbutton(), 30);

		explicitWaitForAlert(20);
		alertAccept();
		screenshot();
		clickOnElement(pom.getInstanceRp().getLogoutbutton());
		

	}

}
