package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.SkillsPage;
import testBase.BaseClass;

public class Test04_Skills extends BaseClass {
	
	@Test
	public void Test_Skills() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.Click_menu();
		dp.Click_Skill();
		
		
		SkillsPage sp = new SkillsPage(driver);
		sp.Click_LearnEnglish();
		sp.Click_Level();
		sp.Click_Tracker();
		sp.Click_Prepare();
		
		
		
	}

}
