package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPackagesPage extends BasePage {

	public TestPackagesPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@href='/admin/test-packages/courses']")
	WebElement btn_ViewCourses;
	
	@FindBy(xpath="//input[@placeholder='Search by Course name']")
	WebElement txt_SearchCourseName;
	
	@FindBy(xpath="//a[@href='/admin/test-packages/courses/create']")
	WebElement btn_AddNewCourse;
	
	@FindBy(xpath="//input[@placeholder='Enter course name']")
	WebElement txt_CourseName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter course description']")
	WebElement txt_Description;
	
	@FindBy(xpath="//div[contains(@class,'select__control')]//input[@role='combobox']")
	WebElement txt_Classes;
	
	@FindBy(xpath="//button[normalize-space()='Create Course']")
	WebElement btn_CreateCourse;
	
	public void Click_Courses() {
		
		try {
			Thread.sleep(2000);
			btn_ViewCourses.click();
		} 
		
		catch (Exception e) {
			System.out.println("Failed to click Element: "+e.getMessage());
		}
		
	}
	
	public void Search_CourseName(String sname) throws InterruptedException {
		Thread.sleep(2000);
		txt_SearchCourseName.sendKeys(sname);
	}
	
	public void Click_AddNewCourse() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(btn_AddNewCourse));
	}
	
	public void Set_CourseName(String cname) throws InterruptedException {
		Thread.sleep(2000);
		txt_CourseName.sendKeys(cname);
	}
	
	public void Set_Description(String desc) throws InterruptedException {
		Thread.sleep(2000);
		txt_Description.sendKeys(desc);
	}
	
	public void Set_Classes(String classes) throws InterruptedException {
		Thread.sleep(2000);
		txt_Classes.sendKeys(classes);
	}
	
	public void Click_CreateCourse() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateCourse.click();
	}
	

}
