package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	
	
	// Variables
	WebDriver driver;
	

	
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement textBoxUserName;
	
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement textBoxPassword;
	
	@FindBy (xpath = "//input[@value='Login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//a[contains(@title,'My Account')]")
	WebElement btnMyAccount;
	
	@FindBy(xpath = "(//a[text()='Logout'])[1]")
	WebElement btnLogout;
	
	@FindBy (xpath = "//a[text()='Login']")
	WebElement dropdownbtnLogin;
	
	

	// Constructor
	
	public LoginPageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);   // this keyword used for nonstatic variables
	}
	
	// Methods
	
	public void login() throws InterruptedException
	{
		btnMyAccount.click();
		Thread.sleep(2000);
		
		dropdownbtnLogin.click();
		//Reporter.Log("Login form displayed",true);
		
		textBoxUserName.sendKeys("dimpal.th@gmail.com");
		Thread.sleep(2000);
		
		textBoxPassword.sendKeys("selenium");
		Thread.sleep(2000);
		
		btnLogin.click();
		Thread.sleep(2000);
			
	}
	
	public void logout() throws InterruptedException
	{
		
		btnMyAccount.click();
		Thread.sleep(2000);
	
		btnLogout.click();
		Thread.sleep(2000);    
		
	}
	
	
}
