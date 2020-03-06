package testng;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Student_Marks");
		Object[][] object= {
				{"Roll No","Student Name","Avg Marks"},
				{2001,"ABC",78.23f},
				{2002,"DEF",99.99f},
				{2003,"GUHAN",100.00f},
		};
		int rowCount=0;
		for(Object[]aBook:object) {
			Row row=sheet.createRow(rowCount++);
			int columnCount=0;
			for(Object field:aBook) {
				Cell cell=row.createCell(columnCount++);
				if(field instanceof String) {
					cell.setCellValue((String)field);
				}else if(field instanceof Integer ) {
					cell.setCellValue((Integer)field);
				}else if(field instanceof Float ) {
					cell.setCellValue((Float)field);
				}
			}
		}
			try {
				File file=new File("C:\\Users\\837362\\Desktop\\excel.xlsx"); 
				FileOutputStream fis=new FileOutputStream(file);
				workbook.write(fis);
				workbook.close();
				System.out.println("File has been written successfully");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
}