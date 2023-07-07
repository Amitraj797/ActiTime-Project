package Actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromPropertiesFile(String Key) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Selenium\\testdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(Key);
		return value;
	}
	
	public String getDataFromExcelSheet(String sheetname, int rowno, int cellno) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rowno).getCell(cellno));
		return value;
	}
	
	public void writeDataToExcelSheet(String sheetname, int rowno, int cellno,String name) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		sh.createRow(rowno).createCell(cellno).setCellValue(name);
		FileOutputStream fos=new FileOutputStream("D:\\Selenium\\Book1.xlsx");
		book.write(fos);
		fos.flush();
	}
}
