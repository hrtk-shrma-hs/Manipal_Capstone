package org.capstonetestcase;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Hritik.Capstone_Automation.BaseconfigCapstone;
import Hritik.Capstone_Automation.pageObjects.CreatedAccount;
import Hritik.Capstone_Automation.pageObjects.DeletedAccount;
import Hritik.Capstone_Automation.pageObjects.HomePage;
import Hritik.Capstone_Automation.pageObjects.Login;
import Hritik.Capstone_Automation.pageObjects.UserRegistration;

public class TestCaseThree extends BaseconfigCapstone {
	
	WebDriver driver;
	HomePage homepageObj;
	Login loginSignupObj;
	UserRegistration registrationObj;
	CreatedAccount createaccObj;
	DeletedAccount deleteaccObj;
	
	
	 @Parameters({"Port"})
	 @BeforeClass
public void initialSetup (String Port) throws MalformedURLException{
		
		driver=setUp(Port);
		homepageObj = new HomePage(driver);
		loginSignupObj = new Login(driver);
		registrationObj = new UserRegistration(driver);
		createaccObj = new CreatedAccount(driver);
		deleteaccObj = new DeletedAccount(driver);
		
	}
@Test
public void t3Scenarios () {
	
	
	    homepageObj.verifyHome();			
	    homepageObj.clickSignup();
	    loginSignupObj.invalidLogin();
	    driver.quit();
	    
}

	
	
	
	
	
	
	
	
	
	

}
