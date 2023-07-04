package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class runnerscripe 
{
	@Test
	public void test1()
	{
		System.out.println("hello india");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Helllo banglore");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("Helllo karanatak");

	}
}
