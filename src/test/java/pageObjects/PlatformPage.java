package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlatformPage extends BasePage {

	public PlatformPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search classes by name...']")
	WebElement txt_Search;
	
	@FindBy(xpath="//a[@href='/admin/class-management/create']")
	WebElement btn_AddNewClass;
	
	@FindBy(xpath="//input[@placeholder='e.g., Kindergarten, Grade 1, etc. ']")
	WebElement txt_ClassName;
	
	@FindBy(xpath="//input[@placeholder='Section 1 (e.g., A, B, Morning)']")
	WebElement txt_SectionNames;
	
	@FindBy(xpath="//button[normalize-space()='Add Another Section']")
	WebElement btn_AddSection;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement btn_SectionDel;
	
	@FindBy(xpath="//input[@placeholder='e.g., 5']")
	WebElement txt_Age;
	
	@FindBy(xpath="//button[@role='combobox']")
	WebElement btn_Theme;
	
	@FindBy(xpath="//input[@placeholder='Search themes...']")
	WebElement txt_SearchTheme;
	
	@FindBy(xpath="//li[2]//button[1]")
	WebElement btn_ListTheme;
	
	@FindBy(xpath="//button[normalize-space()='Create Class']")
	WebElement btn_CreateClass;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement btn_Cancel;
	
	@FindBy(xpath="//button[@aria-label='Go back to themes']")
	WebElement btn_BackTheme;
	
	@FindBy(xpath="//div[contains(@class,'hidden sm:grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-2 gap-4')]//div[8]//div[1]//div[2]//button[2]")
	WebElement btn_delete;
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement Verify_delete;
	
	@FindBy(xpath="//a[@href='/admin/activity/skills/list']")
	WebElement btn_Skills;
	
	@FindBy(xpath="//a[@href='/admin/activity/skills/create']")
	WebElement btn_AddNewSkills;
	
	@FindBy(xpath="//input[@placeholder='Enter skill title']")
	WebElement txt_SkillTitle;
	
	@FindBy(xpath="//button[normalize-space()='Create Skill']")
	WebElement btn_CreateSkill;
	
	@FindBy(xpath="//a[@href='/admin/activity/listcompetency']")
	WebElement btn_Competency;
	
	@FindBy(xpath="//input[@placeholder='Search competencies...']")
	WebElement txt_SearchCompetencies;
	
	@FindBy(xpath="//button[normalize-space()='Add Competency']")
	WebElement btn_AddCompetency;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement txt_CompetencyTitle;
	
	@FindBy(xpath="//button[normalize-space()='Create Competency']")
	WebElement btn_CreateCompetency;
	
	
	public void Search_Classes(String classes) throws InterruptedException {
		Thread.sleep(2000);
		txt_Search.sendKeys(classes);
	}
	
	public void Click_AddNewClass() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddNewClass.click();
	}
	
	public void Set_ClassName(String cname) throws InterruptedException {
		Thread.sleep(2000);
		txt_ClassName.sendKeys(cname);
	}
	
	public void Set_SectionName(String sname) throws InterruptedException {
		Thread.sleep(2000);
		txt_SectionNames.sendKeys(sname);
	}
	
	public void Click_AddAnotherSection() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddSection.click();
	}
	
	public void Click_SectionDelete() throws InterruptedException {
		Thread.sleep(2000);
		btn_SectionDel.click();
	}
	
	public void Set_Age(String age) throws InterruptedException {
		Thread.sleep(2000);
		txt_Age.sendKeys(age);
	}
	
	public void Click_Theme() throws InterruptedException {
		Thread.sleep(2000);
		btn_Theme.click();
	}
	
	public void Search_Theme(String theme) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchTheme.sendKeys(theme);
	}
	
	public void Click_ListTheme() throws InterruptedException {
		Thread.sleep(2000);
		btn_ListTheme.click();
	}
	
	public void Click_CreateClass() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateClass.click();
	}
	
	public void Click_Cancel() throws InterruptedException {
		Thread.sleep(2000);
		btn_Cancel.click();
	}
	
	public void Click_Back() throws InterruptedException {
		Thread.sleep(2000);
		btn_BackTheme.click();
	}
	
	public void Click_Delete() throws InterruptedException {
		Thread.sleep(2000);
		btn_delete.click();
	}
	
	public void Verify_Delete() throws InterruptedException {
		Thread.sleep(2000);
		Verify_delete.click();
	}
	
	public void Click_Skills() throws InterruptedException {
		Thread.sleep(2000);
		btn_Skills.click();
	}
	
	public void Click_AddNewSkill() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddNewSkills.click();
	}
	
	public void Set_Skill(String skill) throws InterruptedException {
		Thread.sleep(2000);
		txt_SkillTitle.sendKeys(skill);
	}
	
	public void Click_CreateSkill() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateSkill.click();
	}
	
	public void Click_Competency() throws InterruptedException {
		Thread.sleep(2000);
		btn_Competency.click();;
	}
	
	public void Search_Competency(String comp) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchCompetencies.sendKeys(comp);
	}
	
	public void Click_AddCompetency() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddCompetency.click();
	}
	
	public void Set_Competency(String title) throws InterruptedException {
		Thread.sleep(2000);
		txt_CompetencyTitle.sendKeys(title);
	}
	
	public void Click_CreateCompetency() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateCompetency.click();
	}
	
}
