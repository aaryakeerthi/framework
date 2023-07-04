package childbrowserpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_broserclose 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://skpatro.github.io//demo/links/");
			Thread.sleep(2000);
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			String p_id=driver.getWindowHandle();
			Set<String> alwh = driver.getWindowHandles();
			int count=alwh.size();
			System.out.println(count);
			for(String wh:alwh)
			{
				driver.switchTo().window(wh);
				 String title=driver.getTitle();
				 System.out.println(title);
				 if(wh.equalsIgnoreCase(p_id));
				 {
					 driver.close();
				 }
				
				
				
			}
				
			}
	

}
