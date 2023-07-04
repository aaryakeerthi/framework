package pom_script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.annotations.Test;

public class Pom_indexvalue {
	@Test
	public void test1() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/pom2.html");
	driver.findElement(By.id("UN")).sendKeys("chai");
	Thread.sleep(4000);
	//driver.switchTo().frame(0);
	driver.switchTo().frame("s1");
	WebElement ele = driver.findElement(By.xpath("ifrmae[@id='f1']"));
	Thread.sleep(4000);
	driver.findElement(By.id("PWD")).sendKeys("chai");
	driver.close();
	

}
}