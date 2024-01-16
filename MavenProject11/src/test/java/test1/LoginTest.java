package test1;

import org.testng.annotations.Test;




public class LoginTest extends BaseTest {
	
	@Test
	public void performLoginTest() throws InterruptedException
	{
		
//		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.login();
		 loginPageObject.logout();

		
	}
	
	
	
	
	

}
