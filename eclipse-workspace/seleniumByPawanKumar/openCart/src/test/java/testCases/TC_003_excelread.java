package testCases;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;
import Utilities.dataproviderss;
import pageObjects.HomePage;
import pageObjects.logInPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;

public class TC_003_excelread extends BaseClass implements ITestListener {

	@Test(dataProvider="LoginData",dataProviderClass=dataproviderss.class)
	public void verify_loginDDT(String email, String password, String status)
	{
		try
		{
			HomePage h = new HomePage(driver);  // HomePage
			h.my_accnt_btn1();
			h.loginButton();
			logInPage l= new logInPage(driver); //LoginPage
			l.EmailAddress(email);
			l.password1(password);
			l.loginbtn();
			myAccountPage ma = new myAccountPage(driver);  // MyAccountPage
     		Boolean exp=ma.myAccountPageName();
     		if(status.equalsIgnoreCase("valid"))
     		{
     			if(exp == true)
     			{
     				ma.logoutbtn();
     				Assert.assertTrue(true);
     			}
     			else
     			{
     				Assert.assertTrue(false);
     			}	
     		}
     		if(status.equalsIgnoreCase("Invalid"))
     		{
     			if(exp == true)
     			{
     				ma.logoutbtn();
     				Assert.assertTrue(false);
     			}
     			else
     			{
     				Assert.assertTrue(true);
     			}
     		}
		}
		catch(Exception e)
		{
			e.getMessage();
			Assert.fail();
		}
	}
	public void OntestSuccess()
	{
		System.out.println("Successfully executed");
	}
	public void Ontestfailure()
	{
		System.out.println("Failed");
	}
	public void Ontestskipped()
	{
		System.out.println("Skippped");
	}
	
}

