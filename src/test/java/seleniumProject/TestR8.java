package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestR8 {
	
	ChromeDriver driver;
	
	@DataProvider(name ="LoginCredntials")
		public Object[][] dataset(){
		return new Object [][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"},
			{"performance_glitch_user", "secret_sauce"},
		};
	}
	
	@Test (dataProvider = "LoginCredntials")  //instead method name, we can pass value name of name attribute in dataProviders
	
	public void login(String user, String pw) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("username");
		driver.findElement(By.cssSelector("password")).sendKeys("password");
		
		driver.quit();
	}
	

}
