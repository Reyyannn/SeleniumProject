package seleniumProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestR16 {

	
	@Test(groups = {"loginn"})        //login and logout groups needs to be posted on the xml file to run this 
	public void TestCase1() {
		System.out.println("testcase one executed");
	}
	
	@Test(groups = {"loginn"})   
	public void TestCase2() {
		System.out.println("testcase two executed");
		Assert.assertEquals(true, false);    //only the first one pass and one fail and the bottom skip 
	}
	
	@Test(dependsOnGroups = {"loginn"},groups = {"logout"})   //has two group so the total for test case is 4
	public void TestCaseThree () {
		System.out.println("testcase three executed");
	}
	
	
}
