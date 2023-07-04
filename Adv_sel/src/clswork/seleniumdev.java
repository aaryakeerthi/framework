package clswork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumdev {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		Thread.sleep(2000);
       WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
       Thread.sleep(2000);
		WebElement ele4= driver.findElement(By.xpath("//span[text()='Support']"));
		Thread.sleep(2000);
	    Actions act=new Actions(driver);
	    act.contextClick(ele1).perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	    Thread.sleep(2000);
	    act.contextClick(ele2).perform();
	    Robot r1 = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	    Thread.sleep(2000);
         act.contextClick(ele3).perform();
	    Robot r2 = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	    Thread.sleep(2000);
	    act.contextClick(ele4).perform();
	    Robot r3 = new Robot();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	  Set<String> alwh = driver.getWindowHandles();
          	 ArrayList<String> l = new ArrayList<String>(alwh);
          	 String s1=l.get(4);
          	 driver.switchTo().window(s1);
          	 Thread.sleep(0);
	   }
}