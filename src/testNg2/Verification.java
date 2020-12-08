package testNg2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Verification {
	
	@Test
	public void TC1() {
		Reporter.log("Running TC1..");
		String act="abc";
		String exp="xyz";
		Assert.assertEquals(act,exp);
	}
	
	public void TC2() {
		Reporter.log("Running TC2..");
	}

}
