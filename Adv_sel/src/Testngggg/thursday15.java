package Testngggg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class thursday15 extends generic_script
{
	@Test
		public void pvr() throws InterruptedException
		{
			
			driver.findElement(By.id("email")).sendKeys("hello");
			driver.findElement(By.id("pass")).sendKeys("hello");
			driver.findElement(By.id("login")).click();
			Thread.sleep(4000);
			String title=driver.getTitle();
		}
	@Test
	public void pvr2()
	{
		driver.get("https://www.instgram.com");
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("chaitra _chintu");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("chaitrachintu2023");

	driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}

