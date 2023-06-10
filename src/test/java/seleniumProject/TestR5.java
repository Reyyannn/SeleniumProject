package seleniumProject;

import org.testng.annotations.Test;

public class TestR5 {
  //GROUPS
	// Actual environment
	// order pad
	// portfolio
	// investment tool
	// market
	// widget

	@Test(groups = { "loginn" })
	public void testcase1() {
		System.out.println("test case one");
	}

	@Test(groups = { "logout" })
	public void testcase2() {
		System.out.println("test case two");
	}

	@Test(groups = { "loginn" })
	public void testcase3() {
		System.out.println("test case three");
	}

	@Test(groups = { "logout" })
	public void testcase4() {
		System.out.println("test case four");
	}

	@Test(groups = { "profile" })
	public void testcase5() {
		System.out.println("test case five");
	}

	@Test(groups = { "profile" })
	public void testcase6() {
		System.out.println("test case six");
	}
}
