package Hritik.Capstone_Automation.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductInfo {
	
    WebDriver driver;
	
	public ProductInfo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
    @FindBy(xpath="//*[text()='Write Your Review']")	 
	public WebElement writeReview;
	
	 
	@FindBy(xpath="//*[@id='name']")
	public WebElement name;
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='review']")
	public WebElement review;
	
	@FindBy(xpath="//*[@id='button-review']")
	public WebElement submitReview;
	
	@FindBy(xpath="//*[text()='Thank you for your review.']")
	public WebElement thanksMsg;
	
	
	public void verifyReviewSection () {
		
		 
		  JavascriptExecutor jss = (JavascriptExecutor) driver;
	        jss.executeScript("window.scrollBy(0,250)", "");
	        
	        
		Assert.assertTrue(writeReview.isDisplayed());
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	        
		name.sendKeys("hritik");
		email.sendKeys("hritik@email.com");
		review.sendKeys("nice product");

		  JavascriptExecutor sss = (JavascriptExecutor) driver;
	        sss.executeScript("window.scrollBy(0,250)", "");
		submitReview.click();
		
		Assert.assertTrue(thanksMsg.isDisplayed());
		
		
		
	}

}