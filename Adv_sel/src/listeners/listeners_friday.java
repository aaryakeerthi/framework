package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners_friday implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
     System.out.println("tc is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc is fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc skipped");
	}

}
