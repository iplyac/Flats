package Flats;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TestCatalog extends ATestCases {

	public TestCatalog(String fname) {
		super(fname);
	}
	
public void testCatalog_common_17(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-17\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	for (int i=1;i<=Integer.parseInt(driver.findElement(By.className("pagecount")).getText());i++){
		System.out.println("--------------------------------------------------------------------");
		Iterator<WebElement> elementsIterator = driver.findElements(By.xpath(".//*[@class='p1']/div")).iterator();
		while (elementsIterator.hasNext()){
			WebElement curElement = elementsIterator.next();
			System.out.println(curElement.getText());
		}
		driver.findElement(By.className("next")).click();
		
	}
	

}

}
