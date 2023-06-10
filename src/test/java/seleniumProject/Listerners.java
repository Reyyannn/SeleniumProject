package seleniumProject;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerners {

	public class Listeners implements ITestListener{
		public void onTestStart(ITestResult result) {
			System.out.println("test case is starting");
		}
		
		public void onTestSucess(ITestResult result) {
			System.out.println("Testcase pass");
		}
		
		public void onTestFailure(ITestResult result) {
			System.out.println("testcase failed");
		}
		
		public void onTestSkipped(ITestResult result) {
			System.out.println("skip of test cases and its details are : " + result.getName());
		}
		public void onTestFailedButWithinSucessPercentage(ITestResult result) {
			System.out.println("failure of test case and its details are : "+result.getName());
		}
		
	}
	
	
	
	
	
}
