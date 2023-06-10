package seleniumProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestR3 {

	//diff annotations 
	
	@Test       //called fifth 
	public void testcase1() {
		System.out.println("test case 1");
	}
	
	@BeforeMethod     //called fourth
	public void beforeMethod() {
		System.out.println("before method called");
	}
	
	@AfterMethod    //called sixth 
	public void afterMethod() {
		System.out.println("after method called");
	}
	
	@BeforeTest     //called second
	public void beforeTest() {
		System.out.println("before test method is called");
	}
	
	@AfterTest      //called eighth
	public void afterTest() {
		System.out.println("after test method is called ");
	}
	
	@BeforeClass    //called third
	public void beforeClass() {
		System.out.println("before class method is called");
	}
	
	@AfterClass     //called seventh
	public void afterClass() {
		System.out.println("after class method is called");
	}
	
	@BeforeSuite  //called first 
	public void beforeSuite() {
		System.out.println("before suite method is called");
	}
	
	@AfterSuite     //called last
	public void afterSuite() {
		System.out.println("after suite method is called");
	}
	
	
}
