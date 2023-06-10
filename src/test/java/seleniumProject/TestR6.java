package seleniumProject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestR6 {

	@Test() 
	@Parameters({"user", "pw"})
	public void testCase(String user, String pw) {
		System.out.println(user);
		System.out.println(pw);
		System.out.println("test case one");
	}
	
	@Test()
	public void testcaseOne() {
		System.out.println("testcase two");
	}
	
}
