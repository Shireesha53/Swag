package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class About1 {

	//String driverPath = "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe";
	 
	public WebDriver driver;
	
	@Test(priority = 1)
 
	public void AppLaunch() {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Browsedrivers\\chromedriver.exe");
 
		driver = new ChromeDriver();
 
		driver.manage().window().maximize();
 
		driver.get("https://www.saucedemo.com/");
 
	}
 
	@Test(priority = 2)
	 
	public void EnterLoginDetails() {
 
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
 
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
 
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
 
	}
 
	@Test(priority = 3)
 
	public void MenuAboutUsClick() throws ElementClickInterceptedException {
 
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
        //driver.findElement(By.linkText("about")).click();
		driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]")).click();

	}
 
	@Test(priority = 4)
 
	public void ProductsPlatform() {
 
		driver.findElement(By.xpath("//span[text()='Products']")).click();
 
		driver.findElement(By.xpath("//span[text()='Platform for Test']")).click();
  
	}

	@Test(priority = 5)
 
	public void ProductsSauceCross() {
 
		driver.findElement(By.xpath("//span[text()='Products']")).click();
 
		driver.findElement(By.xpath("//span[text()='Sauce Cross-Browser']")).click();
	}
	
	@Test(priority = 6)
	 
	public void Platform() {
 
		driver.findElement(By.xpath("//span[text()='Products']")).click();
 
		driver.findElement(By.xpath("//span[text()='Sauce Mobile']")).click();
	}

	@Test(priority = 7)
	 
	public void Platform_code() {
 
		driver.findElement(By.xpath("//span[text()='Products']")).click();
 
		driver.findElement(By.xpath("//span[text()='Sauce Low-Code']")).click();
	}
	@Test(priority = 8)
	 
	public void Platform_report() {
 
		driver.findElement(By.xpath("//span[text()='Products']")).click();
 
		driver.findElement(By.xpath("//span[text()='Sauce Error Reporting']")).click();
	}
	
	@Test(priority = 9)
	 
	public void Products() {
 
		driver.findElement(By.xpath("//span[text()='Solutions']")).click();
		driver.findElement(By.xpath("//span[text()='Solutions for']")).click();
	}
	@Test(priority = 10)
	 
	public void testsolution() {
 
		driver.findElement(By.xpath("//span[text()='Solutions']")).click();
		driver.findElement(By.xpath("//span[text()='Enterprise']")).click();
		
	}

}
