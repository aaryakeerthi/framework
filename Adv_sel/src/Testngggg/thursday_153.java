package Testngggg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class thursday_153  extends generic_script
{@Test
	public void test4() throws InterruptedException
	{
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("chaitra");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234567");
	driver.findElement(By.cssSelector("button[name='login']")).click();


}
}