import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Sai/Desktop/webtables.html");
		List<WebElement> row= driver.findElements(By.xpath("//table[@id='135']//tbody//tr"));
		
		
		//driver.manage()
		System.out.println(row.size());
		
		String name="Smith";
		
		for(int i=2;i<=row.size();i++) {
			
			int col= driver.findElements(By.xpath("//table[@id='135']//tbody//tr["+i+"]//td")).size();
			for(int j=1;j<=col;j++) {
				
				String st2=driver.findElement(By.xpath("//table[@id='135']//tbody//tr["+i+"]//td["+j+"]")).getText();
				
				if(name.equals(st2)) {
					System.out.println(name+" Data found in Webtables at row no "+i+" column no "+j);
					break;
				}
				
			}
			//System.out.println();
			
			
		}
		
	}
	
	
	
	

}
