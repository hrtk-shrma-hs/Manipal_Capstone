package Hritik.Capstone_Automation.pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import configFile.configProperties;

public class Login {
	
    WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='New User Signup!']")
	public WebElement newUserSignupTitle;
	
	@FindBy(xpath="//*[@data-qa='signup-name']")
	public WebElement SignUpName;
	
	 @FindBy (xpath="(//input[@name='email'])[2]")
	public WebElement SignUpEmail;
	
	@FindBy(xpath="//button[text()='Signup']")
	public WebElement signUpButton;
	
	
	@FindBy(xpath="//*[text()='Login to your account']")
	public WebElement loginAccountTitle;
	
	@FindBy(xpath="//*[@data-qa='login-email']")
	public WebElement  Email;
	
	@FindBy(xpath="//*[@data-qa='login-password']")
	public WebElement Password;
	
	@FindBy(xpath="//*[@data-qa='login-button']")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[text()='Your email or password is incorrect!']")
	public WebElement incorrectEmailWrng;
	
	public static String email() {
    	
    	String emailAddress = "";
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	while (emailAddress.length() < 5) {
    	    int character = (int) (Math.random() * 26);
    	    emailAddress += alphabet.substring(character, character + 1);
    	emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
    	emailAddress += "@" + "gmail"+".com";
   
    }
    	return emailAddress;
    	}
	
	public void signupCheck () throws IOException  {
		
		String Emailddress = email();
		
		FileInputStream data = new FileInputStream("C:\\Users\\sharm\\eclipse-workspace\\Capstone_Automation\\src\\main\\java\\configFile\\config.Properties");
		  Properties p1 = new Properties();
		  p1.load(data);  
		  
		  String s = p1.getProperty("name");
		
		  Assert.assertEquals(newUserSignupTitle.isDisplayed(), true);
		  SignUpName.sendKeys(s);
		  SignUpEmail.sendKeys(email());
		  signUpButton.click();
			
	}
	
	public void loginCheck(String Port) {
		
		Assert.assertTrue(loginAccountTitle.isDisplayed());
		if(Port.equals("6666")) {
			
			Email.sendKeys(configProperties.property.getProperty("email4"));
			
		}
		else {
		   Email.sendKeys(configProperties.property.getProperty("email3"));
		}
		  Password.sendKeys(configProperties.property.getProperty("password"));

		  loginButton.click();
		  
	}
	public void loginCheck2() {
		Assert.assertTrue(loginAccountTitle.isDisplayed());
		 Email.sendKeys(configProperties.property.getProperty("email5"));
		  Password.sendKeys(configProperties.property.getProperty("password"));
		  loginButton.click();
		
		
	}
	public void invalidLogin () {
		
		Assert.assertTrue(loginAccountTitle.isDisplayed());
		  Email.sendKeys("abcd@email.com");
		   Password.sendKeys("adadaitik123");
		  loginButton.click();
			Assert.assertTrue(incorrectEmailWrng.isDisplayed());
	}
	public void testcase2Signup(String Port) {
		SignUpName.sendKeys(configProperties.property.getProperty("name"));
		if(Port.equals("6666")) {
			SignUpEmail.sendKeys(configProperties.property.getProperty("email4"));
		}
		else {
		SignUpEmail.sendKeys(configProperties.property.getProperty("email3"));
		}
		signUpButton.click();
		
	}
	
	
	
	
	
	
	
	
}