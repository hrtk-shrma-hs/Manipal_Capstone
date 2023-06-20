package Hritik.Capstone_Automation.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
    WebDriver driver;
	Actions act;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href='/']")
	 public WebElement Home;
	
	@FindBy(xpath="//*[@href='/login']")
	public WebElement signupLoginBtn;
	
	@FindBy(xpath="//a[text()=' Logged in as ']/b")
	public WebElement loginNameLbl;
	
	  @FindBy(xpath=" //*[text()=' Logged in as ']")
	  public WebElement loggedInAs;
	  
	  @FindBy(xpath="//*[text()=' Delete Account']")
	  public WebElement DeleteAccountBtn;
	  
	  @FindBy(xpath="//button[text()='Continue Shopping']")
	  public WebElement Continue;
	
		@FindBy(xpath="//*[@href='/products']")
		public WebElement productBtn;
	
	@FindBy(xpath="//*[@href='/view_cart']")
	public WebElement cartLink;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[1]")
	  public WebElement AddtoCart1;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[3]")
	  public WebElement AddtoCart2;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[5]")
	  public WebElement AddtoCart3;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[7]")
	  public WebElement AddtoCart4;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[9]")
	  public WebElement AddtoCart5;
	  
	  @FindBy(xpath="//*[text()=' Logout']")
	  public WebElement Logout;
	
	//ConfigProperties.property.getProperty("name")
	public void verifyHome () {
				
	    Assert.assertEquals(Home.isDisplayed(), true);	
	}
	
	public void clickSignup () {
		signupLoginBtn.click();			 
	}
	
	public void deleteAccount () {	
		loggedInAs.isDisplayed();
		DeleteAccountBtn.click();
	}
	
	public void login1() {		
	    Assert.assertEquals(Home.isDisplayed(), true);
		signupLoginBtn.click();			 		
	}
	public void loginVerify1() {
		loggedInAs.isDisplayed();
		DeleteAccountBtn.click();
	}
	
	
	public void invalidLogin () {
		
		  Assert.assertTrue(true,"homepage is displayed");
			signupLoginBtn.click();			 		
	}
	
	public void addProducts () {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		  
		
		
		 JavascriptExecutor jss = (JavascriptExecutor) driver;
	        jss.executeScript("window.scrollBy(0,250)", "");
		
		act.moveToElement(AddtoCart1).click().build().perform();
		Continue.click();
		
		   act.moveToElement(AddtoCart2).click().build().perform();
		   Continue.click();
		   
		   act.moveToElement(AddtoCart3).click().build().perform();
		   Continue.click();
		   
		   JavascriptExecutor jsq = (JavascriptExecutor) driver;
	        jsq.executeScript("window.scrollBy(0,450)", "");
		   
		   act.moveToElement(AddtoCart4).click().build().perform();
		   Continue.click();
		   
		   act.moveToElement(AddtoCart5).click().build().perform();
		   Continue.click();
		   
		   JavascriptExecutor jse = (JavascriptExecutor) driver;
	        jse.executeScript("window.scrollBy(0,-900)", "");
	        
	        cartLink.click();	
		
	}
	
	public void clickProduct () {
		productBtn.click();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		  
		  productBtn.click();
		  
		  JavascriptExecutor jss = (JavascriptExecutor) driver;
	        jss.executeScript("window.scrollBy(0,250)", "");
		
	}
	
	
}

//ad block code
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");