package Hritik.Capstone_Automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart {
	
	
	
 	
    WebDriver driver;
	
	                 public Cart(WebDriver driver) {
	                                             	this.driver=driver;
	                                            	PageFactory.initElements(driver, this);
	       }
	
	                @FindBy(xpath="//*[@data-product-id='1']")
	                public WebElement XButton;

	              @FindBy(xpath="//*[text()=' Cart'][@style='color: orange;']")
	         	  public WebElement Cart;
	              
	              @FindBy (xpath="//*[text()='Cart is empty!']")
	        	  public WebElement EmptyCart;
	         	  
                    
                  @FindBy(xpath="//i[@class='fa fa-times'][1]")
                  public WebElement RemoveProdct1;
              	  
              	  @FindBy(xpath="//i[@class='fa fa-times'][1]")
              	  public WebElement RemoveProdct2;
              	  
              	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
              	  public WebElement RemoveProdct3;
              	  
              	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
              	  public WebElement RemoveProdct4;
              	  
              	  @FindBy(xpath = "//a[@class='cart_quantity_delete']")
              	  public WebElement RemoveProdct5;
              	  
              	@FindBy(xpath = "//a[text()='Sleeveless Dress']")
                public WebElement p1;
                
                @FindBy(xpath = "//a[text()='Stylish Dress']")
                public WebElement p2;
                
                @FindBy(xpath = "//a[text()='Sleeves Top and Short - Blue & Pink']")
                public WebElement p3;
                
                @FindBy(xpath = "//a[text()='Sleeveless Unicorn Patch Gown - Pink']")
                public WebElement p4;
                
                @FindBy(xpath = "//a[text()='Cotton Mull Embroidered Dress']")
                public WebElement p5;
                
                @FindBy(xpath = "//a[text()='Blue Cotton Indie Mickey Dress']")
                public WebElement p6;
                
                @FindBy(xpath = "//a[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']")
                public WebElement p7;
                
                @FindBy(xpath = "//a[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']")
                public WebElement p8;
                
                @FindBy(xpath = "//a[text()='Rose Pink Embroidered Maxi Dress']")
                public WebElement p9;
                    
              	  public void cartTest () throws InterruptedException
            	  {
            		  Assert.assertEquals(Cart.isDisplayed(), true);
            		  RemoveProdct1.click();
            		  Thread.sleep(2000);
            		  RemoveProdct2.click();
            		  Thread.sleep(2000);
            		  RemoveProdct3.click();
            		  Thread.sleep(2000);
            		  RemoveProdct4.click();
            		  Thread.sleep(2000);
            		  RemoveProdct5.click();
            		  
            		  //Assert.assertTrue(EmptyCart.isDisplayed());
            	  }
              	  
              	  public void verifyPro () {
              		  
              		  Assert.assertTrue(p1.isDisplayed());
              		  Assert.assertTrue(p2.isDisplayed());
              		  Assert.assertTrue(p3.isDisplayed());
              		  Assert.assertTrue(p4.isDisplayed());
              		  Assert.assertTrue(p5.isDisplayed());
              		  Assert.assertTrue(p6.isDisplayed());
              		  Assert.assertTrue(p7.isDisplayed());
              		  Assert.assertTrue(p8.isDisplayed());
              		  Assert.assertTrue(p9.isDisplayed());
              		  		  
                          		  
              	  }
	
	
}