package ddf_pom_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class KiteLoginHomePage {

	@FindBy(xpath="//span[text()='KV']") private WebElement UP;
	
	public KiteLoginHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUPKiteLoginHomePage() {
		if(UP.isDisplayed()) {
			Reporter.log("pass");
		}
		else {
			Reporter.log("failed");
		}
	}
	
}
