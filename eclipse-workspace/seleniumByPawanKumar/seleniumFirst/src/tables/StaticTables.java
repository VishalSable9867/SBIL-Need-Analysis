package tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {
	// https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html
		System.setProperty("webdriver.chrome.driver","F:\\\\Software testing\\\\Selenium jars\\\\chromedriver-win32\\\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //1. Find number of rows count
		  // Approach  1
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		  System.out.println(rows);
		  // Approach 2 but this is not use most of the time because they return all tr tags in current web page
		//  int rw=driver.findElements(By.tagName("tr")).size();
		 // System.out.println(rw);
		  
		  //2.Find number of columns.
		  
		 int col = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		 System.out.println("Number of columns: "  +col);
		 
		 // Retrieval data from table 
		 
		// for(int r=2;r<rows; r++)
		// {
		// for(int c=1; c<col; c++)
		//	 {
		//		String t = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
				// System.out.println(t);
		//	 }
		// }
		 
		 // Retrieval of data particular value
		 
	      String de=driver.findElement(By.xpath("//table[@id='customers']//tr[2]//td[2]")).getText();
	      System.out.println(de);
	      
	      //Q. print company name whose contact person is Roland Mendel	
	      
	      for(int y=2; y<rows; y++)
	      {
	    	  String gx = driver.findElement(By.xpath("//table[@id='customers']//tr["+y+"]//td[2]")).getText();
	    	 
	    	  if(gx.equals("Roland Mendel"))
	    	  {
	    		String fc = driver.findElement(By.xpath("//table[@id='customers']//tr["+y+"]//td[1]")).getText();
	    		System.out.println(fc);
	    	  }
	    
	      }
	      
		

	}

}
