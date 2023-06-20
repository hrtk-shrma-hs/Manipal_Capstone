package Hritik.Capstone_Automation.pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration {
	
   WebDriver driver;
	
	public UserRegistration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Enter Account Information']")
	public WebElement enterAccountInformationTitle;
	
	@FindBy(xpath ="//*[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='days']")
	public WebElement DropdownDay;
	
	@FindBy(xpath="//*[@id='months']")
	public WebElement DropdownMonth;
	
	@FindBy(xpath="//*[@id='years']")
	public WebElement DropdownYear;
	
	@FindBy(xpath="//*[@id='newsletter']")
	public WebElement Checkbox1News;
	
	@FindBy(xpath="//*[@id='optin']")
	public WebElement Checkbox2Offers;
	
	@FindBy(xpath="//*[@id='first_name']")
	public WebElement firstName;
	
	@FindBy(xpath="//*[@id='last_name']")
	public WebElement lastName;
	
	@FindBy(xpath="//*[@id='company']")
	public WebElement company;
	
	@FindBy(xpath="//*[@id='address1']")
	public WebElement address1;
	
	@FindBy(xpath="//*[@id='address2']")
	public WebElement address2;
	
	@FindBy(xpath="//*[@id='state']")
	public WebElement state;
	
	@FindBy(xpath="//*[@id='city']")
	public WebElement city;
	
	 @FindBy(id="zipcode")
	public WebElement zipcode;
	
	@FindBy(xpath="//*[@id='mobile_number']")
	public WebElement mobileNumber;
	
	@FindBy(xpath ="//*[@data-qa='create-account']")
	public WebElement createAccountBtn;
	
	@FindBy(xpath="//*[@id='country']")
	public WebElement DropdownCountry;
	
	
	public void userRegistration () throws IOException {
		
		
		FileInputStream data = new FileInputStream("C:\\Users\\sharm\\eclipse-workspace\\Capstone_Automation\\src\\main\\java\\configFile\\config.Properties");
		  Properties p1 = new Properties();
		  p1.load(data);  
		  
		  String password1 = p1.getProperty("password");
		  String  fname= p1.getProperty("name");
			
		  String lname = p1.getProperty("name");
		  String companyc = p1.getProperty("name");
		  String add1 = p1.getProperty("name");
			
		  String add2 = p1.getProperty("name");
			
		  String statec = p1.getProperty("name");
		  String cityc = p1.getProperty("name");
		  String zipcodec = p1.getProperty("name");
		  String monumberc = p1.getProperty("name");
			
			
		  
		  
		  password.sendKeys(password1);
		  
		  Select day = new Select(DropdownDay);
		  day.selectByVisibleText("2");
		  
		  Select month = new Select(DropdownMonth);
		  month.selectByVisibleText("November");
		  
		  Select year = new Select(DropdownYear);
		  year.selectByVisibleText("2000");
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
		
		 Checkbox1News.click();
		 Checkbox2Offers.click();
		  
		  firstName.sendKeys(fname);
		  lastName.sendKeys(lname);
		  company.sendKeys(companyc);
		  address1.sendKeys(add1);
		  
		  Select country = new Select(DropdownCountry);
		  country.selectByVisibleText("India");
		  
		  state.sendKeys(statec);
		  city.sendKeys(cityc);
		  zipcode.sendKeys(zipcodec);
		  mobileNumber.sendKeys(monumberc);
		  
		 createAccountBtn.click();
		
	}
	
	
	
	
}