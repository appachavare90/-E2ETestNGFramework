package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver driverInitialization() throws IOException
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver-win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			
		}
		else
		{
			System.out.println("Please enter valid browser name");
		}
		return driver;
	}
	@BeforeMethod
	public void browserLaunch() throws IOException
	{
		driverInitialization();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
