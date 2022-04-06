package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		/*WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();*/
		
		driver.manage().window().maximize();
		driver.get("https://www.tripadvisor.com/");
	}
	
	
	//@AfterClass
	/*public void teardown() {
		driver.quit();
	}*/

}
