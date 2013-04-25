package Flats;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TestRegistration extends ATestCases {
	
	public TestRegistration(String testName) {
        super(testName);
    }

public void testRegistration_simple_flats1()throws Exception{
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-1");
	driver.get(generalURL);
	driver.findElement(By.linkText("Зарегистрироваться")).click();
	String username = ("User"+(Math.random()*Integer.MAX_VALUE)).substring(0, 15);
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("passwd")).sendKeys("Flats123");
	driver.findElement(By.name("repasswd")).sendKeys("Flats123");
	driver.findElement(By.name("userLastName")).sendKeys("Петров");
	driver.findElement(By.name("userFirstName")).sendKeys("Петр");
	driver.findElement(By.name("userMiddleName")).sendKeys("Петрович");
	driver.findElement(By.name("email")).sendKeys("mailbox"+ (Math.random()*Integer.MAX_VALUE) +"@mailbox.ru");
	WebElement selectElem = driver.findElement(By.tagName("select"));
	Select select = new Select(selectElem);
	select.selectByIndex((int) (Math.random()* 111));
	driver.findElement(By.name("_action_save")).click();
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, "+username));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Профиль пользователя")).isDisplayed());
	Assert.assertEquals("Квартиры посуточно в Екатеринбурге и Челябинске, снять квартиру на сутки", driver.getTitle());
	}

public void testRegistration_lessor_flats2()throws Exception{
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-2");
	driver.get(generalURL);
	driver.findElement(By.linkText("Зарегистрироваться")).click();
	String username = ("User"+(Math.random()*Integer.MAX_VALUE)).substring(0, 15);
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("passwd")).sendKeys("Flats123");
	driver.findElement(By.name("repasswd")).sendKeys("Flats123");
	driver.findElement(By.name("userLastName")).sendKeys("Петров");
	driver.findElement(By.name("userFirstName")).sendKeys("Петр");
	driver.findElement(By.name("userMiddleName")).sendKeys("Петрович");
	driver.findElement(By.name("email")).sendKeys("mailbox"+ (Math.random()*Integer.MAX_VALUE) +"@mailbox.ru");
	driver.findElement(By.xpath("html/body/div[1]/div/div[6]/div[2]/form/div[1]/div/p[17]/ins/span")).click();
	driver.findElement(By.xpath(".//*[@id='phoneNumber1']")).sendKeys("++++++1234567890");
	driver.findElement(By.xpath(".//*[@id='phoneNumber2']")).sendKeys("++++++1234567890");
	driver.findElement(By.xpath(".//*[@id='phoneNumber3']")).sendKeys("++++++1234567890");
	WebElement selectElem = driver.findElement(By.tagName("select"));
	Select select = new Select(selectElem);
	select.selectByIndex((int) (Math.random()* 111));
	driver.findElement(By.name("_action_save")).click();
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, "+username));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Профиль пользователя")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Мои объявления")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Мои пользователи")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Справочники")).isDisplayed());

}
public void testRegistration_existing_login_flats3()throws Exception{
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-3");
	driver.get(generalURL);
	driver.findElement(By.linkText("Зарегистрироваться")).click();
	driver.findElement(By.id("username")).sendKeys("user");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='usernameBusy']")));
	Assert.assertEquals("Занят", driver.findElement(By.id("usernameBusy")).getText());
}

}
