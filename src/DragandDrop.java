import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);

		WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		//act.dragAndDrop(source, dest).perform();
		
		//act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		
		
	}

}
