package Flats;



import junit.framework.TestSuite;
import junit.textui.TestRunner;


public class FlatsTest {
	public static void main(String[] args)  {
		TestRunner runner = new TestRunner();
		TestSuite suite = new TestSuite();
	
		System.setProperty("general.url", "http://at-vm01-wkrd01.appliedtech.ru/");
		//System.setProperty("browser.class", "org.openqa.selenium.ie.InternetExplorerDriver");
		System.setProperty("browser.class", "org.openqa.selenium.firefox.FirefoxDriver");
		System.setProperty("driver.path", System.getProperty("user.dir")+"\\lib\\");

		suite.addTest(new TestCatalog("testCatalog_common_24"));
		runner.doRun(suite);
		System.out.println("Finished");
		
	}
}
