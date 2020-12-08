
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:\\www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https:\\www.youtube.com");
		Thread.sleep(2000);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("https:\\www.youtube.com")).sendKeys(selectLinkOpeninNewTab);
		String selectLinkOpeninNewTab2 = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("https:\\\\www.youtube.com")).sendKeys(selectLinkOpeninNewTab2);
		driver.close();
		String selectLinkOpeninNewTab3 = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("http:\\www.google.com")).sendKeys(selectLinkOpeninNewTab3);
		Thread.sleep(2000);
		driver.quit();
		

	}

}



