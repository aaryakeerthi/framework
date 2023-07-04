package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadPopup {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("///C:/Users/DELL/Desktop/chai.html");
		 WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\DELL\\Desktop\\pavanresume.docx");
	}

}
