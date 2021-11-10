package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_POM2_RoomBookPage {
	public WebDriver driver;
	public Adactin_POM2_RoomBookPage(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement location;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofroom() {
		return numberofroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultcount() {
		return adultcount;
	}

	public WebElement getChildcount() {
		return childcount;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement numberofroom;
	

	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultcount;
	
	@FindBy(id="child_room")
	private WebElement childcount;
	
	@FindBy(id="Submit")
	private WebElement submitbutton;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	

}
