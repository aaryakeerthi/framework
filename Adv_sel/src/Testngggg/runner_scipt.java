package Testngggg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runner_scipt  extends generic_script{
	@Test
	public void validlogin() throws InterruptedException
	
	{
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("hello");
		driver.findElement(By.id("login")).click();
		Thread.sleep(4000);
		String title=driver.getTitle();
	}
	
	
	

}
