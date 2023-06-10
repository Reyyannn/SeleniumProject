package seleniumProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestR15 {

	@Test()
	public void One() {
		System.out.println("One is executed"); // this one will pass
	}

	@Test(dependsOnMethods = { "One" })
	public void two() {
		System.out.println("two is exectued"); // this one will fail
		Assert.assertEquals(false, true); // only one will run but the bottom two won't so it will skip the two
	}

	@Test(dependsOnMethods = { "two" })
	public void three() {
		System.out.println("three is executed"); // from this and down will skip
	}

	@Test(dependsOnMethods = { "three" })
	public void four() {
		System.out.println("four is executed");
	}

	@Test(dependsOnMethods = { "four" })
	public void five() {
		System.out.println("four is executed");
	}

}
