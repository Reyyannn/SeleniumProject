package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestR13 {
// very the add to card functionality
	
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
	
	//*[@id="shopping_cart_container"] //*[@id="add-to-cart-sauce-labs-backpack"]
	boolean item= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).isDisplayed();
	if(item) {
		System.out.println("sucessfully added to cart");
	}
	else {
		System.out.println("sucessfully didn't");
	}
	
	
	}	
}
