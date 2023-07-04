package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_facebook 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("realme mobile 5g");
	driver.findElement(By.xpath("//button")).click();
	WebElement ele1 = driver.findElement(By.xpath("//div[text()='realme 10 Pro 5G (Hyperspace, 128 GB)']"));
	 ele1.click();
	 WebElement ele2	=driver.findElement(By.xpath("//div[text()='realme 10 Pro 5G (Dark Matter, 128 GB)']"));
	 ele2 .click();
	
	if(ele1)
	{ 
		System.out.println("5 hper is low price");
		
	}
	else
	{
		System.out.println("5 hper is high price");
		
	}
	
}

}
