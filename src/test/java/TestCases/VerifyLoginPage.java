package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectsModel.LoginPagePage_Objects;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyLoginPage extends BaseClass {
	// This is for demo purpose
	@Test(dataProvider = "testData")
	public void loginVerification(String username,String password) throws IOException, InterruptedException
	{
		
		LoginPagePage_Objects Lp=new LoginPagePage_Objects(driver);
		Lp.enterUsername().sendKeys(username);
		Lp.enterPassword().sendKeys(password);
		Lp.clickOnLogin().click();
		Thread.sleep(2000);
		String actualText= driver.findElement(By.xpath("//div[@id='error']")).getText();
		String expectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		assertEquals(actualText, expectedText);
	}

	@DataProvider
	public Object[][] testData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]=Constants.userName1;
		data[0][1]=Constants.passWord1;
		
		data[1][0]=Constants.userName2;
		data[1][1]=Constants.passWord2;
		
		
		data[2][0]=Constants.userName3;
		data[2][1]=Constants.passWord3;
		
		return data;
	}
}
