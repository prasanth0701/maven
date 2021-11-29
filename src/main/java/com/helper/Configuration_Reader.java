package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		File f=new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\src\\main\\java\\com\\properties\\datas.properties");
        FileInputStream fis=new FileInputStream(f);
        p=new Properties();
        p.load(fis);
		
	}
	public String getURL()  {
		
        String url = p.getProperty("URL");
        return url; 
        
        
	}
	public String getName() {
		String name = p.getProperty("name");
		 return name;
		

	}
	public String getPwrd() {
		String password = p.getProperty("pwrd");
		return password;

	}
	public String getLocation() {
		String location = p.getProperty("location");
		 return location;
	}
	public String getHotel() {
		String hotel = p.getProperty("hotel");
		 return hotel;
	}
	public String getRoomtype() {
		String roomtype = p.getProperty("roomtype");
		 return roomtype;
	}
	public String getCheckin() {
		String checkin = p.getProperty("checkin");
		 return checkin;
	}
	public String getCheckout() {
		String checkout = p.getProperty("checkout");
		 return checkout;
	}
	public String getAdultcount() {
		String adultcount = p.getProperty("adultcount");
		 return adultcount;
	}
	public String getChildcount() {
		String childcount = p.getProperty("childcount");
		 return childcount;
	}
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		 return firstname;
	}
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		 return lastname;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		 return address;
	}
	public String getCardnumber() {
		String cardnumber = p.getProperty("cardnumber");
		 return cardnumber;
	}
	public String getCardtype() {
		String cardtype = p.getProperty("cardtype");
		return cardtype;
	}
	public String getCardmonth() {
		String cardmonth = p.getProperty("cardmonth");
		return cardmonth;
	}
	public String getCardyear() {
		String cardyear = p.getProperty("cardyear");
		return cardyear;
	}
	public String getCardcvv() {
		String cardcvv = p.getProperty("cardcvv");
		return cardcvv;
	}
	

}
