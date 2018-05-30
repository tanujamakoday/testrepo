import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class patientmgmt {

	
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Documents\\Selenium\\chromedriver.exe"); //add chrome driver path (System.setProperty("webdriver.chrome.drive",chrome driver path which you downloaded)
			 
			WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
		 
			driver.manage().window().maximize(); // maximize the browser window
		 
			driver.get("http://192.168.2.200:4444/login.aspx");

			driver.findElement(By.xpath("//*[@id='Content_UserName']")).sendKeys("HILLCREST001");
			driver.findElement(By.xpath("//*[@id='Content_Password']")).sendKeys("Phytel12!");
			
					
			driver.findElement(By.xpath("//*[@id='Content_btnLogin']")).click(); 
			
			Thread.sleep(2000);
					
			//driver.findElement(By.linkText("Dismiss")).click();
	        //driver.findElement(By.id("cntphContent_divCollapsiblePanelToggle")).click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='primary-links']/ul/li[3]/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='secondary-links']/ul/li[1]/a/span")).click();
			driver.findElement(By.id("cntphContent_divCollapsiblePanelToggle")).click();
			Thread.sleep(2000);
			//driver.findElement(By.id("ctl00_cntphContent_comboFilterFieldMainFiltersCondition_Arrow")).click();
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("ctl00_cntphContent_comboFilterFieldMainFiltersCondition_Input")).sendKeys("value","HCC: Codes Met");
		
		
		driver.findElement(By.id("ctl00_cntphContent_comboFilterFieldMainFiltersCondition_Input")).click();
		Thread.sleep(200);
		
		String searchText = "HCC: Codes Met";
		
		//*******************************************************************
		//****Use any of the following 3 methods *********
		//*******************************************************************
		WebElement dropdown= driver.findElement(By.xpath("//*[@id='ctl00_cntphContent_comboFilterFieldMainFiltersCondition_DropDown']/div/ul"));
		
		//WebElement dropdown = driver.findElement(By.xpath("//ul[@class='rcbList']"));
		//WebElement dropdown = driver.findElement(By.cssSelector("#ctl00_cntphContent_comboFilterFieldMainFiltersCondition_DropDown > div > ul"));
		//*******************************************************************
		
		
		List<WebElement> listofLI = dropdown.findElements(By.tagName("li"));
		
		for (WebElement option : listofLI)
		{
		    if (option.getText().equals(searchText))
		    {
		        option.click(); // click the desired option
		        break;
		    }
		}
		
		driver.findElement(By.id("ctl00_cntphContent_comboFilterFieldMainFiltersCondition_Input")).click();
		
		Thread.sleep(200);
		
		String searchText1 = "Is not empty";
				
		dropdown= driver.findElement(By.xpath("//*[@id='ctl00_cntphContent_comboFilterArgumentMainFiltersCondition_DropDown']/div/ul"));
		
		Thread.sleep(200);
				
		listofLI = dropdown.findElements(By.tagName("li"));
		
		for (WebElement option : listofLI) // for (int i=0;i<list.size();i++)
		{
		    if (option.getText().equals(searchText1))
		    {
		        option.click(); // click the desired option
		        break;
		    }
		}
		
		//Select dropdown1 = new Select(driver.findElement(By.id("ctl00_cntphContent_comboFilterFieldMainFiltersAlert_Input")));
		
		//dropdown1.selectByVisibleText("condition");
		driver.findElement(By.id("cntphContent_btnRunQuery")).click();
					
		}

	}





