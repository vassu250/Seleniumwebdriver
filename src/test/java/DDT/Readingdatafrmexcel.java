package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdatafrmexcel {

	public static void main(String[] args) throws IOException {
		//extract the file
		FileInputStream file=new FileInputStream("C:\\Automation\\Myworkspace\\Seleniumwebdriver\\Seleniumwebdriver\\testdata\\data.xlsx");
// or FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);//extracted workbook from the file
	XSSFSheet sheet= workbook.getSheet("Sheet1");//extracted specific sheet from the file
	int totalrows= sheet.getLastRowNum();
	int totalcells=sheet.getRow(1).getLastCellNum();
	System.out.println(totalrows);
	System.out.println(totalcells);
	
	for(int r=0;r<=totalrows;r++){
		XSSFRow currentrow=sheet.getRow(r);
		for(int c=0;c<totalcells;c++) {
		XSSFCell cell=	currentrow.getCell(c);
		System.out.print(cell.toString()+"\t");
			
			
			
			
			
			
		}
		System.out.println( );
	}
	
	workbook.close();
	file.close();
	
	
	
	}
	
	

}
