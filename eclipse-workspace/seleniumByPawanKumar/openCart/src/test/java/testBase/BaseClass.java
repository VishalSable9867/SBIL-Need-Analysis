package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.readfromproperties;

public class BaseClass extends readfromproperties{
	public static WebDriver driver;
	
	//@Parameters("browser")
	@BeforeClass //(groups= {"sanity","master","regression"})
	public void Setup() throws IOException
	{
//		switch(br.toLowerCase())
//		{
//		case "chrome": driver  = new ChromeDriver(); break;
//		case "edge" : driver = new EdgeDriver(); break;
//		case "firefox" : driver = new FirefoxDriver(); break;
//		default: System.out.println("Not available"); return;
//		}
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(readfromproperty("URL1"));
		driver.manage().window().maximize();
	}
	
	@AfterClass // (groups= {"sanity","master","regression"})
	public void close()
	{
		driver.close();
	}

	public String randomString()
	{
		String name=RandomStringUtils.randomAlphabetic(6);
		return name;
	}
	public String randomNumber()
	{
		String ph=RandomStringUtils.randomNumeric(10);
		return ph;
	}
	public String randomAlphaNumeric()
	{
		String name=RandomStringUtils.randomAlphabetic(3);
		String num = RandomStringUtils.randomNumeric(2);
		return (name+""+num);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}


	
}
