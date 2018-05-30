

import java.sql.DriverManager;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;


	public class Fileupload2 {

	

	    public static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Documents\\Selenium\\chromedriver.exe"); //add chrome driver path (System.setProperty("webdriver.chrome.drive",chrome driver path which you downloaded)
			 
			driver = new ChromeDriver(); // create object of ChromeDriver
		 
			driver.manage().window().maximize(); // maximize the browser window
		 
			driver.get("http://192.168.2.200:4444/login.aspx");
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Dismiss")).click();

			driver.findElement(By.xpath("//*[@id='Content_UserName']")).sendKeys("HILLCREST001");
			driver.findElement(By.xpath("//*[@id='Content_Password']")).sendKeys("Phytel12!");
			
					
			driver.findElement(By.xpath("//*[@id='Content_btnLogin']")).click(); 
			
			Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//*[@id='primary-links']/ul/li[3]/a/span")).click();

			driver.findElement(By.cssSelector("#primary-links > ul > li:nth-child(3) > a > span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='secondary-links']/ul/li[2]/a/span")).click();
			
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='qrdaFile']")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Automation_file\\Eyeexam2018.zip");
			//driver.findElement(By.xpath("//*[@id='qrdaFile']")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Automation_file\\Eyeexam2_2017.zip");
			//CMS68v6_2017
			//driver.findElement(By.xpath("//*[@id='qrdaFile']")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Automation_file\\CMS68v6_2017.zip");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Next")).click();	
					
			
			Thread.sleep(30000);
			
			//**************************************************************************************
			//****** Check the header table   ******************************************************
			//**************************************************************************************
			int iPOPHeaderCounterValue = 0;
			try {
				 iPOPHeaderCounterValue = Integer.parseInt(driver.findElement(By.xpath("//*[@id='page-view']/div/div[2]/table/tbody/tr/td[2]")).getText());
			} catch (NumberFormatException e) {
			      //Will Throw exception!
			      //do something! anything to handle the exception.
			}
			
			System.out.println("iPOPHeaderCounterValue:" + iPOPHeaderCounterValue);
			
			//**************************************************************************************
			//****** Check the data table   ********************************************************
			//**************************************************************************************
			int iPOPCounter = 0;
			int denomCounter  = 0;
			List<WebElement> trs = driver.findElements(By.xpath("//*[@id='page-view']/div/div[3]/div/table/tbody/tr"));
			//System.out.println(trs.isEmpty());
			
			for (int i = 1; i<= trs.size() ; i++)
			{
			    //'checkbox-green fa fa-2x fa-fw fa-check')]")).getText() ==)
				WebElement iPOPDivElement = getValue(i,6);
				//WebElement denomDivElement = getValue(i,7);
				if ( iPOPDivElement.getAttribute("class").matches("checkbox-green fa fa-2x fa-fw fa-check"))
					iPOPCounter++;
				
				//if (denomDivElement.getAttribute("class").matches("checkbox-green fa fa-2x fa-fw fa-check"))
				//	denomCounter++;
				
			}
			
			System.out.println("Number of IPOP Checked :" + iPOPCounter);
			//System.out.println("Number of Denom Checked :" + denomCounter);
			
		
		
		if (iPOPCounter==  iPOPHeaderCounterValue )
		
		{
			System.out.println("Test case Passed ");
			
		}
		else 
			

		{
			System.out.println("Test case failed ");
			
		}
		}
	
		
			
		public static WebElement getValue(int row, int col) {

		  By css = By.cssSelector("#page-view > div > div.results-pt-container > div > table > tbody > tr:nth-child(" + row + ") > td:nth-child(" + col + ") > div");
		   WebElement myDynamicElement = driver.findElement(css);
		    //WebElement myDynamicElement = (new WebDriverWait(driver, 30))
		    //                .until(ExpectedConditions.visibilityOfElementLocated(css));

		    return myDynamicElement;
		}
}
