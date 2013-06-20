package Flats;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.seleniumemulation.WaitForCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class TestCatalog extends ATestCases {

	public TestCatalog(String fname) {
		super(fname);
	}
	
public void testCatalog_common_17_1(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-17 step 1 \n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	for (int i=1;i<=Integer.parseInt(driver.findElement(By.className("pagecount")).getText());i++){
		Iterator<WebElement> elementsIterator = driver.findElements(By.xpath(".//*[starts-with(@class, 'p1')]/div")).iterator();
		while (elementsIterator.hasNext()){
			WebElement curElement = elementsIterator.next();
			Assert.assertFalse(curElement.getText().equals("0"));
		}
		if (i!=Integer.parseInt(driver.findElement(By.className("pagecount")).getText())){
		driver.findElement(By.className("next")).click();
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.name("curpage"), String.valueOf(i+1) ));
		}
	}
}



public void testCatalog_common_18(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-18\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	
	List<WebElement> classes = driver.findElements(By.xpath(".//*[@id='mainfilters']/span[1]/ul/li"));
	for (int i=1;i<classes.size();i++){
		if (!classes.get(i).findElement(By.xpath("./span[2]")).getText().equals("0")){
			classes.get(i).findElement(By.xpath("./a")).click();
			wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='advertCount']/span/b"), 
					classes.get(i).findElement(By.xpath("./span[2]")).getText()));
			for (int j=1;j<=Integer.parseInt(driver.findElement(By.className("pagecount")).getText());j++){
				wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='advertCount']/span/b"),
						classes.get(i).findElement(By.xpath("./span[2]")).getText()));
				Iterator<WebElement> elementsIterator = driver.findElement(By.className("info")).findElements(By.xpath(".//*[starts-with(@class, 'c1')]")).iterator();
				while (elementsIterator.hasNext()){
					WebElement curElement = elementsIterator.next();
					Assert.assertTrue(curElement.getAttribute("class").equals("c1 t"+(i-1)));
				}
				if (j!=Integer.parseInt(driver.findElement(By.className("pagecount")).getText())){
					driver.findElement(By.className("next")).click();
					wait.until(ExpectedConditions.textToBePresentInElementValue(By.name("curpage"), String.valueOf(j+1) ));
					}
			}
			driver.findElement(By.xpath(".//*[@id='a0_0']")).click();
		}
	}
}

public void testCatalog_common_19(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-19\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	driver.findElement(By.name("advertnumber")).sendKeys("20");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='advertCount']/span/b"), "1"));
	wait.until(ExpectedConditions.textToBePresentInElement(By.className("pagecount"), "1"));
	Assert.assertEquals("20", driver.findElement(By.xpath(".//*[starts-with(@class, 'c1')]")).getText());
	
}

public void testCatalog_common_20(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-20\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	
	List<WebElement> rooms = driver.findElements(By.xpath(".//*[@id='group15']/ul/li"));
	for (int i=1;i<rooms.size();i++){
		if (!rooms.get(i).findElement(By.xpath("./span[2]")).getText().equals("0")){
			rooms.get(i).findElement(By.xpath("./a")).click();
			wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='advertCount']/span/b"), 
					rooms.get(i).findElement(By.xpath("./span[2]")).getText()));
			for (int j=1;j<=Integer.parseInt(driver.findElement(By.className("pagecount")).getText());j++){
				wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='advertCount']/span/b"),
						rooms.get(i).findElement(By.xpath("./span[2]")).getText()));
				Iterator<WebElement> elementsIterator = driver.findElement(By.className("info")).findElements(By.xpath(".//*[starts-with(@class, 'icon i1')]")).iterator();
				while (elementsIterator.hasNext()){
					WebElement curElement = elementsIterator.next();
					if (i<3)
					Assert.assertTrue(curElement.getText().equals(""+i));
					else{
						Assert.assertFalse(curElement.getText().equals("1"));
						Assert.assertFalse(curElement.getText().equals("2"));
					}
				}
				if (j!=Integer.parseInt(driver.findElement(By.className("pagecount")).getText())){
					driver.findElement(By.className("next")).click();
					wait.until(ExpectedConditions.textToBePresentInElementValue(By.name("curpage"), String.valueOf(j+1) ));
					}
			}
			driver.findElement(By.xpath(".//*[@id='a1_0']")).click();
		}
	}
}

public void testCatalog_common_21(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-21\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	
	driver.findElement(By.xpath(".//*[@id='text_55_chzn']/ul/li/input")).click();
	List<WebElement> streets = driver.findElements(By.xpath(".//*[starts-with(@id, 'text_55_chzn_o')]"));
	
	Random generator = new Random();
	int streetindex = generator.nextInt(streets.size())+1;
	
	String streetName = streets.get(streetindex).getText();
	driver.findElement(By.xpath(".//*[@id='text_55_chzn']/ul/li/input")).sendKeys(streetName);
	driver.findElement(By.xpath(".//*[@id='text_55_chzn']/ul/li/input")).sendKeys(Keys.ENTER);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	for (int i=1;i<=Integer.parseInt(driver.findElement(By.className("pagecount")).getText());i++){
		Iterator<WebElement> elementsIterator = driver.findElement(By.className("info")).findElements(By.xpath(".//*[@class='addr tooltip']")).iterator();
		while (elementsIterator.hasNext()){
			WebElement curElement = elementsIterator.next();
			Assert.assertTrue(curElement.getText().contains(
												streetName));
		}
		if (i!=Integer.parseInt(driver.findElement(By.className("pagecount")).getText())){
			driver.findElement(By.className("next")).click();
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.name("curpage"), String.valueOf(i+1) ));
			}
	}
}

/*public void testCatalog_common_22(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-22\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	
	driver.findElement(By.xpath(".//*[@id='text_57_chzn']/ul/li/input")).sendKeys(Keys.ENTER);
	List<WebElement> landmarks = driver.findElements(By.xpath(".//*[starts-with(@id, 'text_57_chzn_o')]"));
	int streetindex = 0 + (int)(Math.random() * ((landmarks.size() - 0) + 1));
	String landmark = landmarks.get(streetindex).getText();
	landmarks.get(streetindex).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> adverts = driver.findElements(By.xpath(".//*[@class='item']"));
	adverts.get(0 + (int)(Math.random() * ((adverts.size() - 0) + 1))).findElement(By.xpath("./li[1]/a")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	System.out.println(landmark);
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='find i1']")).getText().contains(landmark));
}*/

public void testCatalog_common_23(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-23\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	
	//driver.findElement(By.xpath(".//*[@id='text_71_chzn']/ul/li/input")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath(".//*[@id='text_71_chzn']/ul/li/input")).click();
	List<WebElement> metros = driver.findElements(By.xpath(".//*[starts-with(@id, 'text_71_chzn_o')]"));
	
	Random generator = new Random();
	int metroindex = generator.nextInt(metros.size())+1;

	String metro = metros.get(metroindex).getText();
	
	metros.get(metroindex).click();
	
	driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> adverts = driver.findElements(By.xpath(".//*[@class='item']"));
	adverts.get(0 + (int)(Math.random() * (adverts.size()-1 ))).findElement(By.xpath("./li[1]/a")).click();

	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='find i3']")).getText().contains(metro));
}

public void testCatalog_common_24(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-24\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	
	//driver.findElement(By.xpath(".//*[@id='text_76_chzn']/ul/li/input")).sendKeys(Keys.ENTER);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//*[@id='text_76_chzn']/ul/li/input")).click();
	List<WebElement> stops = driver.findElements(By.cssSelector("[id*='text_76_chzn_o']"));
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	int stopindex = 0 + (int)(Math.random() * (stops.size()));
 	String stop = stops.get(stopindex).getText().substring(10);
	stops.get(stopindex).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> adverts = driver.findElements(By.xpath(".//*[@class='item']"));
	adverts.get(0 + (int)(Math.random() * adverts.size())).findElement(By.xpath("./li[1]/a")).click();

	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='find i2']")).getText().contains(stop));
}

public void testCatalog_common_25(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-25\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	
	List<WebElement> ratings = driver.findElements(By.xpath(".//*[@id='group13']/ul/li"));
	for (int i=1;i<ratings.size()-1;i++){
		if (!ratings.get(i).findElement(By.xpath("./span[2]")).getText().equals("0")){
			ratings.get(i).findElement(By.xpath("./a")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			//	e.printStackTrace();
			}
			/*wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='advertCount']/span/b"), 
																   ratings.get(i).findElement(By.xpath("./span[2]")).getText()));*/
			for (int j=1;j<=Integer.parseInt(driver.findElement(By.className("pagecount")).getText());j++){
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				//	e.printStackTrace();
				}
				wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='advertCount']/span/b"),
																	   ratings.get(i).findElement(By.xpath("./span[2]")).getText()));
				Iterator<WebElement> elementsIterator = driver.findElement(By.className("info")).findElements(By.xpath(".//*[starts-with(@class, 'rat')]")).iterator();
				while (elementsIterator.hasNext()){
					WebElement curElement = elementsIterator.next();
					Assert.assertTrue(curElement.getAttribute("class").equals("rat s"+(6-i)));
				}
				if (j!=Integer.parseInt(driver.findElement(By.className("pagecount")).getText())){
					driver.findElement(By.className("next")).click();
					wait.until(ExpectedConditions.textToBePresentInElementValue(By.name("curpage"), String.valueOf(j+1) ));
					}
			}
			driver.findElement(By.xpath(".//*[@id='a3_0']")).click();
		}
	}
}

}
