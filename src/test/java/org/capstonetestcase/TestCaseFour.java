package org.capstonetestcase;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Hritik.Capstone_Automation.BaseconfigCapstone;
import Hritik.Capstone_Automation.pageObjects.Cart;
import Hritik.Capstone_Automation.pageObjects.HomePage;

public class TestCaseFour extends BaseconfigCapstone {

	
	WebDriver driver;
	HomePage homepageObj;
	Cart cartObj;
	
	
	    @Parameters({"Port"})
	     @BeforeClass
	public void initialSetup (String Port) throws MalformedURLException{
		
		driver=setUp(Port);
		homepageObj = new HomePage(driver);
		cartObj = new Cart(driver);
		
		
		
	}
	
	@Test
	public void tc4Scenarios () throws InterruptedException{
		homepageObj.verifyHome();
		homepageObj.addProducts();
		cartObj.cartTest();
		driver.quit();
	}
}
