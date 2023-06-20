package Hritik.Capstone_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfig {
	
	public WebDriver getDriver()
	{
	
           System.setProperty("webdriver.chrome.driver","C:\\Users\\sharm\\Documents\\Tesst\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   	driver.get("https://www.automationexercise.com/");
	   	driver.manage().window().maximize();
	   	return driver;

	}
	
	
	

}
