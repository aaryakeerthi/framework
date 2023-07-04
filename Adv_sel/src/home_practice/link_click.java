package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_click 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/DELL/Desktop/chai1.html");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.name("n1"));
			String ele2 = driver.getTitle();
            ele.click();
            String ele7 = driver.getTitle();
            System.out.println(ele7);
            String ele3 = driver.getCurrentUrl();
            System.out.println(ele3);
           
            String ele4 = driver.getPageSource();
            System.out.println(ele4);
            driver.close();
}
}