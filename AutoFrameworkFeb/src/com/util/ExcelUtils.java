package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
	
	@SuppressWarnings("resource")
	public Object[][] getData()
	{
		Object[][] data;
		try {
			XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(new File("userData.xlsx")));
			Sheet sheet = book.getSheetAt(0);
			int numberOfRows = sheet.getLastRowNum();
			data = new Object[numberOfRows][2];
			Row topRow = sheet.getRow(0);
			sheet.removeRow(topRow);
			Iterator<Row> rows = sheet.iterator();
			int i = 0;
			while(rows.hasNext())
			{
				int j = 0;
				Row row = rows.next();
				Iterator<Cell> cells = row.cellIterator();
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					data[i][j] = cell.getStringCellValue();
					j++;
				}
				i++;
			}
			
			return data;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
