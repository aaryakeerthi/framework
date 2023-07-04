package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext_locators { 
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/link.html");
		driver.findElement(By.linkText("amazon")).click();
		String ele = driver.getTitle();
		System.out.println(ele);
		String ele2 = driver.getCurrentUrl();
		System.out.println(ele2);
		driver.getPageSource();
		String ele3 = driver.getPageSource();
		System.out.println(ele3);
		Thread.sleep(2000);
		driver.close();

}
}