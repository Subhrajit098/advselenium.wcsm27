package advselenium.wcsm27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelFilepractice
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fis =new FileInputStream(".\\src\\test\\java\\advselenium\\wcsm27\\ExelFilepractice.java");
    Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Organizations");	
	Row rw=sh.getRow(1);
	Cell ce=rw.createCell(7);
	ce.setCellValue("vivek");
	FileOutputStream fos=new FileOutputStream(".\\src\\test\\java\\advselenium\\wcsm27\\ExelFilepractice.java");
	wb.write(fos);
	System.out.println("data added");
	wb.close();
		
		
	}
}
	
