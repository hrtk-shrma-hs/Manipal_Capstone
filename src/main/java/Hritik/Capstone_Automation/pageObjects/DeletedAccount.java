package Hritik.Capstone_Automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeletedAccount {
	 WebDriver driver;
		
		public DeletedAccount(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
		 @FindBy(xpath="//*[text()='Account Deleted!']")
		 public WebElement DeletedAccountLbl;
		 
		 
		 @FindBy(xpath="//*[text()='Continue']")
		 public WebElement continueButton;
		 
		  @FindBy(xpath="//*[text()=' Logout']")
		  public WebElement Logout;
		
		 
		 public void deletedAccount () {
			 
		
			 
		//	Assert.assertTrue(DeletedAccountLbl.isDisplayed()); 
			 
		//	 continueButton.click();
			  
			 
		 }
		 
		 public void DeletedAccount2 () {
			 DeletedAccountLbl.isDisplayed();
			 
		 }

}
