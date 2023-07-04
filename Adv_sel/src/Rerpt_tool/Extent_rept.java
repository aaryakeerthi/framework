package Rerpt_tool;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_rept {
	@Test
	public void test1()
	
	{
		ExtentReports rep=new ExtentReports("./report/r.html",false);
		ExtentTest t1=rep.startTest("tc1");
		t1.log(LogStatus.PASS,"pass tc");
		t1.log(LogStatus.FAIL,"failed tc");
		t1.log(LogStatus.SKIP,"TC skipped");
		rep.endTest(t1);
		rep.flush();
	}

}
