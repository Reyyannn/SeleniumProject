package seleniumProject;

import org.testng.annotations.Test;

public class TestR4 {

	//which priority comes first 
	
	@Test(priority =1)  //then this should execute third
	public void shouldexecutesecond() {
		System.out.println("one is executed third");
	}
	
	@Test (priority= -1)   //should execute first         //why is this not showing??
	public void theveryfirst() {
		System.out.println("theveryfirst is executed");
	}
	
	@Test (priority= 2)               //should be executed fourth
	public void shouldexecutefourth() {
		System.out.println("shouldexecutedfourth is executed");
	}
	
	@Test (priority= 0)  //should be second 
	public void zero() {
		System.out.println("should execute very first");
	}
	
	
}
