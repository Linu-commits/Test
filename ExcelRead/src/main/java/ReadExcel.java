import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//obtaining input bytes from a file  
		FileInputStream fis=new FileInputStream(new File("E:\\LINU\\Linu.xlsx"));  
		//creating Workbook instance that refers to .xlsx file  
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
		for(Cell cell: row){
			System.out.println(cell);
			}
		}
		
	}
	public static void readStringData() {
		
	}

}
