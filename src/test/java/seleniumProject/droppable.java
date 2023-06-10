package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class droppable {

	//verify jquery current title
	//current URL
	
	ChromeDriver driver;
	@Test
	public void Settingup() {       
		System.out.println("login");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
	}
	@Test (priority=1)      //verifying title
	public void verifyTitle() {
		
		String title = driver.getTitle();
		//assertion
		
		Assert.assertEquals(title, "Droppable | jQuery UI");
	}
	
	@Test (priority= 2)
	public void VerifycurrentURL() {
		String currentURL= driver.getCurrentUrl();
		
		//verify assertion
		Assert.assertEquals(currentURL, "https://jqueryui.com/droppable/");
		driver.quit();
	}
	
	@Test (priority= 3)    //switch to the iframe that contains the drag and drop elements
	public void DragAndDrop() {
		driver.switchTo().frame(driver.findElement(By.cssSelector("demo-frame")));
		
		//getting dropable and dragable element 
		
		WebElement dorp= driver.findElement(By.cssSelector("#droppable"));
		WebElement drag= driver.findElement(By.cssSelector("#draggable"));
		
		//Assert //action
		Actions action= new Actions(driver);
		action.dragAndDrop(dorp, drag).perform();
		
		//asserting the bessage is displayed 
		
	    String Dropped = dorp.getText();
	    System.out.println(Dropped);
	    Assert.assertEquals(Dropped,"Dropped!");
	    
//	    String Dragable= drag.getText();
//	    System.out.println(Dragable);
//	    Assert.assertEquals(Dragable, "Drop here");
	}
	
	
}
