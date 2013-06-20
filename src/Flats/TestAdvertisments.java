package Flats;

import java.text.SimpleDateFormat;
import java.util.List;

import java.util.Locale;
import java.util.Random;
import java.util.Iterator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestAdvertisments extends ATestCases {

	public TestAdvertisments(String fname) {
		super(fname);
		// TODO Auto-generated constructor stub
	}
	
public void testAdvertisments_common_42(){
		System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-42\n");
		driver.get(generalURL);
		driver.findElement(By.linkText("Войти")).click();
		driver.findElement(By.id("j_username")).sendKeys("testLessor");
		driver.findElement(By.id("j_password")).sendKeys("Flats123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Мои объявления")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		
		int advCount = Integer.valueOf(driver.findElement(By.id("t65_0")).getText());
		
		driver.findElement(By.id("begin")).click();
		
		driver.findElement(By.xpath(".//*[starts-with(@class,'po')]/ul/li["+ (1 + (int)(Math.random() * 2))  +"]/a")).click();
		
		driver.findElement(By.className("textchild")).click();
		
		List<WebElement> contacts = driver.findElements(By.className("optionchild"));
		
		int contactindex = 1 + (int)(Math.random() * (contacts.size()-1));
		String contactname = contacts.get(contactindex ).getText();
		
		contacts.get(contactindex).click();
		
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='contactPerson']/div[1]/div[2]")).getText().equals(contactname));
		
		driver.findElement(By.id("rentPerDay")).sendKeys("2000");
		driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(Keys.BACK_SPACE);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		
		List<WebElement> streets = driver.findElements(By.cssSelector("div[class='optionchild']"));
		
		Random generator = new Random();
		int streettindex = generator.nextInt(streets.size()-16)+16;
	
		driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(streets.get(streettindex).getText());
		driver.findElement(By.name("houseNumberText")).sendKeys("20");

		int flatclass = (1 + (int)(Math.random() * 4));
		driver.findElement(By.xpath(".//*[@id='apart0"+flatclass+"']/../span[1]")).click();
		
		int roomcount = (1 + (int)(Math.random() * 4));
		driver.findElement(By.xpath(".//*[@id='numapart0"+roomcount+"']/../span[1]")).click();

		driver.findElement(By.id("districtOfficial_chzn")).click();
		
		List<WebElement> districts= driver.findElements(By.xpath(".//*[starts-with(@id,'districtOfficial_chzn_o_')]"));
		
		int districtindex = 1 + (int)(Math.random() * (districts.size()-1));
		districts.get(districtindex).click();
		
		String ofDistrict = driver.findElement(By.xpath(".//*[@id='districtOfficial_chzn']/a/span")).getText();
		
		driver.findElement(By.xpath(".//*[@id='beds']/div[1]/div[2]")).click();
		
		List<WebElement> beds = driver.findElements(By.xpath(".//*[@id='beds']/div[2]/div[1]/div"));
		
		int bedstindex = 0 + (int)(Math.random() * (beds.size()-1));
		beds.get(bedstindex).click();
		
		driver.findElement(By.id("totalSquare")).sendKeys("50");
		driver.findElement(By.id("floorNumber")).sendKeys("1");
		driver.findElement(By.id("houseFloors")).sendKeys("10");
		driver.findElement(By.id("separateRoomCount")).sendKeys("2");
		
		driver.findElement(By.name("save")).click();
		
		wait.until(ExpectedConditions.titleIs("Wikirent"));
		
		Assert.assertTrue(Integer.valueOf(driver.findElement(By.id("t65_0")).getText()) == (advCount+1));
}

public void testAdvertisments_common_49(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-49\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	int advCount = Integer.valueOf(driver.findElement(By.id("t65_0")).getText());
	
	driver.findElement(By.id("begin")).click();
	
	driver.findElement(By.xpath(".//*[starts-with(@class,'po')]/ul/li["+ (1 + (int)(Math.random() * 2))  +"]/a")).click();
	
	driver.findElement(By.className("textchild")).click();
	
	List<WebElement> contacts = driver.findElements(By.className("optionchild"));
	
	int contactindex = 1 + (int)(Math.random() * (contacts.size()-1));
	String contactname = contacts.get(contactindex ).getText();
	
	contacts.get(contactindex).click();
	
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='contactPerson']/div[1]/div[2]")).getText().equals(contactname));
	
	driver.findElement(By.id("rentPerDay")).sendKeys("2000");
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(Keys.BACK_SPACE);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> streets = driver.findElements(By.cssSelector("div[class='optionchild']"));
	
	Random generator = new Random();
	int streettindex = generator.nextInt(streets.size()-16)+16;

	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(streets.get(streettindex).getText());
	driver.findElement(By.name("houseNumberText")).sendKeys("20");

	int flatclass = (1 + (int)(Math.random() * 4));
	driver.findElement(By.xpath(".//*[@id='apart0"+flatclass+"']/../span[1]")).click();
	
	int roomcount = (1 + (int)(Math.random() * 4));
	driver.findElement(By.xpath(".//*[@id='numapart0"+roomcount+"']/../span[1]")).click();

	driver.findElement(By.id("districtOfficial_chzn")).click();
	
	List<WebElement> districts= driver.findElements(By.xpath(".//*[starts-with(@id,'districtOfficial_chzn_o_')]"));
	
	int districtindex = 1 + (int)(Math.random() * (districts.size()-1));
	districts.get(districtindex).click();
	
	String ofDistrict = driver.findElement(By.xpath(".//*[@id='districtOfficial_chzn']/a/span")).getText();
	
	driver.findElement(By.xpath(".//*[@id='beds']/div[1]/div[2]")).click();
	
	List<WebElement> beds = driver.findElements(By.xpath(".//*[@id='beds']/div[2]/div[1]/div"));
	
	int bedstindex = 0 + (int)(Math.random() * (beds.size()-1));
	beds.get(bedstindex).click();
	
	driver.findElement(By.id("totalSquare")).sendKeys("50");
	driver.findElement(By.id("floorNumber")).sendKeys("1");
	driver.findElement(By.id("houseFloors")).sendKeys("10");
	driver.findElement(By.id("separateRoomCount")).sendKeys("2");
	
	System.out.println(driver.findElement(By.id("phone11")).getText());
	
	driver.findElement(By.id("reset")).click();
	
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='contactPerson']/div[1]/div[2]")).getText().equals("- Выберите контактное лицо -"));
	
	Assert.assertTrue(driver.findElement(By.id("rentPerDay")).getText().equals(""));
	
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).getText().equals(""));
	Assert.assertTrue(driver.findElement(By.name("houseNumberText")).getText().equals(""));
	
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='apart01']")).isSelected());
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='numapart01']")).isSelected());
}

public void testAdvertisments_common_50(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-50\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	//List<WebElement> adverts = driver.findElements(By.cssSelector("ul[class*='item']"));
	List<WebElement> adv = driver.findElements(By.xpath(".//a[text()='Изменить']"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	int advnumber = Integer.valueOf(adv.get(advindex).findElement(By.xpath("./ancestor::li[1]/../li[1]")).getText());
	String citySubString = adv.get(advindex).findElement(By.xpath("./ancestor::li[1]/p[1]")).getText().substring(0, 4);
	
	adv.get(advindex).click();
	
	wait.until(ExpectedConditions.titleContains(String.valueOf(advnumber)));
	
	driver.findElement(By.id("rentPerDay")).clear();
	driver.findElement(By.id("rentPerDay")).sendKeys("2500");
	
	int flatclass = generator.nextInt(3)+1;
	driver.findElement(By.xpath(".//*[@id='apart0"+flatclass+"']/../span[1]")).click();
	
	int roomcount = generator.nextInt(3)+1;
	driver.findElement(By.xpath(".//*[@id='numapart0"+roomcount+"']/../span[1]")).click();

	driver.findElement(By.xpath(".//*[@id='beds']/div[1]/div[2]")).click();
	List<WebElement> beds = driver.findElements(By.xpath(".//*[@id='beds']/div[2]/div[1]/div"));
	int bedstindex = 0 + (int)(Math.random() * (beds.size()-1));
	beds.get(bedstindex).click();
	String bedtext = driver.findElement(By.xpath(".//div[@id='beds']/div[@class='controlchild']/div[@class='textchild']")).getText();

	driver.findElement(By.id("totalSquare")).clear();
	driver.findElement(By.id("totalSquare")).sendKeys("500");
	
	driver.findElement(By.name("save")).click();
	
	wait.until(ExpectedConditions.titleIs("Wikirent"));

	driver.findElement(By.name("advertnumber")).clear();
	driver.findElement(By.name("advertnumber")).sendKeys(String.valueOf(advnumber));
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	Iterator<WebElement> advI = driver.findElements(By.cssSelector("ul[class*='item']")).iterator();
	while (advI.hasNext()){
		WebElement curAdv = advI.next();
		if (curAdv.findElement(By.xpath(".//li[@class='c2']/p[@class='addr']"))
			.getText().subSequence(0, 4).equals(citySubString))
		{
			curAdv.findElement(By.xpath("./li[@class='c2']/p[@class='links']/a[text()='Посмотреть']")).click();
			break;
		}
	}
	
	Assert.assertTrue(driver.findElement(By.cssSelector("li[data-tooltip*='Количество спальных мест']"))
							.getText().equals(bedtext));
	Assert.assertTrue(driver.findElement(By.cssSelector("li[data-tooltip*='Количество комнат']"))
							.getText().equals(String.valueOf(roomcount)));
	Assert.assertTrue(driver.findElement(By.cssSelector("#apClass"))
							.getAttribute("class").equals("tooltip t"+String.valueOf(flatclass+2)));
	Assert.assertTrue(driver.findElement(By.xpath(".//div[@class='prices']/div[@class='p1']/div[@class='c']"))
							.getText().equals("2500"));
	
}

public void testAdvertisments_common_52(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-52\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	List<WebElement> adv = driver.findElements(By.xpath(".//a[text()='Изменить']"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	adv.get(advindex ).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	WebElement priceInput = driver.findElement(By.id("rentPerDay"));
	String rentPerday = priceInput.getAttribute("value");
	
	driver.findElement(By.id("rentPerDay")).clear();
	driver.findElement(By.id("rentPerDay")).sendKeys("2500");
	
	int flatclass = generator.nextInt(3)+1;
	driver.findElement(By.xpath(".//*[@id='apart0"+flatclass+"']/../span[1]")).click();
	
	int roomcount = generator.nextInt(3)+1;
	driver.findElement(By.xpath(".//*[@id='numapart0"+roomcount+"']/../span[1]")).click();

	
	WebElement bedInput = driver.findElement(By.xpath(".//div[@id='beds']/div[@class='controlchild']/div[@class='textchild']"));
	String bedtext = bedInput.getText();
	driver.findElement(By.xpath(".//*[@id='beds']/div[1]/div[2]")).click();
	List<WebElement> beds = driver.findElements(By.xpath(".//*[@id='beds']/div[2]/div[1]/div"));
	int bedstindex = 0 + (int)(Math.random() * (beds.size()-1));
	beds.get(bedstindex).click();
	
	String totalSquare = driver.findElement(By.id("totalSquare")).getText(); 
	driver.findElement(By.id("totalSquare")).clear();
	driver.findElement(By.id("totalSquare")).sendKeys("500");
	
	driver.findElement(By.id("reset")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	priceInput = driver.findElement(By.id("rentPerDay"));
	
	Assert.assertTrue(priceInput.getAttribute("value").equals(rentPerday));
	Assert.assertTrue(driver.findElement(By.xpath(".//div[@id='beds']/div[@class='controlchild']/div[@class='textchild']")).getText().equals(bedtext));
	Assert.assertTrue(driver.findElement(By.id("totalSquare")).getText().equals(totalSquare));
	
	driver.findElement(By.name("save")).click();
}

public void testAdvertisments_common_53(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-53\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();

	driver.findElement(By.xpath(".//*[@class='r']/span/a")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
/*******************************************************************************************/	
	driver.findElement(By.id("sorttype")).click();
	driver.findElement(By.id("costperday")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	Iterator<WebElement> adv = driver.findElements(By.cssSelector("[class='p1']>.c")).iterator();
	int prev = 0;
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev <= cur);
		prev = cur;
	}
	
	driver.findElement(By.id("sort_order_control")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	adv = driver.findElements(By.cssSelector("[class='p1']>.c")).iterator();
	prev = Integer.valueOf(adv.next().getText());
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev >= cur);
		prev = cur;
	}
/*******************************************************************************************/	
	driver.findElement(By.id("sort_order_control")).click();
	driver.findElement(By.id("sorttype")).click();
	driver.findElement(By.id("costpernight")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	 adv = driver.findElements(By.cssSelector("[class='p2']>.c")).iterator();
	prev = 0;
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev <= cur);
		prev = cur;
	}
	
	driver.findElement(By.id("sort_order_control")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	adv = driver.findElements(By.cssSelector("[class='p2']>.c")).iterator();
	prev = Integer.valueOf(adv.next().getText());
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev >= cur);
		prev = cur;
	}
/*******************************************************************************************/
	driver.findElement(By.id("sort_order_control")).click();
	driver.findElement(By.id("sorttype")).click();
	driver.findElement(By.id("costperhour")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	 adv = driver.findElements(By.cssSelector("[class='p3']>.c")).iterator();
	prev = 0;
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev <= cur);
		prev = cur;
	}
	
	driver.findElement(By.id("sort_order_control")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	adv = driver.findElements(By.cssSelector("[class='p3']>.c")).iterator();
	prev = Integer.valueOf(adv.next().getText());
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev >= cur);
		prev = cur;
	}
	/*******************************************************************************************/
	driver.findElement(By.id("sort_order_control")).click();
	driver.findElement(By.id("sorttype")).click();
	driver.findElement(By.id("category")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	adv = driver.findElements(By.cssSelector("li[class*='t t']")).iterator();
	int prevFlatClass = 0;
	
	while (adv.hasNext()){
		int curFlatClass = Integer.valueOf(adv.next().getAttribute("class").substring(3));
		adv.remove();
		Assert.assertTrue(prevFlatClass <= curFlatClass);
		prevFlatClass = curFlatClass;
	}
	
	driver.findElement(By.id("sort_order_control")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	adv = driver.findElements(By.cssSelector("li[class*='t t']")).iterator();
	prev = Integer.valueOf(adv.next().getAttribute("class").substring(3));
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getAttribute("class").substring(3));
		adv.remove();
		Assert.assertTrue(prev >= cur);
		prev = cur;
	}	
	/*******************************************************************************************/
	driver.findElement(By.id("sort_order_control")).click();
	driver.findElement(By.id("sorttype")).click();
	driver.findElement(By.id("rooms")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	adv = driver.findElements(By.cssSelector("ul[class*='item']>li[class='c3']")).iterator();
	prev = 0;
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev <= cur);
		prev = cur;
	}
	
	driver.findElement(By.id("sort_order_control")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	adv = driver.findElements(By.cssSelector("ul[class*='item']>li[class='c3']")).iterator();
	prev = Integer.valueOf(adv.next().getText());
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getText());
		adv.remove();
		Assert.assertTrue(prev >= cur);
		prev = cur;
	}	
	/*******************************************************************************************/
	driver.findElement(By.id("sort_order_control")).click();
	driver.findElement(By.id("sorttype")).click();
	driver.findElement(By.id("rating")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	adv = driver.findElements(By.cssSelector("[class*='rat s']")).iterator();
	prev = 0;
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getAttribute("class").substring(5));
		adv.remove();
		Assert.assertTrue(prev <= cur);
		prev = cur;
	}
	
	driver.findElement(By.id("sort_order_control")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	adv = driver.findElements(By.cssSelector("[class*='rat s']")).iterator();
	prev = Integer.valueOf(adv.next().getAttribute("class").substring(5));
	
	while (adv.hasNext()){
		int cur = Integer.valueOf(adv.next().getAttribute("class").substring(5));
		adv.remove();
		Assert.assertTrue(prev >= cur);
		prev = cur;
	}		
}

public void testAdvertisments_common_54(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-54\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();

	//driver.findElement(By.xpath(".//*[@class='r']/span/a")).click();
	driver.findElement(By.cssSelector("[class='r'] > span > a")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	try{
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	} catch (ElementNotVisibleException e){
		System.out.println("element is not visible");
		Assert.assertTrue(false);
	}
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	int advCountInList = driver.findElements(By.cssSelector("[class*='item']")).size();
	int advCountInfact = Integer.valueOf(driver.findElement(By.cssSelector("#t65_0")).getText());
	Assert.assertTrue(
			(advCountInList-1 == 100) 
			||
			(advCountInList == (advCountInfact-1))
			);
}

public void testAdvertisments_common_55(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-55\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	int advCountDeleted = Integer.valueOf(driver.findElement(By.cssSelector("#t65_4")).getText());
	
	List<WebElement> adv = driver.findElements(By.xpath(".//a[text()='Удалить']"));
	
	Random generator = new Random();
	int advIndex = generator.nextInt(adv.size());

	adv.get(advIndex).click();
	
	driver.findElement(By.name("cancel")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	Assert.assertTrue(
			advCountDeleted == 
			Integer.valueOf(driver.findElement(By.cssSelector("#t65_4")).getText())
			);
	
	adv.get(advIndex).click();
	
	driver.findElement(By.name("submit")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	Assert.assertTrue(
			advCountDeleted+1 ==
			Integer.valueOf(driver.findElement(By.cssSelector("#t65_4")).getText())
			);
	
}

public void testAdvertisments_common_56(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-56\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	int advCountDeleted = Integer.valueOf(driver.findElement(By.cssSelector("#t65_4")).getText());
	
	List<WebElement> adv = driver.findElements(By.xpath(".//a[text()='Восстановить']"));
	
	Random generator = new Random();
	int advIndex = generator.nextInt(adv.size());
	
	adv.get(advIndex).click();
	
	Assert.assertTrue(
			advCountDeleted-1 ==
			Integer.valueOf(driver.findElement(By.cssSelector("#t65_4")).getText())
			);
	
}

public void testAdvertisments_common_57(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-57\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> adv = driver.findElements(By.xpath(".//a[text()='Изменить']"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	int advnumber = Integer.valueOf(adv.get(advindex).findElement(By.xpath("./ancestor::li[1]/../li[1]")).getText());
	String citySubString = adv.get(advindex).findElement(By.xpath("./ancestor::li[1]/p[1]")).getText().substring(0, 4);
	
	adv.get(advindex).click();
	
	String rentPerDay = ""+(generator.nextInt(2500)+1800);
	driver.findElement(By.id("rentPerDay")).clear();
	driver.findElement(By.id("rentPerDay")).sendKeys(rentPerDay);
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).clear();
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(Keys.BACK_SPACE);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> streets = driver.findElements(By.cssSelector("div[class='optionchild']"));
	
	generator = new Random();
	int streettindex = generator.nextInt(streets.size()-16)+16;
	String streetName = streets.get(streettindex).getText();
	
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).clear();
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(streetName );
	driver.findElement(By.name("houseNumberText")).clear();
	driver.findElement(By.name("houseNumberText")).sendKeys("20");

	int flatclass = (1 + (int)(Math.random() * 4));
	driver.findElement(By.xpath(".//*[@id='apart0"+flatclass+"']/../span[1]")).click();
	
	int roomcount = (1 + (int)(Math.random() * 4));
	driver.findElement(By.xpath(".//*[@id='numapart0"+roomcount+"']/../span[1]")).click();

	driver.findElement(By.id("districtOfficial_chzn")).click();
	
	List<WebElement> districts= driver.findElements(By.xpath(".//*[starts-with(@id,'districtOfficial_chzn_o_')]"));
	
	int districtindex = 1 + (int)(Math.random() * (districts.size()-1));
	districts.get(districtindex).click();
	
	String ofDistrict = driver.findElement(By.xpath(".//*[@id='districtOfficial_chzn']/a/span")).getText();
	
	driver.findElement(By.xpath(".//*[@id='beds']/div[1]/div[2]")).click();
	
	List<WebElement> beds = driver.findElements(By.xpath(".//*[@id='beds']/div[2]/div[1]/div"));
	
	int bedstindex = 0 + (int)(Math.random() * (beds.size()-1));
	beds.get(bedstindex).click();
	
	String totalSquare = ""+(generator.nextInt(60)+20);
	driver.findElement(By.id("totalSquare")).clear();
	driver.findElement(By.id("totalSquare")).sendKeys(totalSquare);
	
	driver.findElement(By.id("floorNumber")).clear();
	driver.findElement(By.id("floorNumber")).sendKeys("1");
	
	driver.findElement(By.id("houseFloors")).clear();
	driver.findElement(By.id("houseFloors")).sendKeys("10");
	
	driver.findElement(By.id("separateRoomCount")).clear();
	driver.findElement(By.id("separateRoomCount")).sendKeys("2");


	if (generator.nextBoolean())
		driver.findElement(By.xpath(".//*[@id='hasInternet']/..")).click();
	if (generator.nextBoolean())
		driver.findElement(By.xpath(".//*[@id='hasMicrowave']/..")).click();
	if (generator.nextBoolean())
		driver.findElement(By.xpath(".//*[@id='hasCooker']/..")).click();
	if (generator.nextBoolean())
		driver.findElement(By.xpath(".//*[@id='hasRefrigerator']/..")).click();
	if (generator.nextBoolean())
		driver.findElement(By.xpath(".//*[@id='hasKettle']/..")).click();
	if (generator.nextBoolean())
		driver.findElement(By.xpath(".//*[@id='hasTv']/..")).click();
	if (generator.nextBoolean())
		driver.findElement(By.xpath(".//*[@id='hasConditioner']/..")).click();

	WebElement tmpElement = driver.findElement(By.name("hasInternet"));
	boolean hasInternet = Boolean.parseBoolean(tmpElement.getAttribute("checked")); 
	
	tmpElement = driver.findElement(By.name("hasMicrowave"));
	boolean hasMicrowave = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasCooker"));
	boolean hasCooker = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasRefrigerator"));
	boolean hasRefrigerator = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasKettle"));
	boolean hasKettle = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasTv"));
	boolean hasTv = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasConditioner"));
	boolean hasConditioner = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	
	driver.findElement(By.name("save")).click();
	
	wait.until(ExpectedConditions.titleIs("Wikirent"));
	
	driver.findElement(By.name("advertnumber")).clear();
	driver.findElement(By.name("advertnumber")).sendKeys(String.valueOf(advnumber));

	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	Iterator<WebElement> advI = driver.findElements(By.cssSelector("ul[class*='item']")).iterator();
	while (advI.hasNext()){
		WebElement curAdv = advI.next();
		if (curAdv.findElement(By.xpath(".//li[@class='c2']/p[@class='addr']"))
			.getText().subSequence(0, 4).equals(citySubString))
		{
			curAdv.findElement(By.xpath("./li[@class='c2']/p[@class='links']/a[text()='Посмотреть']")).click();
			break;
		}
	}
	
	if (hasInternet)
		  Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg01']/..")).
							getCssValue("color").equals("rgba(102, 102, 102, 1)"));
	if (hasMicrowave)
		  Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg02']/..")).
							getCssValue("color").equals("rgba(102, 102, 102, 1)"));
	if (hasCooker)
		  Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg03']/..")).
							getCssValue("color").equals("rgba(102, 102, 102, 1)"));
	if (hasRefrigerator)
		  Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg04']/..")).
							getCssValue("color").equals("rgba(102, 102, 102, 1)"));	
	if (hasKettle)
		  Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg05']/..")).
							getCssValue("color").equals("rgba(102, 102, 102, 1)"));	
	if (hasConditioner)
		  Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg06']/..")).
							getCssValue("color").equals("rgba(102, 102, 102, 1)"));
	if (hasTv)
		  Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg07']/..")).
							getCssValue("color").equals("rgba(102, 102, 102, 1)"));	
		
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='prices']/div[1]/div")).getText().equals(rentPerDay));
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='pimg08']/b")).getText().equals(totalSquare));
	
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='cols']/p[2]/span")).getText().contains(ofDistrict));
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='cols']/p[3]/span")).getText().contains(streetName));
}


public void testAdvertisments_common_58(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-58\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> adv = driver.findElements(By.xpath(".//a[text()='Изменить']"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	int advnumber = Integer.valueOf(adv.get(advindex).findElement(By.xpath("./ancestor::li[1]/../li[1]")).getText());
	String citySubString = adv.get(advindex).findElement(By.xpath("./ancestor::li[1]/p[1]")).getText().substring(0, 4);
	
	adv.get(advindex).click();
	
	System.out.println(advnumber);
	
	String rentPerDay = ""+(generator.nextInt(2500)+1800);
	driver.findElement(By.id("rentPerDay")).clear();
	driver.findElement(By.id("rentPerDay")).sendKeys(rentPerDay);
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).clear();
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(Keys.BACK_SPACE);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	List<WebElement> streets = driver.findElements(By.cssSelector("div[class='optionchild']"));
	
	generator = new Random();
	int streettindex = generator.nextInt(streets.size()-16)+16;
	String streetName = streets.get(streettindex).getText();
	
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).clear();
	driver.findElement(By.xpath(".//*[@id='streetText']/div[1]/input")).sendKeys(streetName );
	driver.findElement(By.name("houseNumberText")).clear();
	driver.findElement(By.name("houseNumberText")).sendKeys("20");

	int flatclass = (1 + (int)(Math.random() * 4));
	driver.findElement(By.xpath(".//*[@id='apart0"+flatclass+"']/../span[1]")).click();
	
	int roomcount = (1 + (int)(Math.random() * 4));
	driver.findElement(By.xpath(".//*[@id='numapart0"+roomcount+"']/../span[1]")).click();

	driver.findElement(By.id("districtOfficial_chzn")).click();
	
	List<WebElement> districts= driver.findElements(By.xpath(".//*[starts-with(@id,'districtOfficial_chzn_o_')]"));
	
	int districtindex = 1 + (int)(Math.random() * (districts.size()-1));
	districts.get(districtindex).click();
	
	String ofDistrict = driver.findElement(By.xpath(".//*[@id='districtOfficial_chzn']/a/span")).getText();
	
	driver.findElement(By.xpath(".//*[@id='beds']/div[1]/div[2]")).click();
	
	List<WebElement> beds = driver.findElements(By.xpath(".//*[@id='beds']/div[2]/div[1]/div"));
	
	int bedstindex = 0 + (int)(Math.random() * (beds.size()-1));
	beds.get(bedstindex).click();
	String bedtext = driver.findElement(By.xpath(".//div[@id='beds']/div[@class='controlchild']/div[@class='textchild']")).getText();
	
	String totalSquare = ""+(generator.nextInt(60)+20);
	driver.findElement(By.id("totalSquare")).clear();
	driver.findElement(By.id("totalSquare")).sendKeys(totalSquare);
	
	driver.findElement(By.id("floorNumber")).clear();
	driver.findElement(By.id("floorNumber")).sendKeys("1");
	
	driver.findElement(By.id("houseFloors")).clear();
	driver.findElement(By.id("houseFloors")).sendKeys("10");
	
	driver.findElement(By.id("separateRoomCount")).clear();
	driver.findElement(By.id("separateRoomCount")).sendKeys("2");

	List<WebElement> tmplist = driver.findElements(By.xpath(".//div[@class='unit c3']/p/ins/input[@type='checkbox']"));
	
	for (WebElement tmpelement:tmplist)
		if (generator.nextBoolean())
				driver.findElement(By.xpath(".//*[@id='"+ tmpelement.getAttribute("id") +"']/..")).click();

	WebElement tmpElement = driver.findElement(By.name("isNewHouse"));
	boolean isNewHouse = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("goodApproach"));
	boolean goodApproach = Boolean.parseBoolean(tmpElement.getAttribute("checked"));

	tmpElement = driver.findElement(By.name("hasGuardedParking"));
	boolean hasGuardedParking = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasElevator"));
	boolean hasElevator = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasConcierge"));
	boolean hasConcierge = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasBalcony"));
	boolean hasBalcony = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasModernWindows"));
	boolean hasModernWindows = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasIntercom"));
	boolean hasIntercom = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("hasMetalDoors"));
	boolean hasMetalDoors = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("rentForParty"));
	boolean rentForParty = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	tmpElement = driver.findElement(By.name("smokeAllowed"));
	boolean smokeAllowed = Boolean.parseBoolean(tmpElement.getAttribute("checked"));
	
	driver.findElement(By.name("save")).click();
	
	wait.until(ExpectedConditions.titleIs("Wikirent"));
	
	driver.findElement(By.name("advertnumber")).clear();
	driver.findElement(By.name("advertnumber")).sendKeys(String.valueOf(advnumber));
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	Iterator<WebElement> advI = driver.findElements(By.cssSelector("ul[class*='item']")).iterator();
	while (advI.hasNext()){
		WebElement curAdv = advI.next();
		if (curAdv.findElement(By.xpath(".//li[@class='c2']/p[@class='addr']"))
			.getText().subSequence(0, 4).equals(citySubString))
		{
			curAdv.findElement(By.xpath("./li[@class='c2']/p[@class='links']/a[text()='Посмотреть']")).click();
			break;
		}
	}
	
	driver.findElement(By.linkText("Подробно")).click();
	
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='cols']/p[2]/span")).getText().contains(ofDistrict));
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='cols']/p[3]/span")).getText().contains(streetName));
	
	Assert.assertTrue(driver.findElement(By.
			xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[1]")).
			getText().contains("Количество комнат: "+roomcount));

	Assert.assertTrue(driver.findElement(By.
			xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[3]")).
			getText().contains("Спальные места: "+bedtext));
	
	Assert.assertTrue(driver.findElement(By.
			xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[4]")).
			getText().contains("Площадь: "+totalSquare));

	Assert.assertTrue(driver.findElement(By.
			xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[5]")).
			getText().contains("Этаж/этажей: 1/10"));

	Assert.assertTrue(driver.findElement(By.
			xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[6]")).
			getText().contains("Количество изолированных комнат: 2"));

	if (!isNewHouse)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[2]/ul/li[1]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(2) > ul > li:nth-child(1)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!goodApproach)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[2]/ul/li[2]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(2) > ul > li:nth-child(2)")).
				getAttribute("innerHTML").contains("<s>"));

	if (!hasGuardedParking)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[2]/ul/li[3]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(2) > ul > li:nth-child(3)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!hasElevator)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[2]/ul/li[4]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(2) > ul > li:nth-child(4)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!hasConcierge)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[2]/ul/li[5]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(2) > ul > li:nth-child(5)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!hasBalcony)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[7]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(1) > ul > li:nth-child(7)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!hasModernWindows)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[8]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(1) > ul > li:nth-child(8)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!hasIntercom)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[9]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(1) > ul > li:nth-child(9)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!hasMetalDoors)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[10]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(1) > ul > li:nth-child(10)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!rentForParty)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[11]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(1) > ul > li:nth-child(11)")).
				getAttribute("innerHTML").contains("<s>"));
	
	if (!smokeAllowed)
		Assert.assertTrue(driver.findElement(By.
				//xpath(".//ul[@id='wideChars']/div[2]/li[1]/ul/li[12]")).
				cssSelector("ul[id='wideChars'] > div:nth-child(2) > li:nth-child(1) > ul > li:nth-child(12)")).
				getAttribute("innerHTML").contains("<s>"));
}

public void testAdvertisments_common_37(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-37\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.xpath(".//*[@class='r']/span/a")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	/*******************************************************************************************/
	if(driver.findElement(By.id("a65_1")).getAttribute("class").equals("filter")){
		driver.findElement(By.id("a65_1")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		List<WebElement> publiedAdv = driver.findElements(By.cssSelector(".item"));
		for (WebElement tmpadv:publiedAdv)
			Assert.assertTrue(tmpadv.findElement(By.
					cssSelector(".item > li:nth-child(8)")).
					getText().contains("Публикуется"));
		
		driver.findElement(By.id("a65_1")).click();
	}
	/*******************************************************************************************/
	if(driver.findElement(By.id("a67_0")).getAttribute("class").equals("filter")){
		driver.findElement(By.id("a67_0")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		List<WebElement> publiedAdv = driver.findElements(By.cssSelector(".item"));
		for (WebElement tmpadv:publiedAdv)
			Assert.assertTrue(tmpadv.getAttribute("class").equals("item moderate"));
		driver.findElement(By.id("a67_0")).click();
	}
	/*******************************************************************************************/
	if(driver.findElement(By.id("a65_2")).getAttribute("class").equals("filter")){
		driver.findElement(By.id("a65_2")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		List<WebElement> publiedAdv = driver.findElements(By.cssSelector(".item"));
		for (WebElement tmpadv:publiedAdv)
			Assert.assertTrue(tmpadv.findElement(By.
					cssSelector(".item > li:nth-child(8)")).
					getText().contains("Не публикуется"));
		
		driver.findElement(By.id("a65_2")).click();
	}
	/*******************************************************************************************/
	if(driver.findElement(By.id("a65_3")).getAttribute("class").equals("filter")){
		driver.findElement(By.id("a65_3")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		List<WebElement> publiedAdv = driver.findElements(By.cssSelector(".item"));
		for (WebElement tmpadv:publiedAdv)
			Assert.assertTrue(tmpadv.findElement(By.
					cssSelector(".item > li:nth-child(8)")).
					getText().contains("Заблокировано"));
		
		driver.findElement(By.id("a65_3")).click();
	}
	/*******************************************************************************************/
	if(driver.findElement(By.id("a65_4")).getAttribute("class").equals("filter")){
		driver.findElement(By.id("a65_4")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		List<WebElement> publiedAdv = driver.findElements(By.cssSelector(".item"));
		for (WebElement tmpadv:publiedAdv)
			Assert.assertTrue(tmpadv.findElement(By.
					cssSelector(".item > li:nth-child(8)")).
					getText().contains("Удалено"));
		
		driver.findElement(By.id("a65_4")).click();
	}
}

public void testAdvertisments_common_59(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-59\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector(".pagenav > .options > .r > span > .list")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	List<WebElement> adv = driver.findElements(By.cssSelector(".item"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	
	String advNum =	adv.get(advindex).findElement(By.cssSelector(".item > .c1")).getText();
	//System.out.println(advNum);
	adv.get(advindex).findElement(By.cssSelector(".item > .c9 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .hd > .m")).getText()
			.equals(
					new SimpleDateFormat("MMMM", new Locale("ru")).
					format(new java.util.Date())
					)
	);
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .days > #cal_d" 
			+ (new java.util.Date().getDate()-1)
			)).click();
	
	int selectedHour = generator.nextInt(24);

	if (!driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).getAttribute("class").equals("s"))
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).click();
	
	driver.findElement(By.cssSelector("#busyChanger > .close > .ico-close")).click();

	driver.findElement(By.className("save")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.className("d2")).sendKeys(advNum);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	Assert.assertTrue(
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).getAttribute("class").equals("s"));
}

public void testAdvertisments_common_60(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-60\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector(".pagenav > .options > .r > span > .list")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	List<WebElement> adv = driver.findElements(By.cssSelector(".item"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	
	String advNum =	adv.get(advindex).findElement(By.cssSelector(".item > .c1")).getText();

	adv.get(advindex).findElement(By.cssSelector(".item > .c9 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .hd > .m")).getText()
			.equals(
					new SimpleDateFormat("MMMM", new Locale("ru")).
					format(new java.util.Date())
					)
	);
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .days > #cal_d" 
			+ (new java.util.Date().getDate()-1)
			)).click();
	
	int hourFrom = generator.nextInt(11);
	int hourTo = generator.nextInt(hourFrom)+12;
	
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourFrom")).clear();
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourFrom")).sendKeys(""+hourFrom);
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourTo")).clear();
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourTo")).sendKeys(""+hourTo);
	
	driver.findElement(By.cssSelector("#busyChanger > .period  > .setbusy")).click();

	driver.findElement(By.cssSelector("#busyChanger > .close > .ico-close")).click();
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > div > .save")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.className("d2")).sendKeys(advNum);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	for(int i=hourFrom;i<=hourTo;i++)
	Assert.assertTrue(
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + i
			 + "']")).getAttribute("class").equals("s"));
}

public void testAdvertisments_common_61(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-61\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector(".pagenav > .options > .r > span > .list")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	List<WebElement> adv = driver.findElements(By.cssSelector(".item"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	
	String advNum =	adv.get(advindex).findElement(By.cssSelector(".item > .c1")).getText();
	
	String citySubString = adv.get(advindex).findElement(By.cssSelector(".item > .c2 > .addr")).getText().substring(0, 4);

	adv.get(advindex).findElement(By.cssSelector(".item > .c9 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector("#calendar_popup > .popup2 > #busyCalendar > .hd > .m")).getText()
			.equals(
					new SimpleDateFormat("MMMM", new Locale("ru")).
					format(new java.util.Date())
					)
	);
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .days > #cal_d" 
			+ (new java.util.Date().getDate()-1)
			)).click();
	
	int selectedHour = generator.nextInt(24);

	if (!driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).getAttribute("class").equals("s"))
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).click();
	
	driver.findElement(By.cssSelector("#busyChanger > .close > .ico-close")).click();

	driver.findElement(By.className("save")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.className("d2")).sendKeys(advNum);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	Iterator<WebElement> advI = driver.findElements(By.cssSelector("ul[class*='item']")).iterator();
	while (advI.hasNext()){
		WebElement curAdv = advI.next();
		if (curAdv.findElement(By.xpath(".//li[@class='c2']/p[@class='addr']"))
			.getText().subSequence(0, 4).equals(citySubString))
		{
			curAdv.findElement(By.xpath("./li[@class='c2']/p[@class='links']/a[text()='Посмотреть']")).click();
			break;
		}
	}
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.id("schedule_span")).click();
	
	driver.findElement(By.cssSelector("#scheduleDialog > .glow > .popup > #busyCalendar > .days > #cal_d" 
			+ (new java.util.Date().getDate()-1)
			)).click();
	
	Assert.assertTrue(
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).getAttribute("class").equals("s"));

}

public void testAdvertisments_common_63(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-63\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector(".pagenav > .options > .r > span > .list")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	List<WebElement> adv = driver.findElements(By.cssSelector(".item"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	
	String advNum =	adv.get(advindex).findElement(By.cssSelector(".item > .c1")).getText();
	String citySubString = adv.get(advindex).findElement(By.cssSelector(".item > .c2 > .addr")).getText().substring(0, 4);
	adv.get(advindex).findElement(By.cssSelector(".item > .c9 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .hd > .m")).getText()
			.equals(
					new SimpleDateFormat("MMMM", new Locale("ru")).
					format(new java.util.Date())
					)
	);
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .days > #cal_d" 
			+ (new java.util.Date().getDate()-1)
			)).click();
	
	int selectedHour = generator.nextInt(24);

	if (!driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).getAttribute("class").equals("s"))
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).click();
	
	driver.findElement(By.cssSelector("#busyChanger > .close > .ico-close")).click();

	driver.findElement(By.className("save")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.className("d2")).sendKeys(advNum);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	
	Iterator<WebElement> advI = driver.findElements(By.cssSelector("ul[class*='item']")).iterator();
	while (advI.hasNext()){
		WebElement curAdv = advI.next();
		if (curAdv.findElement(By.xpath(".//li[@class='c2']/p[@class='addr']"))
			.getText().subSequence(0, 4).equals(citySubString))
		{
			curAdv.findElement(By.cssSelector(".item > .c9 > a")).click();
			break;
		}
	}
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .days > #cal_d" 
			+ (new java.util.Date().getDate()-1)
			)).click();
	
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).click();

	driver.findElement(By.cssSelector("#busyChanger > .close > .ico-close")).click();

	driver.findElement(By.className("save")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	Assert.assertTrue(
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + selectedHour
			 + "']")).getAttribute("class").equals(""));
	
}

public void testAdvertisments_common_64(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-64\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector(".pagenav > .options > .r > span > .list")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	driver.findElement(By.xpath(".//div[@id='paginator']/a[4]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}

	List<WebElement> adv = driver.findElements(By.cssSelector(".item"));
	
	Random generator = new Random();
	int advindex = generator.nextInt(adv.size()-1)+1;
	
	String advNum =	adv.get(advindex).findElement(By.cssSelector(".item > .c1")).getText();

	adv.get(advindex).findElement(By.cssSelector(".item > .c9 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .hd > .m")).getText()
			.equals(
					new SimpleDateFormat("MMMM", new Locale("ru")).
					format(new java.util.Date())
					)
	);
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > .days > #cal_d" 
			+ (new java.util.Date().getDate()-1)
			)).click();
	
	int hourFrom = generator.nextInt(10)+1;
	int hourTo = generator.nextInt(hourFrom)+12;
	
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourFrom")).clear();
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourFrom")).sendKeys(""+hourFrom);
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourTo")).clear();
	driver.findElement(By.cssSelector("#busyChanger > .period > .hourTo")).sendKeys(""+hourTo);
	
	driver.findElement(By.cssSelector("#busyChanger > .period  > .setfree")).click();

	driver.findElement(By.cssSelector("#busyChanger > .close > .ico-close")).click();
	
	driver.findElement(By.cssSelector(".popup2 > #busyCalendar > div > .save")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.findElement(By.className("d2")).sendKeys(advNum);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	for(int i=hourFrom;i<=hourTo;i++)
	Assert.assertTrue(
	driver.findElement(By.xpath(".//*[@id='busyChanger']/div[4]/ul/li[text()='"
			 + i
			 + "']")).getAttribute("class").equals(""));
}

public void testAdvertisments_common_65(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-64\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Мои объявления")).click();
	
	
}

}

