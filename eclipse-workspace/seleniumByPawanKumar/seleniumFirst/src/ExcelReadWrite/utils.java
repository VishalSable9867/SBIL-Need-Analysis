package ExcelReadWrite;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utils {
	
	  static FileInputStream file;
	  static XSSFWorkbook wb;
	  static XSSFSheet ws;
	  static XSSFRow row;
	  static XSSFCell col;
	public static int getrowcount(String fileLoc, String sheet1) throws IOException
	{
		file = new FileInputStream(fileLoc);
	    wb = new XSSFWorkbook(file);
	    ws = wb.getSheet(sheet1);
	    int rowcount=ws.getLastRowNum();
	    wb.close();
	    file.close();
	    return rowcount;
	}
	public static int getcolcount(String fileLoc, String Sheet1, int rownum) throws IOException
	{
		file = new FileInputStream(fileLoc);
	    wb = new XSSFWorkbook(file);
	    ws = wb.getSheet(Sheet1);
	    int colcount= ws.getRow(rownum).getLastCellNum();
	    wb.close();
	    file.close();
	    return colcount;
	}
	public static String getCellData(String fileLoc, String Sheet1, int rownum, int cellnum) throws IOException
	{
		file = new FileInputStream(fileLoc);
	    wb = new XSSFWorkbook(file);
	    ws = wb.getSheet(Sheet1);
	    row = ws.getRow(rownum);
	    col = row.getCell(cellnum);
	    
	    String data = null;
	    try
	    {
	    	DataFormatter formatter = new DataFormatter();
	    	formatter.formatCellValue(col);
	    	return data;
	    }
	    catch(Exception e)
	    {
	    	data=" ";
	    }
	    wb.close();
	    file.close();
	    return data;
	}

}
