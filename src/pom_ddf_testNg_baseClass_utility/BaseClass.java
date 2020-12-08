package pom_ddf_testNg_baseClass_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	public void openBrowser() {
		System.setProperty("", "");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
	}

}
