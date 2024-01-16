package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddressPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Address Book']")
	WebElement btnAddressBook;
	
	@FindBy (xpath = "//a[contains(@class,'btn btn-info')]")
	WebElement btnEdit;
	
	@FindBy (xpath = "//input[@id='input-address-1']")
	WebElement textBoxAddress;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement btnContinue;
	
	public EditAddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void editAddress() throws InterruptedException
	{
		btnAddressBook.click();
		Thread.sleep(1000);
		
		btnEdit.click();
		Thread.sleep(1000);
		
		textBoxAddress.clear();
		
		textBoxAddress.sendKeys("Katol Road");
		Thread.sleep(1000);
		
		btnContinue.click();	
		
	}
	

}
