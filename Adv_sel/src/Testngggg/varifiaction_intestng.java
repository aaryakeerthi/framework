package Testngggg;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class varifiaction_intestng  extends generic_script
{@Test
	
		public void Demo() throws InterruptedException
		{
			driver.findElement(By.id("email")).sendKeys("admin");
			driver.findElement(By.id("pass")).sendKeys("management");
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			String title=driver.getTitle();
			Assert.assertEquals(title, "facebook -log "+ "in or sign up");
			System.out.println(1);
			
			
			
	}
	}
