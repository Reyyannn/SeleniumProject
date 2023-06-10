package seleniumProject;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestR1 {

	//login testcases // which runs first and last
	
	@BeforeMethod       //beforemethod always runs first 
	public void beforeMethod() {
		System.out.println("this runs before every method");
	}
	
	@AfterMethod         //aftermethod always runs last
	public void afterMethod() {
		System.out.println("this runs after every method ");
	}
	
	@Test(priority =1)      //this runs third 
	public void loginTest() {
		System.out.println("Login successful one ");
	}
	
	@Test(priority =-1) //this runs second 
	public void loginTest2() {
		System.out.println("Login successful two ");
	}
}
