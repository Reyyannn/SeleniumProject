package seleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ScreenshotTestR17 {

	
	ChromeDriver driver;
	@Test
	public void screenshot() throws IOException {       
		System.out.println("login");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File(".//screenshot/page.png"); 
		FileUtils.copyFile(source, destination);
		
	
	
	}
}
