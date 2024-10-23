package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataproviderss {

	@DataProvider(name="LoginData")

	public String[][] getData() throws Exception  
	{
		String path = "C:\\Users\\Admin\\eclipse-workspace\\seleniumByPawanKumar\\openCart\\src\\test\\resources\\DataRead.xlsx";
		excelRead er = new excelRead(path);
		int rows = er.getRowCount("calc");
		int colm=er.getCellCount("calc",1);
		String LoginData[][] = new String[rows][colm]; // to retun teo dimensional array
		for(int i=1; i<=rows; i++)
		{
			for( int j=0; j<colm; j++)
			{
				LoginData[i-1][j]=er.getCellData("calc",i, j);
			}
		}
		return LoginData;	
	}
}
