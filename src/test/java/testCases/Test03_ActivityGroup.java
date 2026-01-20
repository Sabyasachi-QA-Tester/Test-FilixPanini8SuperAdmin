package testCases;

import org.testng.annotations.Test;

import pageObjects.ActivityGroupPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test03_ActivityGroup extends BaseClass {
	
	@Test
	public void Test_Activity() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.Click_menu();
		dp.Click_ActivityGroups();
		
		ActivityGroupPage ap = new ActivityGroupPage(driver);
		
		//ap.Click_ActivityGroups();
		ap.Search_GroupName("Test Activity 2");
		ap.Click_AddNewActivityGroup();
		ap.Set_GroupName(randomeString().toLowerCase());
		ap.Set_SelectBooks("Sparkle-1");
		ap.Set_Activities("Continental Math Quest");
		ap.Set_SchoolGroups("Test Group 1");
		ap.Click_CreateGroup();
		
		
	}

}
