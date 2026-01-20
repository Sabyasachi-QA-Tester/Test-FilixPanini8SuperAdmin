package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityGroupPage extends BasePage {

	public ActivityGroupPage(WebDriver driver) {
		super(driver);
	}
	
//	@FindBy(xpath="//a[@href='/admin/groups']")
//	WebElement btn_ActivityGroup;
	
	@FindBy(xpath="//input[@placeholder='Search by group name']")
	WebElement txt_SearchGroupName;
	
	@FindBy(xpath="//a[@href='/admin/groups/create']")
	WebElement btn_AddNewActivityGroup;
	
	@FindBy(xpath="//input[@placeholder='Enter activity group name']")
	WebElement txt_GroupName;
	
	@FindBy(xpath="(//input[@class='react-select__input'])[1]")
	WebElement txt_SelectBooks;
	
	@FindBy(xpath="(//input[@class='react-select__input'])[2]")
	WebElement txt_SelectActivities;
	
	@FindBy(xpath="(//input[@class='react-select__input'])[3]")
	WebElement txt_AssignSchool;
	
	@FindBy(xpath="//button[normalize-space()='Create Group']")
	WebElement btn_CreateGroup;
	
//	public void Click_ActivityGroups() throws InterruptedException {
//		Thread.sleep(2000);
//		btn_ActivityGroup.click();
//	}
	
	public void Search_GroupName(String group) {
		txt_SearchGroupName.sendKeys(group);
	}
	
	public void Click_AddNewActivityGroup() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddNewActivityGroup.click();
	}
	
	public void Set_GroupName(String gname) throws InterruptedException {
		Thread.sleep(2000);
		txt_GroupName.sendKeys(gname);
	}
	
	public void Set_SelectBooks(String sbooks) throws InterruptedException {
		Thread.sleep(2000);
		txt_SelectBooks.sendKeys(sbooks);
	}
	
	public void Set_Activities(String activity) throws InterruptedException {
		Thread.sleep(2000);
		txt_SelectActivities.sendKeys(activity);
	}
	
	public void Set_SchoolGroups(String groups) throws InterruptedException {
		Thread.sleep(2000);
		txt_AssignSchool.sendKeys(groups);
	}
	
	public void Click_CreateGroup() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateGroup.click();
	}
	
	
}
