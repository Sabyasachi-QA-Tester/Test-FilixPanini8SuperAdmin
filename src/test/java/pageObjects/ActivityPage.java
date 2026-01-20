package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityPage extends BasePage {

	public ActivityPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search by title']")
	WebElement txt_ACtivityTitle;
	
	@FindBy(xpath="//button[normalize-space()='Add New Acitivity']")
	WebElement btn_AddNewActivity;
	
	@FindBy(xpath="//input[@placeholder='Enter activity title']")
	WebElement txt_Title;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement txt_Description;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement btn_CoverImage;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btn_Continue;
	
	@FindBy(xpath="//input[@class='react-select__input']")
	WebElement txt_Class;
	
	@FindBy(xpath="//input[@placeholder='Enter age']")
	WebElement txt_Age;
	
	@FindBy(xpath="//button[normalize-space()='Add Class-Age Pair']")
	WebElement btn_AddClassAgePair;
	
	@FindBy(xpath="//div[@class='jsx-137e53b1f21c3f42 mt-6']//div[2]//div[1]//div[3]//button[1]")
	WebElement btn_Delete;
	
	@FindBy(xpath="(//input[@role='combobox'])[1]")
	WebElement txt_BookName;
	
	@FindBy(xpath="(//input[@class='react-select__input'])[2]")
	WebElement txt_Chapters;
	
	@FindBy(xpath="//button[normalize-space()='Add Competency-Skill Pair']")
	WebElement btn_AddCompetencySkill;
	
	@FindBy(xpath="(//input[@role='combobox'])[1]")
	WebElement txt_Competency;
	
	@FindBy(xpath="(//input[@role='combobox'])[2]")
	WebElement txt_Skill;
	
	@FindBy(xpath="//textarea[@placeholder='Enter competency explanation']")
	WebElement txt_CompetencyExplain;
	
	@FindBy(xpath="//textarea[@placeholder='Enter skill explanation']")
	WebElement txt_SkillExplain;
	
	@FindBy(xpath="//textarea[@placeholder='Enter rubric']")
	WebElement txt_Rubric;
	
	@FindBy(xpath="//input[@id='file']")
	WebElement btn_PDFUpload;
	
	@FindBy(xpath="//button[normalize-space()='Create']")
	WebElement btn_Create;
	
	public void Search_Title(String title) throws InterruptedException {
		Thread.sleep(2000);
		txt_ACtivityTitle.sendKeys(title);
	}
	
	public void Click_AddNewActivity() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddNewActivity.click();
	}
	
	public void Set_Title(String title) throws InterruptedException {
		Thread.sleep(2000);
		txt_Title.sendKeys(title);
	}
	
	public void Set_Description(String desc) throws InterruptedException {
		Thread.sleep(2000);
		txt_Description.sendKeys(desc);
	}
	
	public void Set_CoverImage(String file) throws InterruptedException {
		Thread.sleep(2000);
		btn_CoverImage.sendKeys(file);
	}
	
	public void btn_Continue() throws InterruptedException {
		Thread.sleep(2000);
		btn_Continue.click();
	}
	
	public void Set_Class(String Class) throws InterruptedException {
		Thread.sleep(2000);
		txt_Class.sendKeys(Class);
	}
	
	public void Set_Age(String age) throws InterruptedException {
		Thread.sleep(2000);
		txt_Age.sendKeys(age);
	}
	
	public void Click_AddClassAgePair() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddClassAgePair.click();
	}
	
	public void Click_Delete() throws InterruptedException {
		Thread.sleep(2000);
		btn_Delete.click();
	}
	
	public void Set_BookName(String bname) throws InterruptedException {
		Thread.sleep(2000);
		txt_BookName.sendKeys(bname);
	}
	
	public void Set_Chapters(String cname) {
		try {
			Thread.sleep(2000);
			txt_Chapters.sendKeys(cname);
		} 
		catch (Exception e) {
			System.out.println("Failed to set the chapter:" +e.getMessage());
		}
	}
	
	public void Click_AddCompetencySkill() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddCompetencySkill.click();
	}
	
	public void Set_Competency(String comp) throws InterruptedException {
		Thread.sleep(2000);
		txt_Competency.sendKeys(comp);
	}
	
	public void Set_Skill(String skill) throws InterruptedException {
		Thread.sleep(2000);
		txt_Skill.sendKeys(skill);
	}
	
	public void Set_CompetencyExplain(String compE) throws InterruptedException {
		Thread.sleep(2000);
		txt_CompetencyExplain.sendKeys(compE);
	}
	
	public void Set_SkillExplain(String skillE) throws InterruptedException {
		Thread.sleep(2000);
		txt_SkillExplain.sendKeys(skillE);
	}
	
	public void Set_Rubric(String rubric) throws InterruptedException {
		Thread.sleep(2000);
		txt_Rubric.sendKeys(rubric);
	}
	
	public void Set_PDFUpload(String file) throws InterruptedException {
		Thread.sleep(2000);
		btn_PDFUpload.sendKeys(file);
	}
	
	public void Click_Create() throws InterruptedException {
		Thread.sleep(2000);
		btn_Create.click();
	}
	
	

}
