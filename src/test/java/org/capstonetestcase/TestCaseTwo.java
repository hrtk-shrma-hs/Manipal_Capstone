package org.capstonetestcase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Hritik.Capstone_Automation.BaseconfigCapstone;
import Hritik.Capstone_Automation.pageObjects.CreatedAccount;
import Hritik.Capstone_Automation.pageObjects.DeletedAccount;
import Hritik.Capstone_Automation.pageObjects.HomePage;
import Hritik.Capstone_Automation.pageObjects.Login;
import Hritik.Capstone_Automation.pageObjects.UserRegistration;
import configFile.configProperties;

public class TestCaseTwo extends BaseconfigCapstone{
	
	WebDriver driver;
	HomePage homepageObj;
	Login loginSignupObj;
	UserRegistration registrationObj;
	CreatedAccount createaccObj;
	DeletedAccount deleteaccObj;
	String port;
	
	 @Parameters({"Port"})
		@BeforeClass
public void initialSetup (String Port) throws MalformedURLException{
		
		 configProperties.initializePropertyFile();
		driver=setUp(Port);
		port = Port;
		homepageObj = new HomePage(driver);
		loginSignupObj = new Login(driver);
		registrationObj = new UserRegistration(driver);
		createaccObj = new CreatedAccount(driver);
		deleteaccObj = new DeletedAccount(driver);
		
		
	}
	 
	 @BeforeMethod
	 public void signUp () throws IOException {
		 
		 
		 homepageObj.signupLoginBtn.click();
		 loginSignupObj.testcase2Signup(port);
		 registrationObj.userRegistration();
		 removeAdd();
		 createaccObj.createdAccount();
		 homepageObj.Logout.click();
		 homepageObj.Home.click();
	 }
	 @Test
public void tc2Scenarios () {
	
		 
    homepageObj.verifyHome();			
    homepageObj.clickSignup();
	loginSignupObj.loginCheck(port);
	homepageObj.loginVerify1();
	deleteaccObj.DeletedAccount2();
	driver.quit();
}
	

}
