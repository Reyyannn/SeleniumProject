package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestR7 {
	//assert . assert is for Testng where expected vs actual 
	
	ChromeDriver driver;
	@Test
	public void testcase1() {      //trying to get the total number of product from the page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		 driver.get("https://www.saucedemo.com/");
		 
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		 
		 List<WebElement> productnumber= driver.findElements(By.cssSelector(".inventory_item_name"));
		 Assert.assertEquals(productnumber.size(), 6);     //assert will give you actual vs expected 
	}
	
}
