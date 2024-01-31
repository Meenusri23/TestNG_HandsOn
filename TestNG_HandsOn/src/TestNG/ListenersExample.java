package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersExample implements ITestListener {
	
	@Override
	public void onTestStart (ITestResult result)
	{
		System.out.println("test case is starting to execute");
	}
	
	@Override
	public void onTestSuccess (ITestResult result)
	{
		System.out.println("test case is Passed");
	}
	
	@Override
	public void onTestFailure (ITestResult result)
	{
		System.out.println("test case is Failed");
	}
	
	@Override
	public void onTestSkipped (ITestResult result)
	{
		System.out.println("test case is Skipped");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage (ITestResult result)
	{
		
	}
	
	@Override
	public void onStart (ITestContext conext)
	{
		System.out.println("Entry Point");
	}
	
	@Override
	public void onFinish (ITestContext conext)
	{
		System.out.println("Exit Point");
	}

}
