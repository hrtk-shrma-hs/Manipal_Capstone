package org.capstonetestcase;

import java.io.IOException;
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

public class TestCaseOne extends BaseconfigCapstone {
	
	
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
	public void tc1Scenarios () throws IOException {
		
		homepageObj.verifyHome();
		homepageObj.clickSignup();
		loginSignupObj.signupCheck();
		registrationObj.userRegistration();
		createaccObj.createdAccount();		
		homepageObj.deleteAccount();
		deleteaccObj.deletedAccount();
		
		
		driver.quit();
	}
	
	

}


//
//<class name="org.capstonetestcase.TestCaseTwo"/>
//<class name="org.capstonetestcase.TestCaseThree"/>
// <class name="org.capstonetestcase.TestCaseFour"/>
//  <class name="org.capstonetestcase.TestCaseFive"/>
//   <class name="org.capstonetestcase.TestCaseSix"/>
