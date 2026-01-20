package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage extends BasePage {

	public UsersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search by name or email']")
	WebElement txt_Username;
	
	@FindBy(xpath="//a[@href='/admin/user/create']")
	WebElement btn_AddNewUser;
	
	@FindBy(xpath="//input[@placeholder='Enter email address']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@placeholder='Enter full name']")		
	WebElement txt_FullName;
	
	@FindBy(xpath="//input[@placeholder='Enter address']")
	WebElement txt_Address;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//input[@placeholder='Enter phone number']")
	WebElement txt_Phone;
	
	@FindBy(xpath="//button[normalize-space()='Create User']")
	WebElement btn_CreateUser;
	
	@FindBy(xpath="(//button[@title='Delete user'])[1]")
	WebElement btn_Delete;
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement btn_ConfirmDelete;
	
	public void Search_UserName(String uname) throws InterruptedException {
		Thread.sleep(2000);
		txt_Username.sendKeys(uname);
	}
	
	public void Click_AddNewUser() throws InterruptedException {
		Thread.sleep(2000);
		btn_AddNewUser.click();
	}
	
	public void Set_Email(String email) throws InterruptedException {
		Thread.sleep(2000);
		txt_Email.sendKeys(email);
	}
	
	public void Set_FullName(String name) throws InterruptedException {
		Thread.sleep(2000);
		txt_FullName.sendKeys(name);
	}
	
	public void Set_Address(String address) throws InterruptedException {
		Thread.sleep(2000);
		txt_Address.sendKeys(address);
	}
	
	public void Set_DOB(String dob) throws InterruptedException {
		Thread.sleep(2000);
		txt_DOB.sendKeys(dob);
	}
	
	public void Set_Phone(String phone) throws InterruptedException {
		Thread.sleep(2000);
		txt_Phone.sendKeys(phone);
	}
	
	public void Set_Gender(String gender) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='gender']//option[@value='"+gender+"']")).click();
	}
	
	public void Click_CreateUser() throws InterruptedException {
		Thread.sleep(2000);
		btn_CreateUser.click();
	}
	
	public void Click_Delete() throws InterruptedException {
		Thread.sleep(2000);
		btn_Delete.click();
	}
	
	public void Verify_Delete() throws InterruptedException {
		Thread.sleep(2000);
		btn_ConfirmDelete.click();
	}

}
