package vTiger.GenericUtilities;
/**
 * This class consists of generic methods related to excelsheet 
 * @author vivek
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility 
{
	
	/**
	 * This method read data from excel sheet
	 * @param SheetName
	 * @param rowno
	 * @param cellno
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public String readDataFromExcel(String SheetName,int rowno,int cellno) throws EncryptedDocumentException, IOException {


  FileInputStream fis =new FileInputStream(IConstantsUtility.excelFilepath);
  Workbook wb=WorkbookFactory.create(fis);
  String value= wb.getSheet(SheetName).getRow(rowno).getCell(cellno).getStringCellValue();
  return value;
}

public void writeDataFromExcel(String Sheetname,int rowno,int cellno,String value) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis =new FileInputStream(IConstantsUtility.excelFilepath);
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(Sheetname).createRow(rowno).createCell(cellno).setCellValue(value);
	FileOutputStream fos =new FileOutputStream(IConstantsUtility.excelFilepath);
	wb.write(fos);
	wb.close();
}
}


























