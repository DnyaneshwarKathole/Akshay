package failedTC;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ExcuteFailedTC {
	
	@Test
	public void TC1() {
		System.out.println("TC1");
		Reporter.log("TC1");
	}
	
	@Test
	public void TC2() {
		System.out.println("TC2");
		Reporter.log("TC1");
	}
	
	@Test
	public void TC3() {
		//Assert.fail();
		System.out.println("TC3");
		Reporter.log("TC1");
	}

}
