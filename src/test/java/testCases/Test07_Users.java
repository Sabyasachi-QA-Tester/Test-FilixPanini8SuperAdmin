package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.UsersPage;
import testBase.BaseClass;

public class Test07_Users extends BaseClass {
	
	@Test
	public void Test_Users() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.Click_menu();
		dp.Click_Users();
		
		UsersPage up = new UsersPage(driver);
		up.Search_UserName("Arjun1");
		up.Click_AddNewUser();
		up.Set_Email(randomeString()+"@gmail.com");
		up.Set_FullName(randomeString().toLowerCase());
		up.Set_Address("kolkata");
		up.Set_DOB("05/12/1990");
		up.Set_Phone(randomeNumber());
		up.Set_Gender("male");
		up.Click_CreateUser();
		up.Click_Delete();
		up.Verify_Delete();
		
	}

}
