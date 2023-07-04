package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_clik 
	{
		public static void main(String[] args) throws InterruptedException

	{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement dclick = driver.findElement(By.xpath("//button[text()='double-click me to see Alert']"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.doubleClick(dclick).perform();
       driver.close();
   }
   }
