package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {
	public static void main(String[] args) throws InterruptedException

{
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/simple_context_menu.html");
Thread.sleep(2000);
WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
Thread.sleep(2000);
Actions act = new Actions(driver);
act.contextClick(rclick ).perform();
driver.close();
}

}
