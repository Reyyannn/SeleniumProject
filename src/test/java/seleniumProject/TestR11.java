package seleniumProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestR11 {

	// verify the login for user
	// verify dashboard logo
	// verify number od items in navigation bar
	// very the add to card functionality
	// verify the filter
	// verify the complete order flow
	// verify the calculation of price on checkout page

	ChromeDriver driver;

	@Test(enabled = false) // dashboard logo
	public void testcases() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("#user-name")).sendKeys("standard_user");
		driver.findElement(By.id("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("#login-button")).click();

		Thread.sleep(3000);

		// Assertion
		WebElement logo = driver.findElement(By.cssSelector("div[class='app_logo']"));
		Assert.assertEquals("Swag Labs", logo.getText());

		driver.close();
	}

	// verify the add to cart functionality

	@Test(enabled = false)
	public void verifyAddtoCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();

		WebElement addCart = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
		addCart.click();
		Thread.sleep(2000);
		WebElement removeFromCart = driver.findElement(By.cssSelector("#remove-sauce-labs-backpack"));
		Assert.assertEquals("Remove", removeFromCart.getText());
		driver.quit();
	}

	// verify the filter sorting AtoZ
	@Test(enabled = false)
	public void FilterSorting() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();

		List<WebElement> beforeSorting = driver.findElements(By.cssSelector(".inventory_item_name"));
		beforeSorting.stream().sorted(); // sorting alphabetical order from random order
		Collections.reverse(beforeSorting); // reversing the order for decending order alphabets
		List<String> Sortednames = new ArrayList();
		for (int i = 0; i < beforeSorting.size(); i++) {
			Sortednames.add(beforeSorting.get(i).getText());
		}
		System.out.println("AllproductSorted: " + Sortednames);
		WebElement SortAtoZ = driver.findElement(By.cssSelector(".product_sort_container"));
		Select s = new Select(SortAtoZ);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(1000);

		// assert if sort decending

		List<WebElement> AfterProductsFilter = driver.findElements(By.cssSelector(".inventory_item_name"));
		List<String> AfterProductList = new ArrayList();
		for (int i = 0; i < AfterProductsFilter.size(); i++) {
			AfterProductList.add(AfterProductsFilter.get(i).getText());
		}
		System.out.println("Products after decending Sort: " + AfterProductList);
		Assert.assertEquals("NameSorted", AfterProductList);
	}

	// verify the complete order flow
	@Test(enabled = true)
	public void CompleteOrder() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		WebElement addtoCart= driver.findElement(By.cssSelector("#add-to-cart-test.allthethings()-t-shirt-(red)"));
		addtoCart.click();
		
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#checkout")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#first-name")).sendKeys("aastha");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("ahsu");
		driver.findElement(By.cssSelector("postal-code")).sendKeys("78653");
		driver.findElement(By.cssSelector("#continue")).submit();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#finish")).click();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		//Assert
		String orderCompleteMSG = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
		Assert.assertEquals("Thank you for your order!", orderCompleteMSG);
		

	}
	
	//verify the calculation of price on checkout page 
	
	@Test(enabled = true)
	public void priceCheckout() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		WebElement addToCart= driver.findElement(By.cssSelector("#id=\"add-to-cart-sauce-labs-bike-light\""));
		addToCart.click();
		WebElement addanother= driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
		addanother.click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#first-name")).sendKeys("aastha");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("ahsu");
		driver.findElement(By.cssSelector("postal-code")).sendKeys("78653");
		driver.findElement(By.cssSelector("#continue")).submit();
		System.out.println(driver.getCurrentUrl());
		
	}

	//navigation bar
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
