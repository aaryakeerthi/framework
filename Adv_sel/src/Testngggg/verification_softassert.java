package Testngggg;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class verification_softassert extends generic_script
	{
		@Test
		
		public void Demo() throws InterruptedException
		{
			driver.findElement(By.id("email")).sendKeys("admin");
			driver.findElement(By.id("pass")).sendKeys("management");
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			String title=driver.getTitle();
			SoftAssert sa=new SoftAssert();
			Assert.assertEquals(title, "hello");
			System.out.println(1);
			sa.assertAll();
			
			
			
	}
	}



