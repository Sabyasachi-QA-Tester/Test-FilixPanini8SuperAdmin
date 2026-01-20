package testCases;

import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Test05_Activity extends BaseClass {
	
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
		dp.Click_Activity();
		
		ActivityPage ap = new ActivityPage(driver);
		
		ap.Search_Title("Feelings");
		ap.Click_AddNewActivity();
		ap.Set_Title(randomeString().toLowerCase());
		ap.Set_Description(randomeString().toLowerCase());
		ap.Set_CoverImage("C:\\Users\\CHEENTA\\Pictures\\Screenshots\\New folder");
		ap.btn_Continue();
		
		ap.Set_Class("KG 1");
		ap.Set_Age("5");
		ap.Click_AddClassAgePair();
		ap.Click_Delete();
		ap.btn_Continue();
		
		ap.Set_BookName("Sparkle");
		ap.Set_Chapters("The vowels");
		ap.btn_Continue();
		
		ap.Click_AddCompetencySkill();
		ap.Set_Competency("Numeracy");
		ap.Set_Skill("Creativity");
		ap.Set_CompetencyExplain(randomeString().toLowerCase());
		ap.Set_SkillExplain(randomeString().toLowerCase());
		ap.Set_Rubric(randomeString().toLowerCase());
		ap.btn_Continue();
		
		ap.Set_PDFUpload("C:\\Users\\CHEENTA\\Pictures\\Screenshots\\New folder");
		ap.Click_Create();
		
	}
	
}
