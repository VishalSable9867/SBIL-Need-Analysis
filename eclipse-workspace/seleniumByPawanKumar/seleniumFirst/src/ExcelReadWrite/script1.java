package ExcelReadWrite;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class script1 {

	public static void main(String[] args) throws IOException {
		 FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Excel\\Excel1.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		 int rows = sheet1.getLastRowNum();
		 short cols = sheet1.getRow(1).getLastCellNum();
		 System.out.println(rows);
		 System.out.println(cols);
		 for(int i=0; i<=rows;i++)
		 {
			 XSSFRow currentrow = sheet1.getRow(i);
			 for(int j=0; j<cols;j++)
			 {
				String value = currentrow.getCell(j).toString();
				System.out.print(value + " ");
			 }
			 System.out.println( "  " );
		 }
		 workbook.close();
		 file.close();
	}

}
