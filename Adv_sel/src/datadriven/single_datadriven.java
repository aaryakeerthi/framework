package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class single_datadriven {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
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
		

		
		
		
		
	}

}
