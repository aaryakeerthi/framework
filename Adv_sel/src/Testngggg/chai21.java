package Testngggg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chai21 
{
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.close();
	}
	@Test
	public void test2()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.close();
	}
}
