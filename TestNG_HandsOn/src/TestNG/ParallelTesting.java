package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void OpenGoogle()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.quit();

	}

	@Test
	public void DemoBlaze()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/");

		driver.quit();
	}

}
