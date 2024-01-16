package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pageObject.EditAccountPage;
import pageObject.EditAddressPage;
import pageObject.EditPassword;
import pageObject.LoginPageObject;

public class BaseTest {
	
	static WebDriver driver;
	LoginPageObject loginPageObject;
	EditPassword editPassword;
	EditAccountPage editAccount;
	EditAddressPage editaddress;
	
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\DimpalTestingStudyMaterial\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		loginPageObject.login();
		Thread.sleep(2000);
	}
	
	@BeforeClass
	public void initobjects()
	{
		
		 loginPageObject = new LoginPageObject(driver);
		 editAccount = new EditAccountPage(driver);
		 editPassword = new EditPassword(driver);
		 editaddress = new EditAddressPage(driver);

	}
	
	@AfterMethod(alwaysRun=true)
	public void logout() throws InterruptedException
	{
		
	 loginPageObject.logout();
	 Thread.sleep(2000);

	}
	
	@AfterSuite(alwaysRun=true)
	public void  tearDown()
	{
		driver.quit();
	}
		
}
