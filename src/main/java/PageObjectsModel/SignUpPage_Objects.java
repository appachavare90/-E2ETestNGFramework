package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage_Objects {
	public WebDriver driver;
	
	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By jobTitle=By.xpath("//input[@name='UserTitle']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	private By agreeCheckBox=By.xpath("//input[@id='SubscriptionAgreement']");
	private By submitBtn=By.xpath("//button[@type='submit']");
	private By noThanks=By.xpath("//button[@id='rejectInvite']");
	public SignUpPage_Objects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterFirstnam()
	{
		return driver.findElement(firstName);
	}
	public WebElement enterLastName()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement selectEmployees()
	{
		return driver.findElement(employees);
	}
	public WebElement enterJobTitle()
	{
		return driver.findElement(jobTitle);
	}
	public WebElement enterEmail()
	{
		return driver.findElement(email);
	}
	public WebElement enterPhone()
	{
		return driver.findElement(phone);
	}
	public WebElement enterCompany()
	{
		return driver.findElement(company);
	}
	public WebElement selectCountry()
	{
		return driver.findElement(country);
	}
	public WebElement clickOnServiceAgreementChecoBox()
	{
		return driver.findElement(agreeCheckBox);
	}
	public WebElement clickOnSubmit()
	{
		return driver.findElement(submitBtn);
	}
	public WebElement clickOnNothanksLinks()
	{
		return driver.findElement(noThanks);
	}
}
