package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectsModel.LoginPagePage_Objects;
import PageObjectsModel.SignUpPage_Objects;
import Resources.BaseClass;

public class VerifySignUpPage extends BaseClass {
	@Test
	
	public void verifySignUp() throws IOException
	{
		
		LoginPagePage_Objects Lp=new LoginPagePage_Objects(driver);
		Lp.clickOnTryForFree().click();
		SignUpPage_Objects Sp=new SignUpPage_Objects(driver);
		Sp.enterFirstnam().sendKeys("Appa");
		Sp.enterLastName().sendKeys("Chavare");
		Sp.enterJobTitle().sendKeys("Automation");
		Sp.enterEmail().sendKeys("Appatest1234@gmail.com");
		Sp.enterPhone().sendKeys("7709063538");
		Select s=new Select(Sp.selectEmployees());
		s.selectByIndex(1);
		Sp.enterCompany().sendKeys("LTIMindtree");
		Select se=new Select(Sp.selectCountry());
		se.selectByVisibleText("New Zealand");
		//Sp.clickOnServiceAgreementChecoBox().click();
		//Sp.clickOnSubmit().click();
		//Sp.clickOnNothanksLinks().click();
		
	}
}
