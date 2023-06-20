package org.capstonetestcase;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Hritik.Capstone_Automation.BaseconfigCapstone;
import Hritik.Capstone_Automation.pageObjects.Cart;
import Hritik.Capstone_Automation.pageObjects.HomePage;
import Hritik.Capstone_Automation.pageObjects.Login;
import Hritik.Capstone_Automation.pageObjects.Products;
import configFile.configProperties;

public class TestCaseFive extends BaseconfigCapstone {
	
	WebDriver driver;
	HomePage homepageObj;
	Cart cartObj;
	Products productObj;
	Login loginSignupObj;
	
	
	    @Parameters({"Port"})
	     @BeforeClass
	public void initialSetup (String Port) throws MalformedURLException{
	    	
	    configProperties.initializePropertyFile();
		
		driver=setUp(Port);
		homepageObj = new HomePage(driver);
		cartObj = new Cart(driver);
		loginSignupObj = new Login(driver);
		productObj= new Products(driver);
		
		
		
	}
	
	@Test
	public void tc5Scenarios () throws InterruptedException{
		
		
		homepageObj.clickProduct();
		productObj.verifyAllPrdcts();
		productObj.productTc();
		productObj.selectDress();
		loginSignupObj.loginCheck2();
		homepageObj.cartLink.click();
		cartObj.verifyPro();
		driver.quit();
		
		
	}

}
