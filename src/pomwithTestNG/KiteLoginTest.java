package pomwithTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest {
	WebDriver driver;
	Sheet sh;
	
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteLoginHomePage homepage;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		 FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\kiteData.xlsx");
		 sh=WorkbookFactory.create(file).getSheet("Sheet1");
		 System.setProperty("webdriver.chrome.driver", "g://Program//chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
	     driver=new ChromeDriver(options);
		 driver.get("https://kite.zerodha.com");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 login1= new KiteLogin1Page(driver);
		 login2 =new KiteLogin2Page (driver);
		 homepage =new KiteLoginHomePage(driver);
	}
	@BeforeMethod
	public void loginToApp()
	{
		login1.setUNKiteLoginPage(sh.getRow(0).getCell(0).getStringCellValue());
		login1.setPwdKiteLoginPage(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickLoginKiteLoginPage();
		
		login2.setPinKiteLogin2Page(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickContinueKiteLogin2Page();
	}
	@Test
	public void logoutFromApp()
	{
		
	}
	@AfterClass
	public void closeBrowser()
	{
		login1=null;
		login2=null;
		homepage=null;
		driver.close();
		
	}
	
	

}
