package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	public static void pass_Data() throws Throwable {
		File f=new File("C:\\Users\\Prasanth SP\\Desktop\\write_data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		w.createSheet("Student_Datas").createRow(0).createCell(0).setCellValue("Student_name");
		w.getSheet("Student_Datas").getRow(0).createCell(1).setCellValue("Maths_mark");
		w.getSheet("Student_Datas").createRow(1).createCell(0).setCellValue("john");
		w.getSheet("Student_Datas").getRow(1).createCell(1).setCellValue(89);
		w.getSheet("Student_Datas").createRow(2).createCell(0).setCellValue("naveen");
		w.getSheet("Student_Datas").getRow(2).createCell(1).setCellValue("85");
		w.getSheet("Student_Datas").createRow(3).createCell(0).setCellValue("navi");
		w.getSheet("Student_Datas").getRow(3).createCell(1).setCellValue("65");
		w.getSheet("Student_Datas").createRow(4).createCell(0).setCellValue("akilan");
		w.getSheet("Student_Datas").getRow(4).createCell(1).setCellValue("96");

		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		w.close();
		
	

		System.out.println("completed");



	}
	public static void main(String[] args) throws Throwable {
		pass_Data();
	}


}
