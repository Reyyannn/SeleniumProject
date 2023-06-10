package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestR14 {

	//verify the filter
	
	ChromeDriver driver;
	@Test
	public void testcase() {       
		System.out.println("login");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("#user-name")).sendKeys("standard_user");
	driver.findElement(By.id("#password")).sendKeys("secret_sauce");
	driver.findElement(By.id("#login-button")).click();
	
	
	
	}
}
