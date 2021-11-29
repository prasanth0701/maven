package org.lao.testng;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

public class P10_Assertion {
	String name="john";
	Boolean value=false;
	
	@Test
	private void checkEquals() {
	Assert.assertEquals(name, "john");

	}
	
}
