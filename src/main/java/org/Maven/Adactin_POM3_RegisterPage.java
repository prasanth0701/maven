package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_POM3_RegisterPage {
	public WebDriver driver;
	public Adactin_POM3_RegisterPage(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(abc, this);
		
	}
	@FindBy(id="first_name")
	private WebElement firstname;

	@FindBy(id="last_name")
	private WebElement lastname;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardcvv() {
		return cardcvv;
	}

	public WebElement getBooknowbutton() {
		return booknowbutton;
	}

	public WebElement getItiner() {
		return itiner;
	}

	public WebElement getCheckboxbutton1() {
		return checkboxbutton1;
	}

	public WebElement getCheckboxbutton2() {
		return checkboxbutton2;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cardmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cardyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cardcvv;
	
	@FindBy(id="book_now")
	private WebElement booknowbutton;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement itiner;
	
	@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]")
	private WebElement checkboxbutton1;
	
	@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1]")
	private WebElement checkboxbutton2;

	@FindBy(name="cancelall")
	private WebElement cancelbutton;
	
	@FindBy(id="logout")
	private WebElement logoutbutton;
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	

}
