package com.wordpress.Testcases;

import com.wordpress.Common.Driver;
import com.wordpress.pages.LoginPage;

public class VerifyPrimarylink {
	
	public VerifyPrimarylink(){}
	
	public void verify() throws InterruptedException 
	{	
		
		LoginPage login = new LoginPage();
		login.typeUsername();
		login.typePassword();
		login.clickOnLoginButton();
		Thread.sleep(2000);
		login.clickOnprimarylink();
		
		
		login.exit();
	}

}


