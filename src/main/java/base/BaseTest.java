package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import exceptions.InvalidBrowserException;
import utils.ExtentManager;

public class BaseTest {
	public static WebDriver driver;
	public static FileInputStream fis1;
	public static Properties configProp;
	public static ExtentReports reports;
	public static ExtentTest test;
	@BeforeTest
	public void loadConfig()
	{
		try {
			fis1=new FileInputStream("src\\test\\resources\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		configProp =new Properties();
		try {
			configProp.load(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reports=ExtentManager.getReports();
	}
	@BeforeMethod
	
	public void setUp(Method method) {
		test=reports.createTest(method.getName());
		String browser = configProp.getProperty("browser");
		switch(browser){
		case "chrome" :
			
			driver=new ChromeDriver();
			test.log(Status.INFO, browser+" browser is started..");
			break;
		case "edge":
		
			driver=new EdgeDriver();
			test.log(Status.INFO, browser+" browser is started..");
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			test.log(Status.INFO, browser+" browser is started..");
			break;
			default :
				try {
				throw new InvalidBrowserException();
				}catch(InvalidBrowserException e) {
					System.out.println(e.getMessage());							
				}
				break;

		}
		driver.manage().window().maximize();
		driver.get(configProp.getProperty("url"));
		test.log(Status.INFO,  "App is launched using url "+configProp.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitWait"))));
		
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		test.log(Status.INFO,  "Browser is closed ..");
		}
}
