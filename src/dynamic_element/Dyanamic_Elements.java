package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G://Program//chromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement close_button=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		if(close_button.isDisplayed())
			close_button.click();
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("redmi note 7 pro");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		Thread.sleep(10000);
		String st=driver.findElement(By.xpath("(//div[@class='col col-7-12'])[2]/div[2]/span[2]/span/span[3]")).getText();
		
		System.out.println(st);
		
		//String exp_spec="";
		
		
		
		
		
		
		
		

	}

}
