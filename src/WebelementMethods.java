import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement un= driver.findElement(By.id("email"));
		String text=un.getText();
		System.out.println(text);
		boolean b=un.isEnabled();
		System.out.println(b);
		boolean b1=un.isDisplayed();
		System.out.println(b1);
		
		

	}

}
