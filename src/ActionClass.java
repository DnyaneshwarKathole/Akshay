import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		WebElement close_button=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		if(close_button.isDisplayed())
			close_button.click();
		
		WebElement login=driver.findElement(By.xpath("(//div[@class='_1jcwFN _3dmQRh'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(login).perform();
	
	}

}
