package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class About {
	//String driverPath = "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe";
	 
			public WebDriver driver;
			
			@Test(priority = 1)
		 
			public void AppLaunch() {
		 
				System.setProperty("webdriver.chrome.driver", "C:\\Browsedrivers\\chromedriver.exe");
		 
				driver = new ChromeDriver();
		 
				driver.manage().window().maximize();
		 
				driver.get("https://saucelabs.com/");
		 
			}
			
			@Test(priority = 2)
			 
			public void ProductsPlatform() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='Resources for devs & testers']")).click();
		  
			}
			
			@Test(priority = 3)
			 
			public void ProductsPlatform2() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		  
			}
			
			@Test(priority = 4)
			 
			public void ProductsPlatform3() {
		 
				driver.findElement(By.xpath("//span[text()='Resources for devs & testers']")).click();
				//driver.findElement(By.xpath("//span[text()='Developers']")).click();
				driver.findElement(By.xpath("//span[text()='Changelog']")).click();
		  
			}
			
			@Test(priority = 5)
			 
			public void ProductsPlatform4() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='Support']")).click();
		  
			}
			
			@Test(priority = 6)
			 
			public void ProductsPlatform5() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='FAQs']")).click();
		  
			}
	        
			@Test(priority = 7)
			 
			public void ProductsPlatform6() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='Quickstart guides']")).click();
		  
			}
			
			@Test(priority = 8)
			 
			public void ProductsPlatform7() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='Selenium']")).click();
		  
			}
			
			@Test(priority = 9)
			 
			public void ProductsPlatform8() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='Appium']")).click();
		  
			}
			
			@Test(priority = 10)
			 
			public void ProductsPlatform9() {
		 
				driver.findElement(By.xpath("//span[text()='Developers']")).click();
		 
				driver.findElement(By.xpath("//span[text()='Cypress']")).click();
			}

}
