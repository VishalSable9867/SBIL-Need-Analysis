package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelRead {
	FileInputStream file;
	XSSFWorkbook wb;
	XSSFSheet sheet ;
	XSSFRow rowno;
	XSSFCell colno ;
	String path;
	
	public excelRead(String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String sheetname) throws IOException
	{
		file= new FileInputStream(path);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetname);
		int totalNOrow = sheet.getLastRowNum();
		wb.close();
		file.close();
		return totalNOrow;
	}
	
	public int getCellCount(String sheetname, int rownum) throws IOException
	{
		file= new FileInputStream(path);
		wb = new XSSFWorkbook(file);
	    sheet = wb.getSheet(sheetname);
		rowno = sheet.getRow(rownum);
		int cell = rowno.getLastCellNum();
		return cell;	
	}
	
	public String getCellData(String sheetname, int rownum, int cellno) throws IOException
	{
		file= new FileInputStream(path);
	    wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetname);
		rowno = sheet.getRow(rownum);
		colno = rowno.getCell(cellno);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try
		{
			data=formatter.formatCellValue(colno);
		}
		catch(Exception e)
		{
			data=" ";
		}
		wb.close();
		file.close();
		return data;	
	}
	
	public void setCellData(String sheetname, int rownum, int cellno,String data) throws IOException
	{
		file = new FileInputStream(path);
		wb = new XSSFWorkbook();
		sheet =wb.getSheet(sheetname);
		rowno=sheet.getRow(rownum);
		colno=rowno.createCell(cellno);
		colno.setCellValue(data);
		FileOutputStream fo = new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		file.close();
		fo.close();
	}

}
