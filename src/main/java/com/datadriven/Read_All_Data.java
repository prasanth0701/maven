package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Data {
	public static void all_data() throws IOException {
		File f =new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\Excel\\data_driven.xlsx");
		FileInputStream fis=new FileInputStream(f);		
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("The total number of row in the sheet is: "+physicalNumberOfRows);

		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			//System.out.println("The total number of column in the sheet is: "+physicalNumberOfCells);

			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();

					int value=(int) numericCellValue;
					System.out.println(value);
				}


			}
				
		}
		
		
			
		}
		
	
	
	
	
public static void main(String[] args) throws IOException {
	all_data();
	
	
}
}
