package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element_displyed {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		if(ele.isDisplayed())
		{
			System.out.println(ele);
		}
		
		else
		{
			System.out.println("element not displeyde");
		
		
		}
	}
}