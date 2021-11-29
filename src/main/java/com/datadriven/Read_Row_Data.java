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

public class Read_Row_Data {
	public static void row_Data() throws IOException {
		File f = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven\\Excel\\data_driven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);

		Row row1 = sheetAt.getRow(1);
		int physicalNumberOfCells = row1.getPhysicalNumberOfCells();
		System.out.println("Number of Cells in Row1: " + physicalNumberOfCells);

		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row1.getCell(i);
			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);

			}

		}

	}

	public static void main(String[] args) throws IOException {
		row_Data();
	}
}