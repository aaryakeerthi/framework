package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clera_data {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/html/chai22.html");
		driver.findElement(By.id("user")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).clear();
	} 

}
