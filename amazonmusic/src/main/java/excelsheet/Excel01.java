package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel01 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\admin\\excel\\");
		Workbook book = WorkbookFactory.create(fis);
		DataFormatter format= new DataFormatter();
		String data= format.formatCellValue(book.getSheet("sheet1").getRow(1).getCell(1));
		System.out.println(data);
		
				
	}

}
