

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.sql.DriverManager.getDriver;

public class Luba extends BaseDriver {

@Test
    public void testEmail(){

    driver.get("https://www.facebook.com/");
    MyMethods.myWait(1);
    WebElement createAccountButton = driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
    createAccountButton.click();

    MyMethods.myWait(1);
    WebElement firstName = driver.findElement(By.name("firstname"));
    firstName.sendKeys("Techno Study");

    MyMethods.myWait(1);
    WebElement lastname = driver.findElement(By.cssSelector("input[name='lastname']"));
    lastname.sendKeys("Batch 8");

    MyMethods.myWait(1);
    WebElement email = driver.findElement(By.cssSelector("input[id^='u_'][name='reg_email__']"));
    WebElement emailConf = driver.findElement(By.name("reg_email_confirmation__"));
    Assert.assertFalse(emailConf.isDisplayed());

    MyMethods.myWait(1);
    email.sendKeys("luba@gmail.com");

    MyMethods.myWait(1);
    Assert.assertTrue(emailConf.isDisplayed());
    emailConf.sendKeys("luba@gmail.com");

    MyMethods.myWait(1);
    WebElement password = driver.findElement(By.cssSelector("input[id^='password_step_input']"));
    password.sendKeys("Qwerty12345");

    MyMethods.myWait(1);
    WebElement month = driver.findElement(By.id("month"));
    Select selectMonth = new Select(month);
    int index = (int) (Math.random() * 12);
    selectMonth.selectByIndex(index);

    MyMethods.myWait(1);
    WebElement day = driver.findElement(By.id("day"));
    Select selectDay = new Select(day);
    List<WebElement> numberOfDays = selectDay.getOptions();
    int index1 = (int) (Math.random() * numberOfDays.size());
    selectDay.selectByIndex(index1);

    MyMethods.myWait(1);
    WebElement year = driver.findElement(By.id("year"));
    Select selectYear = new Select(year);
    List<WebElement> numberOfYears = selectYear.getOptions();
    int index2 = (int) (Math.random() * numberOfYears.size());
    selectYear.selectByIndex(index2);

    MyMethods.myWait(1);
    WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
    gender.click();

    Assert.assertTrue(gender.isSelected());
}

}



