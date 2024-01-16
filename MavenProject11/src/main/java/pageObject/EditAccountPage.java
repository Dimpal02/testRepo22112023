package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
	
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[text() = 'Edit Account']")
	WebElement btnEditAcc;
	
	@FindBy (xpath = "//input[@id='input-telephone']")
	WebElement textBoxTelephone;
	
	@FindBy (xpath = "//input[@value = 'Continue']")
	WebElement btnContinue;
	
	public EditAccountPage(WebDriver driver) 
	{

	this.driver = driver;
	PageFactory.initElements(driver,this);   // this keyword used for nonstatic variables
	}
	
	public void EditAcc() throws InterruptedException
	{
		btnEditAcc.click();
		Thread.sleep(2000);
		
		textBoxTelephone.clear();
		
		textBoxTelephone.sendKeys("6666666");
		Thread.sleep(2000);
		btnContinue.click();
		
	}

}
