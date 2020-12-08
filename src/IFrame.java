import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame{

	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver","G://program//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.w3school.com/iframetutorial");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id
				
				
				("1234")).click();

		driver.findElement(By.id("iframeResult")).click();
		driver.findElement(By.id("1234")).click();

		driver.switchTo().frame(driver.findElement(By.id("1234")));
		driver.findElement(By.id("1234")).click();

		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}