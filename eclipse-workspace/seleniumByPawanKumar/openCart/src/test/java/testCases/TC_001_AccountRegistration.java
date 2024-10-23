package testCases;

import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjects.HomePage;
import pageObjects.registerAccount;
import testBase.BaseClass;
public class TC_001_AccountRegistration extends BaseClass {
	//Logger logger;
	@Test(groups= {"sanity","master"})
	public void registration() throws InterruptedException
	{
		// LogManager.getLogger(this.getClass()); // instance of logger
		// logger=LogManager.getLogger(this.getClass());  need .xml files
		//logger.info("***LOading main method************"); // all->Trace->debug->info->warn->error->fatal->off
		
			HomePage gm = new HomePage(driver);
			Date d = new Date();
			Thread.sleep(2000);
			gm.my_accnt_btn1();
			gm.register_btn_cl();
			Thread.sleep(2000);
			registerAccount ra = new registerAccount(driver);
			ra.first_name_txt(randomString().toUpperCase());
			Thread.sleep(2000);
			ra.last_name_txt(randomString().toUpperCase());
			Thread.sleep(2000);
			ra.email_id_txt(randomString()+"@gmail.com");
			ra.phone_number_txt(randomNumber());
			String pass= randomAlphaNumeric();
			ra.password_txt(pass);
			ra.password_conf_txt(pass);
			ra.checkbx_form_btn();
			ra.submt_btn_clk();
			System.out.println(ra.confirm_msg_vrf());
			if(ra.confirm_msg_vrf().equals("Your Account Has Been Created!"))
			{
				System.out.println("Account created Successfully"+d);
			}
			else
				if(ra.confirm_msg_vrf().equals("Register Account"))
				  {
					System.out.println("Already registered exist"+d);
				  }
				    else
		          {
				    	//logger.debug("e");
				    System.out.println("Not created "+d);
	          }	
		
	}
	}
