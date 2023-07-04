package runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_script.base_page;
import pom_script.Pom_chai;

public class Runner_pom extends base_page {
@Test(dataProvider = "testData")
public void test1(String d1,String d2) throws InterruptedException 
{
	Pom_chai p=new Pom_chai(driver);
	p.uName(d1);
	p.pWord(d2);
	Thread.sleep(2000);
	p.btn();
	Assert.fail();
}
@DataProvider(name="testdata")
public Object[][] createData()
		{
	return new Object[][]
			{
			{"Cederic","admin"},
			{"Anne","manager"},
			
			};
		
		}
		}

