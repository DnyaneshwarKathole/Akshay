package pomwithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//button[text()='Login ']") private WebElement login;
	
	public KiteLogin1Page(WebDriver driver) {		
		PageFactory.initElements(driver, this);		
	}
	
	public void setUNKiteLoginPage(String username) {
		UN.sendKeys(username);
	}
	
	public void setPwdKiteLoginPage(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void clickLoginKiteLoginPage() {
		login.click();
	}
	
}
