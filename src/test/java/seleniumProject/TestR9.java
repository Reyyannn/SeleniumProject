package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestR9 {

	static ChromeDriver driver;
	
	public static void LoginUser (String user, String pw) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		 driver.get("https://www.saucedemo.com/");
		 
		 driver.findElement(By.cssSelector("#user-name")).sendKeys(user);
		 driver.findElement(By.cssSelector("#password")).sendKeys(pw);
		 driver.findElement(By.cssSelector("#login-button")).click();
		 
		 List<WebElement> product= driver.findElements(By.cssSelector(".inventory_item_name"));
		 Assert.assertEquals(product.size(), 6);
	}
	
	@Test 
	public void testcase() {        //will only run once because there is just one case with 4 function 
		System.out.println("login");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromeFinal\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.get("https://www.saucedemo.com/");
		
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
//		List<WebElement> productt= driver.findElements(By.cssSelector(".inventory_item_name"));
//		Assert.assertEquals(productt.size(), 6);
		
		TestR9.LoginUser("standard_user", "secret_sauce");
		TestR9.LoginUser("locked_out_user", "secret_sauce");
		TestR9.LoginUser("problem_user", "secret_sauce");
		TestR9.LoginUser("performance_glitch_user", "secret_sauce");
		
		
		driver.quit();
		
		
	}
	
	
	
	
}
