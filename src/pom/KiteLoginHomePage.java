package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginHomePage {

	@FindBy(xpath="//span[text()='KV']") private WebElement UP;
	
	public KiteLoginHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUPKiteLoginHomePage() {
		if(UP.isDisplayed()) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
	}
	
}
