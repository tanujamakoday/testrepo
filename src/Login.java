//import org.eclipse.jdt.internal.jar
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
 
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Documents\\Selenium\\chromedriver.exe"); //add chrome driver path (System.setProperty("webdriver.chrome.drive",chrome driver path which you downloaded)
 
WebDriver driver = new ChromeDriver(); // create object of ChromeDriver
 
driver.manage().window().maximize(); // maximize the browser window
 
driver.get("http://opensource.demo.orangehrmlive.com/"); //enter url
 
driver.findElement(By.id("txtUsername")).sendKeys("admin"); //type textbox's id or name or any locater along with data in sendkeys
 
driver.findElement(By.id("txtPassword")).sendKeys("admin");
 
driver.findElement(By.id("btnLogin")).click();
 
Thread.sleep(2000); //used thread for hold process
 
driver.quit(); //for close browser
}
}