/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author tmakoda
 *
 */
public class LoginPage  //Class which contains method
{
	
	WebDriver driver ;
	
	//elements : locators for identifying elements
	
	By username = By.id("Content_UserName");
	By password = By.xpath("//*[@id='Content_Password']");
	By loginButton = By.id("Content_btnLogin");
	By Primarylink = By.xpath("//*[@id='primary-links']/ul/li[3]/a/span");
	By Secondarylink = By.xpath("//*[@id='secondary-links']/ul/li[1]/a/span");
	


	
	public LoginPage()//constructor name 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Documents\\Selenium\\chromedriver.exe"); //add chrome driver path (System.setProperty("webdriver.chrome.drive",chrome driver path which you downloaded)
		driver = new ChromeDriver(); // create object of ChromeDriver
		driver.manage().window().maximize(); // maximize the browser window
	 	driver.get("http://192.168.2.200:4444/Login.aspx");
		
	}
	
	
	public void typeUsername()  //Method for username
	{
		driver.findElement(By.id("Content_UserName")).sendKeys("HILLCREST001");
	}
	
	public void typePassword() //Method  for password
	{
		driver.findElement(password).sendKeys("Phytel12!");
	}
	
	public void clickOnLoginButton() //Method for loginbutton
	{
		driver.findElement(loginButton).click();
	}
	
	public void clickOnprimarylink()
	{
		driver.findElement(Primarylink).click();
	}
	
	public void clickOnsecondarylink()
	{
		driver.findElement(Secondarylink).click();
	}

	public void exit() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	

}
