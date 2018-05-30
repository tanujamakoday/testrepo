/**
 * 
 */
package com.wordpress.Testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
import com.wordpress.pages.LoginPage;


/**
 * @author tmakoda
 *
 */
public class VerifywordpressLogin {

	@Test
	public void verifyValidLogin() throws InterruptedException
	
	{
			
	LoginPage login = new LoginPage();
	login.typeUsername();
	login.typePassword();
	login.clickOnLoginButton();
	Thread.sleep(200);
	
	//driver.quit();
	}
	
}
