package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Class {
	@Test
	private void username_Validation() {
		String enteredusername="prasanth";
		String actual_username="prasanth";
	    Assert.assertEquals(actual_username, enteredusername);

	}
	@Test
	private void password_Validation() {
    	String enteredpassword="praz25";
    	String actual_password="praz253";
	    Assert.assertEquals(actual_password, enteredpassword);

	
	}

}
