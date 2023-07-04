package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datapass_tofacebook 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream  fis=new FileInputStream("./today/ddt1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh =book.getSheet("sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		String value =c.toString();
		System.out.println(value);
		Row r1=sh.getRow(0);
		Cell c1=r.getCell(1);
		String value1 =c1.toString();
		System.out.println(value1);
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(value);
		driver.findElement(By.id("pass")).sendKeys(value1);
		driver.findElement(By.name("login")).click();
}

}

	


