	import org.junit.Test;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		
public class test {
	
			public static void main(String[] args)
			{
				System.setProperty("Webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\Selenium"); //declaring to open chromedriver - System.setProperty(key, Value)
				WebDriver driver = new ChromeDriver(); // driver object access all the webdriver functions.
				driver.manage().window().maximize();
				driver.get("www.facebook.com");
				
			}


	}


