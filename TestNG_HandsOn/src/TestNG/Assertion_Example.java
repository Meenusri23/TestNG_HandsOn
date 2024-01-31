package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Example {

	String name = "Meenu";

	@Test
	public void checkname()
	{
		/*
		 * if(name.equals("meenu")) { System.out.println("Name is Equal"); }
		 * 
		 * else { System.out.println("Name is not Equal"); }
		 */
		
		Assert.assertEquals(name, "Meenu");

	}

}
