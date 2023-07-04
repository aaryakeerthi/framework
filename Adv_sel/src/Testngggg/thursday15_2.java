package Testngggg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class thursday15_2 extends generic_script
{
	@Test
	public void pvr2()
	{
		driver.get("https://www.facebook.com");
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("chaitra _chintu");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("chaitrachintu2023");

	driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
	
	


