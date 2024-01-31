package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class trySuite {
	
	WebDriver driver;
	
	long starttime;
	
	long Endtime;
	
	@BeforeSuite
	public void Openbrowser()
	{
		starttime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@Test
	public void OpenGoogle()
	{
	driver.get("https://www.google.com/");
	}
	
	@Test
	public void OpenDemoBlaze()
	{
		driver.get("https://www.demoblaze.com/");
	}
	
	@Test
	public void OpenPetstore()
	{
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		Endtime = System.currentTimeMillis();
		long Totaltime = Endtime - starttime;
		System.out.println("Total time taken for execution is " +Totaltime);
	}
}
