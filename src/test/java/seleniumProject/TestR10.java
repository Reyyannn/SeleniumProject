package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestR10 {      //dataprovider provides to run all 4 test cases at one test case with 4 functions
	

	ChromeDriver driver;
	
	@DataProvider(name = "data1")            //dataprovider returns multidemensional objects 
	public Object[][] datasetOne(){
		return new Object[][] {
			{"user1", "pw1"},
			{"user2", "pw1"},
			{"user3", "pw3"}
		};
	}
	
	@DataProvider(name = "loginData")
	public Object[][] DataSetTwo(){
		return new Object [][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"},
			{"performance_glitch_user", "secret_sauce"}
		};
	}
	
	@Test(dataProvider = "data1", enabled = false)
	public void Loginn(String user, String pw) {
		System.out.println("login with user" +user+pw);
	}
	
	@Test(dataProvider = "loginData")
	public void Loginn2(String user, String pw) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		 driver.get("https://www.saucedemo.com/");
		 
		 driver.findElement(By.cssSelector("#user-name")).sendKeys(user);
		 driver.findElement(By.cssSelector("#password")).sendKeys(pw);
		 driver.findElement(By.cssSelector("#login-button")).click();
		 List<WebElement> productt= driver.findElements(By.cssSelector(".inventory_item_name"));
		 
		 Assert.assertEquals(productt.size(), 6);
		 driver.quit();
		 
	}
	
}
