package Flats;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestMainPage extends ATestCases {

	public TestMainPage(String fname) {
		super(fname);
	}

public void testMainPage_flats9(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-9");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("title").equals("Квартиры посуточно в Екатеринбурге"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("alt").equals("Квартиры посуточно в Екатеринбурге"));
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advertCount']")).getText().substring(
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-13),
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-1)).equals("Екатеринбург"));
}	

public void testMainPage_flats10(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-10");
	driver.get(generalURL);
	driver.findElement(By.linkText("ЧЕЛЯБИНСК")).click();
	wait.until(ExpectedConditions.titleContains("Челябинск"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("title").equals("Квартиры посуточно в Челябинске"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("alt").equals("Квартиры посуточно в Челябинске"));
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advertCount']")).getText().substring(
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-10),
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-1)).equals("Челябинск"));
}

public void testMainPage_flats11(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-11");
	driver.get(generalURL);
	driver.findElement(By.className("selectcity")).click();
	driver.findElement(By.xpath(".//*[@id='cities']/li[1]/a")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("title").equals("Квартиры посуточно в Екатеринбурге"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("alt").equals("Квартиры посуточно в Екатеринбурге"));
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advertCount']")).getText().substring(
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-13),
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-1)).equals("Екатеринбург"));
	
}
public void testMainPage_flats12(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-12");
	driver.get(generalURL);
	driver.findElement(By.className("selectcity")).click();
	driver.findElement(By.xpath(".//*[@id='cities']/li[2]/a")).click();
	wait.until(ExpectedConditions.titleContains("Челябинск"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("title").equals("Квартиры посуточно в Челябинске"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("alt").equals("Квартиры посуточно в Челябинске"));
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advertCount']")).getText().substring(
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-10),
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-1)).equals("Челябинск"));
}

public void testMainPage_flats13(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-13");
	driver.get(generalURL);
	driver.findElement(By.xpath("html/body/div[1]/div/div[6]/div[2]/div[2]/a/div/img")).click();
	wait.until(ExpectedConditions.titleContains("Екатеринбург"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("title").equals("Квартиры посуточно в Екатеринбурге"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("alt").equals("Квартиры посуточно в Екатеринбурге"));
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advertCount']")).getText().substring(
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-13),
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-1)).equals("Екатеринбург"));
}

public void testMainPage_flats14(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-14");
	driver.get(generalURL);
	driver.findElement(By.xpath("html/body/div[1]/div/div[6]/div[2]/div[3]/a/div/img")).click();
	wait.until(ExpectedConditions.titleContains("Челябинск"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("title").equals("Квартиры посуточно в Челябинске"));
	Assert.assertTrue(driver.findElement(By.id("cityLogo")).getAttribute("alt").equals("Квартиры посуточно в Челябинске"));
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id='advertCount']")).getText().substring(
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-10),
					 (driver.findElement(By.xpath("//div[@id='advertCount']")).getText().length()-1)).equals("Челябинск"));
}

public void testMainPage_flats15_1(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-15");
	driver.get(generalURL);
	driver.findElement(By.linkText("О проекте")).click();
	wait.until(ExpectedConditions.titleContains("О проекте"));
	Assert.assertTrue(driver.getTitle().equals("О проекте Wikirent.ru - аренда квартир посуточно в Екатеринбурге и Челябинске"));
}

public void testMainPage_flats15_2(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-15");
	driver.get(generalURL);
	driver.findElement(By.linkText("Каталог квартир")).click();
	driver.findElement(By.linkText("ЕКАТЕРИНБУРГ")).click();
	Assert.assertTrue(driver.getTitle().equals("Квартиры посуточно в Екатеринбурге, снять квартиру на сутки"));
}

public void testMainPage_flats15_3(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-15");
	driver.get(generalURL);
	driver.findElement(By.linkText("Владельцам квартир")).click();
	wait.until(ExpectedConditions.titleContains("Владельцам квартир"));
	Assert.assertTrue(driver.getTitle().equals("Владельцам квартир - бесплатно разместить объявление аренды квартиры посуточно в Екатеринбурге и Челябинске"));
}

public void testMainPage_flats15_4(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-15");
	driver.get(generalURL);
	driver.findElement(By.linkText("Статьи")).click();
	wait.until(ExpectedConditions.titleContains("Статьи"));
	Assert.assertTrue(driver.getTitle().equals("Статьи на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
	
}

public void testMainPage_flats15_5(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-15");
	driver.get(generalURL);
	driver.findElement(By.linkText("Форум")).click();
	wait.until(ExpectedConditions.titleContains("Форум"));
	Assert.assertTrue(driver.getTitle().equals("Форум на Wikirent.ru - квартиры посуточно в Екатеринбурге и Челябинске"));
}

public void testMainPage_flats15_6(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-15");
	driver.get(generalURL);
	driver.findElement(By.linkText("Контакты")).click();
	wait.until(ExpectedConditions.titleContains("Контакты"));
	Assert.assertTrue(driver.getTitle().equals("Контакты Wikirent.ru"));
}

public void testMainPage_flats16(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-16");
	driver.get(generalURL);
	driver.findElement(By.linkText("Как разместить бесплатное объявление")).click();
	driver.findElement(By.linkText("«Зарегистрироваться»")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("оставить заявку")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='callform']")));
	driver.findElement(By.xpath(".//*[@id='nameInput']")).sendKeys("testLessor");
	driver.findElement(By.xpath(".//*[@id='phoneInput']")).sendKeys("1111111111");
	driver.findElement(By.xpath(".//*[@id='requestCall']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='successResponce']")));
	driver.findElement(By.xpath(".//*[@id='callform']/div/div[1]/a")).click();
}

	
}

