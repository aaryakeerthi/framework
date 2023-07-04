package parallel_exicutin;

import org.testng.annotations.Test;

public class Group
{
	@Test(groups="sanity")
	public void test1()
	{
         System.out.println("hello world1 ");
    }
	@Test(groups="smoke")
	public void test2()
	{
System.out.println("hello world ");
}
}