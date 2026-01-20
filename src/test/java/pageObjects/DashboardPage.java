package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='bg-gray-100 rounded-lg p-3 text-gray-700 focus:outline-none hover:bg-gray-200']")
	WebElement btn_menu;
	
	@FindBy(xpath="//a[@href='/admin/dashboard']")
	WebElement btn_ManageSchool;
	
	@FindBy(xpath="//a[@href='/admin/class-management/list' and normalize-space()='Platform Classes']")
	WebElement btn_PlatformClasses;
	
	@FindBy(xpath="//a[@href='/admin/skills']")
	WebElement btn_Skill;
	
	@FindBy(xpath="//a[@href='/admin/activity']")
	WebElement btn_Activity;
	
	@FindBy(xpath="//a[@href='/admin/groups']")
	WebElement btn_ActivityGroups;
	
	@FindBy(xpath="//a[@href='/admin/test-packages']")
	WebElement btn_TestPackage;
	
	@FindBy(xpath="//a[@href='/admin/user/list' and normalize-space()='Users']")
	WebElement btn_Users;
	
	@FindBy(xpath="//a[@href='/admin/license/list' and normalize-space()='License']")
	WebElement btn_License;
	
	@FindBy(xpath="//a[@href='/admin/profile']")
	WebElement btn_Profile;
	
	@FindBy(xpath="//button[normalize-space()='Logout']")
	WebElement btn_Logout;
	
	public void Click_menu() throws InterruptedException {
		Thread.sleep(2000);
		btn_menu.click();
	}
	
	public void Click_ManageSchool() throws InterruptedException {
		Thread.sleep(2000);
		btn_ManageSchool.click();
	}
	
	public void Click_ManageClasses() throws InterruptedException {
		Thread.sleep(2000);
		btn_PlatformClasses.click();
	}
	
	public void Click_Skill() throws InterruptedException {
		Thread.sleep(2000);
		btn_Skill.click();
	}
	
	public void Click_Activity() throws InterruptedException {
		Thread.sleep(2000);
		btn_Activity.click();
	}
	
	public void Click_ActivityGroups() throws InterruptedException {
		Thread.sleep(2000);
		btn_ActivityGroups.click();
	}
	
	public void Click_TestPackage() throws InterruptedException {
		Thread.sleep(2000);
		btn_TestPackage.click();
	}
	
	public void Click_Users() throws InterruptedException {
		Thread.sleep(2000);
		btn_Users.click();
	}
	
	public void Click_Profile() throws InterruptedException {
		Thread.sleep(2000);
		btn_Profile.click();
	}
	
}
