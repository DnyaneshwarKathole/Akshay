package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("open to browser");
	}
	
	@BeforeMethod
	public void LoginToApp() {
		System.out.println("Login To Application");
	}
	
	
	@Test
	public void TC1() {
		System.out.println("Running TC1...");
	}
	
	@Test
	public void TC2() {
		System.out.println("Runninng TC2...");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logout application");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("To closed browser");
	}

}
