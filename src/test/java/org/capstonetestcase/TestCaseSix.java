package org.capstonetestcase;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Hritik.Capstone_Automation.BaseconfigCapstone;
import Hritik.Capstone_Automation.pageObjects.Cart;
import Hritik.Capstone_Automation.pageObjects.HomePage;
import Hritik.Capstone_Automation.pageObjects.Login;
import Hritik.Capstone_Automation.pageObjects.ProductInfo;
import Hritik.Capstone_Automation.pageObjects.Products;
import configFile.configProperties;

public class TestCaseSix extends BaseconfigCapstone {
	
	
	WebDriver driver;
	HomePage homepageObj;
	Products productObj;
	Login loginSignupObj;
	ProductInfo productInfoObj;


	
    @Parameters({"Port"})
    @BeforeClass
public void initialSetup (String Port) throws MalformedURLException{
   	
   configProperties.initializePropertyFile();
	
	driver=setUp(Port);
	homepageObj = new HomePage(driver);
	loginSignupObj = new Login(driver);
	productObj= new Products(driver);
	productInfoObj = new ProductInfo (driver);
	
}
    
    @Test
	public void tc6Scenarios () throws InterruptedException {
		
		
		
		homepageObj.clickProduct();
		productObj.verifyAllPrdcts();
		productObj.viewProduct();
		productInfoObj.verifyReviewSection();
		driver.quit();
	}
	
	
	
	
}
