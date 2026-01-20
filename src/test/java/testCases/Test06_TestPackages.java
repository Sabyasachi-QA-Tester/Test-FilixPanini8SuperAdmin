package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.TestPackagesPage;
import testBase.BaseClass;

public class Test06_TestPackages extends BaseClass {
	
	@Test
	public void Test_TestPackages() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.Click_menu();
		dp.Click_TestPackage();
		
		TestPackagesPage tp = new TestPackagesPage(driver);
		
		tp.Click_Courses();
		tp.Search_CourseName("test");
		tp.Click_AddNewCourse();
		tp.Set_CourseName(randomeString().toLowerCase());
		tp.Set_Description(randomeString().toLowerCase());
		tp.Set_Classes("Class 1");
		tp.Click_CreateCourse();
		
		
		
	}
	
}
