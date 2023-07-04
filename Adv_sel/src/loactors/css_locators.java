package loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_locators 
{ public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("chaitra");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234567");
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	
}

}
