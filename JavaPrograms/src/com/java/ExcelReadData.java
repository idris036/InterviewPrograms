package com.java;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadData 
{
	//Write a Java Program to read an excel.

	public static void main(String[] args) throws Exception 
	{
		File src = new File("./TestData/Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheetAt(0);
		
		int rowCount = s1.getLastRowNum();
		
		for(int i=0; i<=rowCount; i++)
		{
			int cellCount = s1.getRow(i).getLastCellNum();
			for(int j=0; j<cellCount; j++)
			{
				System.out.print(s1.getRow(i).getCell(j).getStringCellValue());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
