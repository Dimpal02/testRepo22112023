package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class EditPassword {
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Password']")
	WebElement btnPassword;

	
	@FindBy (xpath = "//input[@id='input-password']")
	WebElement textPassword;

	
	@FindBy (xpath = "//input[@id='input-confirm']")
	WebElement textPasswordConf;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement btnContinue;

	@FindBy(xpath = "//i[text()='Success: Your password has been successfully updated']")
	WebElement Successmsg;
	
	public EditPassword(WebDriver driver) 
	{

	this.driver = driver;
	PageFactory.initElements(driver,this);   // this keyword used for nonstatic variables
	}
	
	public void editPW() throws InterruptedException
	{
		btnPassword.click();
		Thread.sleep(2000);
		
		textPassword.sendKeys("selenium");
		Thread.sleep(2000);
		
		textPasswordConf.sendKeys("selenium");
		Thread.sleep(2000);
		
		btnContinue.click();
		
	
		

	//	WebElement msg = driver.findElement(By.xpath("//i[text()='Success: Your password has been successfully updated']")); 
	//	Assert.assertTrue(Successmsg.isDisplayed());

	
	}
	
	
	
}
