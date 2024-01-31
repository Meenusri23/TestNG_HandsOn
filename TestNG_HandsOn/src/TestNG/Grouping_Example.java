package TestNG;

import org.testng.annotations.Test;

public class Grouping_Example {

	@Test(groups = {"Apple"})
	public void Apple()
	{
		System.out.println("Apple Phone");

	}

	@Test(groups = {"Apple"})
	public void Apple1()
	{
		System.out.println("Apple Phone");
	}

	@Test(groups = {"MotoG"})
	public void MotoG()
	{
		System.out.println("MotoG Phone");
	}

	@Test(groups = {"MotoG"})
	public void MotoG1()
	{
		System.out.println("MotoG Phone");
	}

	@Test(groups = {"Oppo"})
	public void Oppo()
	{
		System.out.println("Oppo Phone");
	}

	@Test(groups = {"Oppo"})
	public void Oppo1()
	{
		System.out.println("Oppo Phone");
	}

	@Test(groups = {"Vivo"})
	public void Vivo()
	{
		System.out.println("Vivo Phone");
	}

	@Test(groups = {"Vivo"})
	public void Vivo1()
	{
		System.out.println("Vivo Phone");
	}

}
