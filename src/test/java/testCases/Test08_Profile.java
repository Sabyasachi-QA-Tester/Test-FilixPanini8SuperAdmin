package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import testBase.BaseClass;

public class Test08_Profile extends BaseClass {
	
	@Test
	public void Test_Profile() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();

		
		DashboardPage dp = new DashboardPage(driver);
		dp.Click_menu();
		dp.Click_Profile();
		
		
		ProfilePage pp = new ProfilePage(driver);
		
		pp.Click_EditProfile();
		pp.Set_name(randomeString().toLowerCase());
		pp.Set_DOB("05/10/2014");
		pp.Set_Gender("male");
		pp.Set_Phone(randomeNumber());
		pp.Set_Address(randomeString().toLowerCase());
		pp.Click_Save();
		
		
		
	}

}
