package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_HandsOn {
	
	@Test
	@Parameters("Name")
	public void printname(String GetName)
	{
		System.out.println("Name is " +GetName );
	}

}
