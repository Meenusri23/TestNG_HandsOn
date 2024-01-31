package TestNG;

import org.testng.annotations.Test;

public class Dependency_Example {

	@Test (enabled = true)
	public void testcase1()
	{
		System.out.println("1st execution");

	}

	@Test (dependsOnMethods = "testcase1")
	public void testcase2()
	{
		System.out.println("2nd execution");
	}


	@Test (dependsOnMethods = "testcase2" )
	public void testcase3()
	{
		System.out.println("3rd execution");
	}

}
