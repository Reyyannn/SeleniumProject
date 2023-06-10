package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestR12 {
	//verify number of items in navigation bar
	// very the add to card functionality
	// verify the filter
	// verify the complete order flow
	// verify the calculation of price on checkout page

	ChromeDriver driver;
	@Test
	public void testcase() {       
		System.out.println("login");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromeFinal\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("#user-name")).sendKeys("standard_user");
	driver.findElement(By.id("#password")).sendKeys("secret_sauce");
	driver.findElement(By.id("#login-button")).click();
	
	List <WebElement> navigationbar= driver.findElements(By.cssSelector("div[class= 'bm-menu-wrap']"));
	Assert.assertEquals(navigationbar.size(), 4);
	
	
	
	
	
	
	}	
}
