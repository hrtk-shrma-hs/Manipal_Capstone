package Hritik.Capstone_Automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUp {
	
    WebDriver driver;
	
	public PopUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[text()='Continue Shopping']")
	public WebElement continueShoppingBtn;
	
	
}