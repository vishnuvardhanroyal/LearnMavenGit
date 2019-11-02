package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.logs.GenLog;

public class ReadExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("TestData.xlsx");
	
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		GenLog.genLog("info", "Sheet1 is retrieved");
		Row r=s.getRow(1);
		int rowNo=s.getLastRowNum();
		System.out.println(rowNo);
		Cell c=r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
		GenLog.genLog("info", "data is retrieved");
		Row r1=s.createRow(4);
		Cell c1=r1.createCell(0);
		c1.setCellValue("Bharath");
		FileOutputStream fos=new FileOutputStream("TestData.xlsx");
		wb.write(fos);
		wb.close();
		
		
		
	}

}
