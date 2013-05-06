package Flats;

import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.TestCase;

public abstract class ATestCases extends TestCase {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected final static String generalURL = System.getProperty("general.url");
	protected final static String browserBrowserClass = System.getProperty("browser.class");
	protected final static String chromeDriverPath = System.getProperty("driver.path") +"chromedriver.exe";
	protected final static String IEDriverPath = System.getProperty("driver.path") +"IEDriverServer.exe";
	protected final static String adminName = "iplyac";
	protected final static String adminPW = "R0cket";
	
	
public ATestCases(String fname) {
		super(fname);
	}
	
@BeforeClass
public void setUp() throws ClassNotFoundException,
								IllegalAccessException,
								InstantiationException
		{
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		System.setProperty("webdriver.ie.driver", IEDriverPath);
		driver = (WebDriver) Class.forName(browserBrowserClass).newInstance();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		}

@AfterClass
public void tearDown() throws Exception{
	driver.quit();
}

}
