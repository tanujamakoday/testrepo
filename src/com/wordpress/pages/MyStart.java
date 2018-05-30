package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wordpress.Testcases.VerifyPrimarylink;

public class MyStart {

	public static void main(String[] args) {
		try{
			
					
			VerifyPrimarylink myplink = new VerifyPrimarylink();
			myplink.verify();
		}
		catch(Exception ex)
		{
			
		}
	}

}
