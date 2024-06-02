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
public class About2 {
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
		 
		public void Platform1() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='Explore & learn']")).click();
	  
		}
		
		@Test(priority = 3)
		 
		public void Platform2() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='Blog']")).click();
	  
		}
		
		@Test(priority = 4)
		 
		public void Platform3() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='Webinars']")).click();
	  
		}
		
		@Test(priority = 5)
		 
		public void Platform4() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='Videos']")).click();
	  
		}
		
		@Test(priority = 6)
		 
		public void Platform5() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='Reports']")).click();
	  
		}

		
		@Test(priority = 7)
		 
		public void Platform6() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='Why Sauce Labs?']")).click();
	  
		}
		
		@Test(priority = 8)
		 
		public void Platform7() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='Discover by topic']")).click();
	  
		}
		
		@Test(priority = 9)
		 
		public void Platform8() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='What’s new']")).click();
	  
		}
		
		@Test(priority = 10)
		 
		public void Platform9() {
	 
			driver.findElement(By.xpath("//span[text()='Resources']")).click();
	 
			driver.findElement(By.xpath("//span[text()='White papers']")).click();
	  
		}
		
}
