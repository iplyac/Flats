package Flats;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TestAccount extends ATestCases {

	public TestAccount(String fname) {
		super(fname);
	}

public void testAccount_common_34(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-34 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));

	driver.findElement(By.linkText("Профиль пользователя")).click();
	
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("testLessor1");
	
	driver.findElement(By.name("userLastName")).clear();
	driver.findElement(By.name("userLastName")).sendKeys("Петров1");
	
	driver.findElement(By.name("userFirstName")).clear();
	driver.findElement(By.name("userFirstName")).sendKeys("Петр1");
	
	driver.findElement(By.name("userMiddleName")).clear();
	driver.findElement(By.name("userMiddleName")).sendKeys("Петрович1");

	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys("testLessor1@testbox.ru");
	
	WebElement selectElem = driver.findElement(By.tagName("select"));
	Select select = new Select(selectElem);
	select.selectByIndex((int) (Math.random()* 111));
	
	String tmpregion = driver.findElement(By.id("regionid")).getText();

	driver.findElement(By.name("passwd")).clear();
	driver.findElement(By.name("passwd")).sendKeys("Flats123");
	
	driver.findElement(By.name("_action_savePersonal")).click();
	
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testLessor1"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	
	driver.findElement(By.linkText("Профиль пользователя")).click();
	
	Assert.assertTrue(driver.findElement(By.name("username")).getAttribute("value").equals("testLessor1"));
	Assert.assertTrue(driver.findElement(By.name("userLastName")).getAttribute("value").equals("Петров1"));
	Assert.assertTrue(driver.findElement(By.name("userFirstName")).getAttribute("value").equals("Петр1"));
	Assert.assertTrue(driver.findElement(By.name("userMiddleName")).getAttribute("value").equals("Петрович1"));
	Assert.assertTrue(driver.findElement(By.name("email")).getAttribute("value").equals("testLessor1@testbox.ru"));
	Assert.assertTrue(driver.findElement(By.tagName("select")).getText().equals(tmpregion));

	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("testLessor");
	
	driver.findElement(By.name("userLastName")).clear();
	driver.findElement(By.name("userLastName")).sendKeys("Петров");
	
	driver.findElement(By.name("userFirstName")).clear();
	driver.findElement(By.name("userFirstName")).sendKeys("Петр");
	
	driver.findElement(By.name("userMiddleName")).clear();
	driver.findElement(By.name("userMiddleName")).sendKeys("Петрович");

	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys("testLessor@testbox.ru");

	driver.findElement(By.name("passwd")).clear();
	driver.findElement(By.name("passwd")).sendKeys("Flats123");
	
	driver.findElement(By.name("_action_savePersonal")).click();		
}

public void testAccount_common_35(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-35 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Профиль пользователя")).click();
	
	driver.findElement(By.linkText("Изменение пароля")).click();
	
	driver.findElement(By.name("oldpassword")).sendKeys("Flats123");
	driver.findElement(By.name("passwd")).sendKeys("Flats1234");
	driver.findElement(By.name("repasswd")).sendKeys("Flats1234");
	
	driver.findElement(By.name("_action_savePassword")).click();
	
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testLessor"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	
	driver.findElement(By.linkText("Выйти")).click();
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats1234");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Профиль пользователя")).click();
	
	driver.findElement(By.linkText("Изменение пароля")).click();
	
	driver.findElement(By.name("oldpassword")).sendKeys("Flats1234");
	driver.findElement(By.name("passwd")).sendKeys("Flats123");
	driver.findElement(By.name("repasswd")).sendKeys("Flats123");
	
	driver.findElement(By.name("_action_savePassword")).click();
	
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testLessor"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
}
	
public void testAccount_common_36(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-36 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testUser");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Профиль пользователя")).click();

	Assert.assertTrue(driver.findElement(By.name("username")).getAttribute("value").equals("testUser"));
	Assert.assertTrue(driver.findElement(By.name("userLastName")).getAttribute("value").equals("Петров"));
	Assert.assertTrue(driver.findElement(By.name("userFirstName")).getAttribute("value").equals("Петр"));
	Assert.assertTrue(driver.findElement(By.name("userMiddleName")).getAttribute("value").equals("Петрович"));
	Assert.assertTrue(driver.findElement(By.name("email")).getAttribute("value").equals("test@testbox.ru"));

	driver.findElement(By.linkText("Активация/деактивация аккаунта в качестве Арендодателя")).click();
	
	driver.findElement(By.name("phoneNumber1")).clear();
	driver.findElement(By.name("phoneNumber1")).sendKeys("+++7777777777777777");
	driver.findElement(By.name("passwd")).sendKeys("Flats123");
	
	driver.findElement(By.name("_action_lessorActivate")).click();

	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testUser"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());	
	Assert.assertTrue(driver.findElement(By.linkText("Мои объявления")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Мои пользователи")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Справочники")).isDisplayed());
	
	driver.findElement(By.linkText("Профиль пользователя")).click();
	driver.findElement(By.linkText("Активация/деактивация аккаунта в качестве Арендодателя")).click();
	driver.findElement(By.name("passwd")).sendKeys("Flats123");
	
	driver.findElement(By.name("_action_lessorDeactivate")).click();
}	

public void testAccount_common_38(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-38 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));

	driver.findElement(By.linkText("Профиль пользователя")).click();

	Assert.assertTrue(driver.findElement(By.name("username")).getAttribute("value").equals("testLessor"));
	Assert.assertTrue(driver.findElement(By.name("userLastName")).getAttribute("value").equals("Петров"));
	Assert.assertTrue(driver.findElement(By.name("userFirstName")).getAttribute("value").equals("Петр"));
	Assert.assertTrue(driver.findElement(By.name("userMiddleName")).getAttribute("value").equals("Петрович"));
	Assert.assertTrue(driver.findElement(By.name("email")).getAttribute("value").equals("testLessor@testbox.ru"));

	driver.findElement(By.linkText("Активация/деактивация аккаунта в качестве Арендодателя")).click();
	
	driver.findElement(By.name("passwd")).sendKeys("Flats123");
	
	driver.findElement(By.name("_action_lessorDeactivate")).click();
	
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testLessor"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());	

	try{
		Assert.assertFalse(driver.findElement(By.linkText("Мои объявления")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.linkText("Мои пользователи")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.linkText("Справочники")).isDisplayed());		
	}catch(NoSuchElementException e){
		Assert.assertTrue(true);
	}
	
	driver.findElement(By.linkText("Профиль пользователя")).click();
	driver.findElement(By.linkText("Активация/деактивация аккаунта в качестве Арендодателя")).click();
	driver.findElement(By.name("phoneNumber1")).sendKeys("+++7777777777777777");
	driver.findElement(By.name("passwd")).sendKeys("Flats123");
	
	driver.findElement(By.name("_action_lessorActivate")).click();
}	

public void testAccount_common_39(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-39 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Справочники")).click();
	driver.findElement(By.name("begin")).click();
	
	String tmpusername = "контакт"+(Math.random()*Integer.MAX_VALUE);
	driver.findElement(By.name("name")).sendKeys(tmpusername);
	driver.findElement(By.name("phoneNumber1")).sendKeys("7777777777777777");
	driver.findElement(By.name("phoneNumber2")).sendKeys("8888888888888888");
	driver.findElement(By.name("phoneNumber3")).sendKeys("9999999999999999");
	driver.findElement(By.name("phoneNumber4")).sendKeys("9999999999999999");
	driver.findElement(By.name("icq")).sendKeys("9999999999999999");
	driver.findElement(By.name("skype")).sendKeys("skype_contact-skype_contact-skype_contact-skype_contact");
	
	driver.findElement(By.name("create")).click();
	
	List<WebElement> contacts = driver.findElements(By.xpath(".//*[@class='item']"));
	Assert.assertTrue(contacts.get(contacts.size()-1).findElement(By.xpath("./li[2]")).getText().equals(tmpusername));
	Assert.assertTrue(contacts.get(contacts.size()-1).findElement(By.xpath("./li[3]")).getText().contains("+7-777-777-7777"));
	Assert.assertTrue(contacts.get(contacts.size()-1).findElement(By.xpath("./li[3]")).getText().contains("+7-888-888-8888"));
	Assert.assertTrue(contacts.get(contacts.size()-1).findElement(By.xpath("./li[3]")).getText().contains("+7-999-999-9999"));
	Assert.assertTrue(contacts.get(contacts.size()-1).findElement(By.xpath("./li[4]")).getText().contains("999999999"));
	Assert.assertTrue(contacts.get(contacts.size()-1).findElement(By.xpath("./li[4]")).getText().contains("skype_contact-skype_contact-skyp"));
}

public void testAccount_common_43(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-43 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Справочники")).click();

	List<WebElement> contacts = driver.findElements(By.xpath(".//*[@class='item']"));
	int contactindex = 0 + (int)(Math.random() * ((contacts.size() - 1) + 1));
	contacts.get(contactindex).findElement(By.xpath("./li[5]/p/a")).click();
	contacts.clear();
	
	String tmpusername = "контакт"+(Math.random()*Integer.MAX_VALUE);
	driver.findElement(By.name("name")).clear();
	driver.findElement(By.name("phoneNumber1")).clear();
	driver.findElement(By.name("phoneNumber2")).clear();
	driver.findElement(By.name("phoneNumber3")).clear();
	driver.findElement(By.name("phoneNumber4")).clear();
	driver.findElement(By.name("icq")).clear();
	driver.findElement(By.name("skype")).clear();
	
	driver.findElement(By.name("name")).sendKeys(tmpusername);
	driver.findElement(By.name("phoneNumber1")).sendKeys("1111111111111111");
	driver.findElement(By.name("phoneNumber2")).sendKeys("2222222222222222");
	driver.findElement(By.name("phoneNumber3")).sendKeys("3333333333333333");
	driver.findElement(By.name("phoneNumber4")).sendKeys("4444444444444444");
	driver.findElement(By.name("icq")).sendKeys("888888888888888888");
	driver.findElement(By.name("skype")).sendKeys("skype-contact_skype-contact_skype-contact_skype_contact");
	driver.findElement(By.name("_action_lessor_update")).click();
	
	contacts = driver.findElements(By.xpath(".//*[@class='item']"));
	
	Assert.assertTrue(contacts.get(contactindex).findElement(By.xpath("./li[2]")).getText().equals(tmpusername));
	Assert.assertTrue(contacts.get(contactindex).findElement(By.xpath("./li[3]")).getText().contains("+7-111-111-1111"));
	Assert.assertTrue(contacts.get(contactindex).findElement(By.xpath("./li[3]")).getText().contains("+7-222-222-2222"));
	Assert.assertTrue(contacts.get(contactindex).findElement(By.xpath("./li[3]")).getText().contains("+7-333-333-3333"));
	Assert.assertTrue(contacts.get(contactindex).findElement(By.xpath("./li[4]")).getText().contains("888888888"));
	Assert.assertTrue(contacts.get(contactindex).findElement(By.xpath("./li[4]")).getText().contains("skype-contact_skype-contact_skyp"));
}

public void testAccount_common_44(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-44 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Справочники")).click();
	
	List<WebElement> contacts = driver.findElements(By.xpath(".//*[@class='item']"));
	
	int contactscount = contacts.size();
	int contactindex = 1 + (int)(Math.random() * (contacts.size()-1));
	contacts.get(contactindex).findElement(By.xpath("./li[5]/p/a[2]")).click();
	contacts.clear();
	
	driver.findElement(By.name("_action_lessor_delete")).click();
	contacts = driver.findElements(By.xpath(".//*[@class='item']"));
	
	try {
		if (driver.findElement(By.className("message")).isDisplayed()){
			Assert.assertTrue(driver.findElement(By.className("message")).getText().equals("Контактное лицо "+
					contacts.get(contactindex).findElement(By.xpath("./li[2]")).getText()+" не может быть удалено, так как на него имеются ссылки в объявлениях"));
			
		}
	} catch (NoSuchElementException e) {
		Assert.assertTrue(contacts.size() == (contactscount -1));
	}
}

public void testAccount_common_40(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-40 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Справочники")).click();
	driver.findElement(By.linkText("Реквизиты по безналичному расчету")).click();
	
	driver.findElement(By.name("begin")).click();
	
	driver.findElement(By.name("text")).sendKeys("qqqwwweee");
	
	driver.findElement(By.name("create")).click();
	
	List<WebElement> details = driver.findElements(By.xpath(".//*[@class='item']"));
	Assert.assertTrue(details.get(details.size()-1).findElement(By.xpath("./li[2]/pre")).getText().equals("qqqwwweee"));
	Assert.assertTrue(details.get(details.size()-1).findElement(By.xpath("./li[3]/p/a")).isDisplayed());
	Assert.assertTrue(details.get(details.size()-1).findElement(By.xpath("./li[3]/p/a[2]")).isDisplayed());
}

public void testAccount_common_45(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-45 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Справочники")).click();
	driver.findElement(By.linkText("Реквизиты по безналичному расчету")).click();

	List<WebElement> details = driver.findElements(By.xpath(".//*[@class='item']"));
	int detailindex = 0 + (int)(Math.random() * ((details.size() - 1) + 1));
	
	details.get(detailindex).findElement(By.xpath("./li[3]/p/a")).click();
	details.clear();
	
	driver.findElement(By.name("text")).clear();
	driver.findElement(By.name("text")).sendKeys("rrrtttyyy");
	
	driver.findElement(By.name("_action_lessor_update")).click();
	
	details = driver.findElements(By.xpath(".//*[@class='item']"));
	
	Assert.assertTrue(details.get(detailindex).findElement(By.xpath("./li[2]/pre")).getText().equals("rrrtttyyy"));
	
}

public void testAccount_common_46(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-46 \n");
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Справочники")).click();
	driver.findElement(By.linkText("Реквизиты по безналичному расчету")).click();

	List<WebElement> details = driver.findElements(By.xpath(".//*[@class='item']"));
	
	int detailscount = details.size();
	int detailindex = 0 + (int)(Math.random() * ((details.size() - 1) + 1));
	details.get(detailindex).findElement(By.xpath("./li[3]/p/a[2]")).click();
	details.clear();

	driver.findElement(By.name("cancel")).click();
	details = driver.findElements(By.xpath(".//*[@class='item']"));
	
	Assert.assertTrue(details.size() == (detailscount));
	
	details.get(detailindex).findElement(By.xpath("./li[3]/p/a[2]")).click();
	details.clear();
	
	driver.findElement(By.name("_action_lessor_delete")).click();
	details = driver.findElements(By.xpath(".//*[@class='item']"));
	
	Assert.assertTrue(details.size() == (detailscount -1));
}

public void testAccount_common_41_47_48(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-41 \n");
	
	driver.get(generalURL);
	
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	
	driver.findElement(By.linkText("Мои пользователи")).click();
	
	driver.findElement(By.name("begin")).click();
	
	driver.findElement(By.id("username")).sendKeys("testUser");
	driver.findElement(By.id("comment")).sendKeys("comment1 comment1 comment1");
	
	driver.findElement(By.name("begin")).click();
	
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='item']/li[2]")).getText().equals("testUser"));
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='item']/li[3]")).getText().equals("comment1 comment1 comment1"));

	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-47 \n");
	
	driver.findElement(By.linkText("Изменить")).click();

	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("comment")).clear();

	driver.findElement(By.id("username")).sendKeys("iadmin");
	driver.findElement(By.id("comment")).sendKeys("comment2 comment2 comment2");

	driver.findElement(By.name("begin")).click();
		
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='item']/li[2]")).getText().equals("iadmin"));
	Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='item']/li[3]")).getText().equals("comment2 comment2 comment2"));
	
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-48 \n");

	driver.findElement(By.linkText("Удалить")).click();
	driver.findElement(By.name("submit")).click();
	
	try{
		Assert.assertFalse(driver.findElement(By.xpath(".//*[@class='item']/li[2]")).isDisplayed());
	}catch(NoSuchElementException e){
		Assert.assertTrue(true);
	}
}

}
