package testng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExclRead {
	XSSFWorkbook a;
	XSSFSheet b;
	public ExclRead(String c) {
		try {
		File d=new File(c);
		FileInputStream fis=new FileInputStream(d);
		a=new XSSFWorkbook(fis);

	}
		catch(Exception e) {
			System.out.println("........");
		}
		
		}
	public Object guhan(int sheetno,int row,int column) {
		b=a.getSheetAt(sheetno);
		try {
			String s=b.getRow(row).getCell(column).getStringCellValue();
			return s;
		}
		catch(Exception e) {
			Integer s=(int) b.getRow(row).getCell(column).getNumericCellValue();
			return s;
		}
	}
	public int aloy(int q) {
		int w=a.getSheetAt(q).getLastRowNum();
		w=w+1;
		return w;
	}
	}
