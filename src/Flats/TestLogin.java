package Flats;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.junit.Assert;

public class TestLogin extends ATestCases {

public TestLogin(String testName) {
        super(testName);
    }
	
public void testLoginValid_flats8(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-8");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testUser");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testUser"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Профиль пользователя")).isDisplayed());
	
} 	
public void testLoginValid_flats4(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-4");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("testLessor");
	driver.findElement(By.id("j_password")).sendKeys("Flats123");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.titleIs("Аренда квартир посуточно, на сутки недорого - Wikirent"));
	Assert.assertTrue(driver.findElement(By.className("welcome")).getText().equals("Здравствуйте, testLessor"));
	Assert.assertTrue(driver.findElement(By.linkText("Выйти")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Профиль пользователя")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Мои объявления")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Мои пользователи")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.linkText("Справочники")).isDisplayed());	
}

public void testLoginInvalid_flats5(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-5");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.id("j_username")).sendKeys("1q1q1q");
	driver.findElement(By.id("j_password")).sendKeys("1q1q1q");
	driver.findElement(By.name("login")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_error")));
	Assert.assertTrue(driver.findElement(By.id("login_error")).isDisplayed());
	Assert.assertTrue(driver.findElement(By.id("login_error")).getText().equals("Неправильно введен логин или пароль"));
}

public void testForgotPasswordLogin_Flats6(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-6");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.xpath(".//*[@id='recoverPassword']/a")).click();
	driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("testUser");
	driver.findElement(By.xpath(".//*[@id='recoverButton']")).click();
	Assert.assertTrue(driver.findElement(By.className("green")).isDisplayed());
}

public void testForgotPasswordMail_Flats7(){
	System.out.print("Test case: \nhttps://testlink.appliedtech.ru/linkto.php?tprojectPrefix=flats&item=testcase&id=flats-7");
	driver.get(generalURL);
	driver.findElement(By.linkText("Войти")).click();
	driver.findElement(By.xpath(".//*[@id='recoverPassword']/a")).click();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test@testbox.ru");
	driver.findElement(By.xpath(".//*[@id='recoverButton']")).click();
	Assert.assertTrue(driver.findElement(By.className("green")).isDisplayed());
}
}
