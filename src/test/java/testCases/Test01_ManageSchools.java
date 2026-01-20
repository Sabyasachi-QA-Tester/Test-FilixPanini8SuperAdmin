package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.ManagePage;
import testBase.BaseClass;

public class Test01_ManageSchools extends BaseClass {
	
	@Test
	public void Test_ManageSchool() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.Click_menu();
		dp.Click_ManageSchool();
		
		ManagePage mp = new ManagePage(driver);
		
		mp.Search_Schools("RKM");
//		mp.Pagination();
		mp.Click_AddNewSchool();
		//mp.Click_SchoolIcon("C:\\Users\\CHEENTA\\Pictures\\Screenshots\\New folder");
		mp.Set_SchoolName(randomeString());
		mp.Set_Address("kolkata");
		mp.Set_Description("Testing");
		mp.Set_Phone(randomeNumber());
		//mp.Set_CoverImage("C:\\Users\\CHEENTA\\Pictures\\Screenshots\\New folder");
		mp.Set_Admins("Arjun Sen21");
		//mp.Click_DeleteAdmin();
		mp.Click_CreateSchool();
		mp.Click_Delete();
		mp.Verify_Delete();
		mp.Click_View();
		mp.Click_Teachers();
		mp.Click_Students();
		mp.Click_Admins();
		mp.Click_ClassManagement();
		mp.Click_Sessions();
		mp.Click_Cohorts();
		
		
	}

}
