package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePage_Objects {
	public WebDriver driver;
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By logIn=By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	
	public LoginPagePage_Objects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(logIn);
	}
	
	public WebElement clickOnTryForFree()
	{
		return driver.findElement(tryForFree);
	}

}
