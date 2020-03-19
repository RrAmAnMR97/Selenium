package com.offers.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelPHP {
	XSSFWorkbook a;
	XSSFSheet b;
public ReadExcelPHP(String s) throws IOException {
	File file=new File(s);
	FileInputStream fis= new FileInputStream(file);
	a=new XSSFWorkbook(fis);
}
public Object av(int sheetno,int row,int column) {
	b=a.getSheetAt(sheetno);
	try {
	String s=b.getRow(row).getCell(column).getStringCellValue();
	return s;
	}
	catch(Exception e){
	Integer s=(int) b.getRow(row).getCell(column).getNumericCellValue();
	return s;
	}
}
public int df(int q) {
	int w=a.getSheetAt(q).getLastRowNum();
	w=w+1;
	return w;
}
}
