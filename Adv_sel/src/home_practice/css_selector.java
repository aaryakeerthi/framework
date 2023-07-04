package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instgram.com");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("chaitra _chintu");
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("chaitrachintu2023");

	driver.findElement(By.cssSelector("button[type='submit']")).click();

}

}
