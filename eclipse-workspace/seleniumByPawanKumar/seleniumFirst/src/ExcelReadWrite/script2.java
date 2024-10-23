package ExcelReadWrite;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class script2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + ".//Excel//write1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("helo");
		row1.createCell(1).setCellValue(78952);
		row1.createCell(2).setCellValue(16/04/1998);
		workbook.write(file);
		file.close();

	}

}
