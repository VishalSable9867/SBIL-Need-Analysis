package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import Utilities.readfromproperties;
import pageObjects.HomePage;
import pageObjects.logInPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;

public class TC_002_MyAccountPage extends BaseClass {

	@Test (groups={"regression","master"})
	public void login()
	{
		try
		{
			HomePage h = new HomePage(driver);  // HomePage
			h.my_accnt_btn1();
			h.loginButton();
			logInPage l= new logInPage(driver); //LoginPage
			readfromproperties rd = new readfromproperties();
			l.EmailAddress(rd.readfromproperty("Username"));
			l.password1(rd.readfromproperty("password"));
			l.loginbtn();
			myAccountPage ma = new myAccountPage(driver);  // MyAccountPage
			ma.myAccountPageName();
			System.out.println(ma.myAccountPageName());
			ma.logoutbtn();
		}
		catch(Exception e)
		{
			e.getMessage();
			Assert.fail();
		}
	}
	
}
