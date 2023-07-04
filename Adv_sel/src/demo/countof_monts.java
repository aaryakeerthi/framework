package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class countof_monts { 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath(//"months"));
	      Select s = new Select(ele);
	     ArrayList<String> l=new ArrayList<String>();
	     TreeSet<String> t = new TreeSet<String>(l);
	     List<WebElement> opt = s.getOptions();
	    int count = opt.size();
	    System.out.println(count);
	    for(WebElement we:opt)
	    {
	    	String text=we.getText();
	    	t.add(text);
	    }
	    for(String t1:t)
	    {
	    	System.out.println(t1);
	    }
}
	}
	