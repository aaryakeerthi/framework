package demo;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mousehover
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 Thread.sleep(2000);
	 WebElement ele = driver.findElement(By.xpath("div[text()='Electronics']"));
	 Thread.sleep(2000);
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	 
     
      
     
	
	
}

}
