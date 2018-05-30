import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeTest {
 
public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Documents\\Selenium\\chromedriver.exe"); //add chrome driver path (System.setProperty("webdriver.chrome.drive",chrome driver path which you downloaded)
 
	WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
 
	driver.manage().window().maximize(); // maximize the browser window
 
	driver.get("http://192.168.2.200:4444/Login.aspx");

	driver.findElement(By.xpath("//*[@id='Content_UserName']")).sendKeys("HILLCREST001");
	driver.findElement(By.xpath("//*[@id='Content_Password']")).sendKeys("Phytel12!");
	//driver.findElement(By.xpath("//*[@id='m-popup']/div[2]/div[3]/div[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='Content_btnLogin']")).click();    
	//Thread.sleep(200); //used thread for hold process
	driver.findElement(By.xpath("//*[@id='m-popup']/div[2]/div[3]/div[1]/a")).click();
	//Thread.sleep(200);
	driver.findElement(By.xpath("//*[@id='primary-links']/ul/li[3]/a/span")).click();
	Thread.sleep(200); //used thread for hold process

driver.findElement(By.xpath("//*[@id='secondary-links']/ul/li[2]/a/span")).click();
	Thread.sleep(2000); //used thread for hold process
//driver.quit(); //for close browser
	}
}