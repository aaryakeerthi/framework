package loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fontsize 
{
	public static void main(String[] args) throws InterruptedException 
	{ 
    System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("pass"));
		String size=ele.getCssValue("font-size");
		System.out.println(size);
		
      }

}
