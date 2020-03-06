package testng;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
			File file = new File("C:\\Users\\837362\\Documents\\Batch_JC009.xlsx");
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while(itr.hasNext())
			{
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext())
				{
					Cell cell = cellIterator.next();
					switch (cell.getCellType())
					{
					case STRING:
						System.out.println(cell.getStringCellValue() + "\t\t\t");
						break;
					case NUMERIC:
						System.out.println(cell.getNumericCellValue() + "\t\t\t");
						break;
					default:
						System.out.println("");
					}
				}
				System.out.println("  ");
			}
			wb.close();
		}
		
	

	}



