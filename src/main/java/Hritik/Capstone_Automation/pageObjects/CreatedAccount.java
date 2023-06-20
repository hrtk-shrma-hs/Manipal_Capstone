package Hritik.Capstone_Automation.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreatedAccount {
	
WebDriver driver;
	
	         public CreatedAccount (WebDriver driver) {
	            	this.driver=driver;
		            PageFactory.initElements(driver, this);
     	}
	         
   
	    	  
	
	@FindBy(xpath="//*[text()='Account Created!']")
	public WebElement CreatedAccountLbl;
	
	@FindBy(xpath="//*[@data-qa='continue-button']")
	public WebElement continueButton;
	
	
	
	  public void createdAccount (){
		  
		  
	                               
		Assert.assertTrue(CreatedAccountLbl.isDisplayed());
		  continueButton.click();
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		  
		  if(driver.getTitle().equals("Automation Exercise - Account Created")) {
		  continueButton.click();
		  }
	  }
	

	
	
}
