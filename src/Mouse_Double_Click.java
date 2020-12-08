import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement dbl_Click=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		//act.moveToElement(dbl_Click).doubleClick().perform();
		
		act.doubleClick(dbl_Click).perform();
		
		

	}

}
