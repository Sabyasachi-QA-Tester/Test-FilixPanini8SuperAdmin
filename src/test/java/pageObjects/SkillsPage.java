package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillsPage extends BasePage {

	public SkillsPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//div[contains(@class,'rounded-xl')][4]//button[normalize-space()='Start Learning']")
	WebElement btn_LearnEnglish;
	
	@FindBy(xpath="//div[contains(@class,'space-y-4 mt-6')]//button")
	WebElement btn_level;
	
	@FindBy(xpath="//div[contains(@class,'flex flex-col h-full py-6')]//button[1]")
	WebElement btn_Tracker;
	
	@FindBy(xpath="//div[contains(@class,'flex flex-col h-full py-6')]//button[3]")
	WebElement btn_Prepare;
	
	public void Click_LearnEnglish() throws InterruptedException {
		Thread.sleep(2000);
		btn_LearnEnglish.click();
	}
	
	public void Click_Level() throws InterruptedException {
		
		for(int i=1;i<=4;i++) {
			Thread.sleep(2000);
			btn_level.click();
			break;
		}
	}
	
	public void Click_Tracker() throws InterruptedException {
		Thread.sleep(2000);
		btn_Tracker.click();
	}
	
	public void Click_Prepare() throws InterruptedException {
		Thread.sleep(2000);
		btn_Prepare.click();
	}

}
