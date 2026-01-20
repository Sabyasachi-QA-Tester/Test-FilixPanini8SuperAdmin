package testCases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.PlatformPage;
import testBase.BaseClass;

public class Test02_PlatformClasses extends BaseClass {
	
	@Test
	public void Test_PlatformClass() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.Click_login();
		lp.Set_email(p.getProperty("Email"));
		lp.click_OTP();
		lp.Set_OTP(p.getProperty("OTP"));
		lp.Click_verify();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.Click_menu();
		dp.Click_ManageClasses();
		
		PlatformPage pp = new PlatformPage(driver);
		
		pp.Search_Classes("Class 3");
		pp.Click_AddNewClass();
		pp.Set_ClassName(randomeString().toLowerCase());
		pp.Set_SectionName("A");
		pp.Click_AddAnotherSection();
		pp.Click_SectionDelete();
		pp.Set_Age("6");
		pp.Click_Theme();
		pp.Search_Theme("Around the world");
		pp.Click_ListTheme();
		pp.Click_CreateClass();
		pp.Click_Back();
		
		pp.Click_AddNewClass();
		pp.Click_Cancel();
		
		pp.Click_Delete();
		pp.Verify_Delete();
		
		pp.Click_Skills();
		pp.Click_AddNewSkill();
		pp.Set_Skill(randomeString().toLowerCase());
		pp.Click_CreateSkill();
		
		pp.Click_Competency();
		pp.Search_Competency("Numeracy");
		pp.Click_AddCompetency();
		pp.Set_Competency(randomeString().toLowerCase());
		pp.Click_CreateCompetency();
		
		
	}
	
}
