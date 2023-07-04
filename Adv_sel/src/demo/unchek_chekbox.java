package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unchek_chekbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/checkbox12.html");
		Thread.sleep(4000);
		List<WebElement>links = driver.findElements(By.xpath("//input[@type='checkbox' ]"));
		int count=links.size();
		for(int i=0; i<count; i++)
		{ WebElement w = links.get(i);
		w.click();
		
		}
			for(int i=count-1; i>=0;i--)
			{WebElement w = links.get(i);
			w.click();
	}

}
}