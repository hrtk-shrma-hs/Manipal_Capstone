package Hritik.Capstone_Automation.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Products {
	
    WebDriver driver;
    Actions act;
	
	public Products(WebDriver driver) {
		this.driver=driver;
		act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='All Products']")
	public WebElement allProducts;
	
	 @FindBy(xpath="//button[text()='Continue Shopping']")
	  public WebElement Continue;

	@FindBy(xpath="//*[@id='search_product']")
	public WebElement searchBar;
	
	@FindBy(xpath="//*[@id='submit_search']")
	public WebElement searchButton;
	
	 @FindBy(xpath="//*[text()='Searched Products']")
	  public WebElement SearchedProduct;
	 
	 @FindBy(xpath="//*[@href='/login']")
		public WebElement signupLoginBtn;
	  
	
	@FindBy(xpath="(//a[text()='Add to cart'])[1]")
	public WebElement Dress1;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[3]")
	public WebElement Dress2;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[5]")
	public WebElement Dress3;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[7]")
	public WebElement Dress4;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[9]")
	public WebElement Dress5;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[11]")
	public WebElement Dress6;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[13]")
	public WebElement Dress7;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[15]")
	public WebElement Dress8;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[17]")
	public WebElement Dress9;
	
	@FindBy(xpath = "(//a[text()='View Product'])[1]")
    public WebElement viewProductLink;
	  
	  
	@FindBy(xpath="//*[@href='/view_cart']")
	public WebElement cartLink;
	
	public void verifyAllPrdcts () {
		 Assert.assertEquals(allProducts.isDisplayed(), true);		  
		
	}
	public void productTc () {
		searchBar.sendKeys("Dress");
		searchButton.click();
		Assert.assertEquals(SearchedProduct.isDisplayed(), true);
	}
	public void selectDress () {
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	        
	        JavascriptExecutor jss = (JavascriptExecutor) driver;
			  jss.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		
		
		act.moveToElement(Dress1).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress2).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress3).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress4).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress5).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress6).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress7).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress8).click().build().perform();
		Continue.click();
		
		act.moveToElement(Dress9).click().build().perform();
		Continue.click();
		
		cartLink.click();
		
		signupLoginBtn.click();
		
	}
	
	public void viewProduct () {
		

		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,150)", "");

		viewProductLink.click();
		 JavascriptExecutor jss = (JavascriptExecutor) driver;
		  jss.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		
		  if(driver.getTitle().equals("Automation Exercise - All Products")) 
		  {
                     viewProductLink.click();                  
			}		  
		
	}
	
	
	
	
}