package pomwithTestNG

;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\kiteData.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet1");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "g://Program//chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://kite.zerodha.com");
		KiteLogin1Page login1=new KiteLogin1Page(driver);
		KiteLogin2Page login2=new KiteLogin2Page(driver);
		KiteLoginHomePage homepage=new KiteLoginHomePage(driver);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String username=sheet.getRow(0).getCell(0).getStringCellValue();
		login1.setUNKiteLoginPage(username);
		
		String pass=sheet.getRow(0).getCell(1).getStringCellValue();
		login1.setPwdKiteLoginPage(pass);
		
		login1.clickLoginKiteLoginPage();
		
		String pin=sheet.getRow(0).getCell(2).getStringCellValue();
		login2.setPinKiteLogin2Page(pin);
		
		login2.clickContinueKiteLogin2Page();
		
		homepage.verifyUPKiteLoginHomePage();
		
		
	}
}
