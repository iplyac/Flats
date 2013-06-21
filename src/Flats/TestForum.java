package Flats;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestForum extends ATestCases {

	public TestForum(String fname) {
		super(fname);
		// TODO Auto-generated constructor stub
	}

	
public void testForum_70(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-70\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);
	
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("ТестГость"+random);

	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("ТестГость"+random)
			);
	
	}

public void testForum_71(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-71\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);
	
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("ТестГость"+random);

	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("ТестГость"+random)
			);

	driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).click();
	
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("ТестГость"+random);

	driver.findElement(By.id("message")).sendKeys("Тест Сообщение "+random);
	
	driver.findElement(By.id("add")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector(".cont > .listview > #container > .item > .v1 > .user"))
			.getText().equals("ТестГость"+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'message')][2]/li[2]/div[1]"))
			.getText().equals("Тест Сообщение "+random)
			);
	}

public void testForum_72(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-72\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);
	
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("ТестГость"+random);

	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("ТестГость"+random)
			);

	driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).click();
	
	String username = driver.findElement(By.cssSelector("ul[id*='mess'] > .v1 > .user")).getText();
	
	driver.findElement(By.cssSelector("ul[id*='mess'] > .v2 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.id("message")).getAttribute("value").contains("[b]"+username+"[/b],")
			);
	
	driver.findElement(By.id("message")).sendKeys(" тест ответ");
	
	driver.findElement(By.id("add")).click();
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'message')][2]/li[2]/div[1]"))
			.getText().equals(username+", тест ответ")
			);
}

public void testForum_66(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-66\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);

	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("Гость")
			);
	
	}

public void testForum_68(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-68\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);
	
	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("Гость")
			);

	driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).click();
	
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("ТестГость"+random);

	driver.findElement(By.id("message")).sendKeys("Тест Сообщение "+random);
	
	driver.findElement(By.id("add")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector(".cont > .listview > #container > .item > .v1 > .user"))
			.getText().equals("Гость")
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'message')][2]/li[2]/div[1]"))
			.getText().equals("Тест Сообщение "+random)
			);
	}

public void testForum_69(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-69\n");
	driver.get(generalURL);
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);
	
	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("Гость")
			);

	driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).click();
	
	String username = driver.findElement(By.cssSelector("ul[id*='mess'] > .v1 > .user")).getText();
	
	driver.findElement(By.cssSelector("ul[id*='mess'] > .v2 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.id("message")).getAttribute("value").contains("[b]"+username+"[/b],")
			);
	
	driver.findElement(By.id("message")).sendKeys(" тест ответ");
	
	driver.findElement(By.id("add")).click();
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'message')][2]/li[2]/div[1]"))
			.getText().equals(username+", тест ответ")
			);
}

public void testForum_73(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-\n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testUser");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testUser"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Профиль пользователя")).isDisplayed());
	
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);

	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("testUser")
			);
}

public void testForum_74(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-74\n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testUser");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testUser"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Профиль пользователя")).isDisplayed());
	
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);
	
	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("testUser")
			);

	driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).click();
	
	driver.findElement(By.id("message")).sendKeys("Тест Сообщение "+random);
	
	driver.findElement(By.id("add")).click();
	
	Assert.assertTrue(
			driver.findElement(By.cssSelector(".cont > .listview > #container > .item > .v1 > .user"))
			.getText().equals("testUser")
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'message')][2]/li[2]/div[1]"))
			.getText().equals("Тест Сообщение "+random)
			);
	}

public void testForum_75(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-72\n");
	driver.get(generalURL);

	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testUser");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testUser"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Профиль пользователя")).isDisplayed());
	
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
	driver.findElement(By.linkText("Вопросы от арендодателей")).click();
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Random generator = new Random();
	int random= generator.nextInt(5000);
	
	driver.findElement(By.id("title")).clear();
	driver.findElement(By.id("title")).sendKeys("Тест Название "+random);

	driver.findElement(By.id("description")).clear();
	driver.findElement(By.id("description")).sendKeys("Тест описание "+random);
	
	driver.findElement(By.id("add")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	//	e.printStackTrace();
	}
	
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.titleContains("Вопросы от арендодателей"));
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[2]")).getText()
			.equals("Тест описание "+random)
			);
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).getText()
			.equals("Тест Название "+random)
			);

	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/span[2]")).getText()
			.contains("testUser")
			);

	driver.findElement(By.xpath(".//ul[starts-with(@id,'topic_')][1]/li[2]/div[1]/a")).click();
	
	String username = driver.findElement(By.cssSelector("ul[id*='mess'] > .v1 > .user")).getText();
	
	driver.findElement(By.cssSelector("ul[id*='mess'] > .v2 > a")).click();
	
	Assert.assertTrue(
			driver.findElement(By.id("message")).getAttribute("value").contains("[b]"+username+"[/b],")
			);
	
	driver.findElement(By.id("message")).sendKeys(" тест ответ");
	
	driver.findElement(By.id("add")).click();
	
	Assert.assertTrue(
			driver.findElement(By.xpath(".//ul[starts-with(@id,'message')][2]/li[2]/div[1]"))
			.getText().equals(username+", тест ответ")
			);
}

}
