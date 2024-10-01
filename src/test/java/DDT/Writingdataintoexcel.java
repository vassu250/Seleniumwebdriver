package DDT;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdataintoexcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream("C:\\Automation\\Myworkspace\\Seleniumwebdriver\\Seleniumwebdriver\\testdata\\myfile.xlsx");
            XSSFWorkbook workbook=new XSSFWorkbook();
           
            XSSFSheet sheet=workbook.createSheet("Data");
            XSSFRow row1=sheet.createRow(0);
            row1.createCell(0).setCellValue("Welcome");
            row1.createCell(1).setCellValue("1234");
            row1.createCell(2).setCellValue("SLENIUM");
          
            XSSFRow row2=sheet.createRow(1);
            row2.createCell(0).setCellValue("JAVA");
            row2.createCell(1).setCellValue("45678");
            row2.createCell(2).setCellValue("PROGRAM");
            
            workbook.write(file); //adding relation to workbook and file
            workbook.close();
            file.close();
            System.out.println("file is created");
            
	}

}
