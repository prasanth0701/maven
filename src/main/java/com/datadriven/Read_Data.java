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

public class Read_Data {
	
	public static void particular_Data() throws IOException {
		File f = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\Excel\\data_driven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);

			int value = (int) numericCellValue;
			System.out.println(value);

		}
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
	}

	public static void main(String[] args) throws IOException {
		particular_Data();
		
		
	}
}
