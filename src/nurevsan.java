import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class nurevsan extends BaseDriver {

    @Test
    public void faceBookCreateAccount() {
        driver.get("https://www.facebook.com/");

        WebElement button1 = driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
        button1.click();

        WebElement name = driver.findElement(By.cssSelector("input[id^='u_'][name='firstname']"));
        name.sendKeys("Nurevsan");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Kurak");

        MyMethods.myWait(1);

        WebElement eMail = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        eMail.sendKeys(" ");

        MyMethods.myWait(1);

        WebElement password = driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
        password.sendKeys("1234.Nur");

        WebElement date = driver.findElement(By.cssSelector("select[aria-label='Month']>option[value='1']"));
        date.click();

        WebElement day = driver.findElement(By.cssSelector("select[aria-label='Day']>option[value='1']"));
        day.click();

        WebElement year = driver.findElement(By.cssSelector("select[id='year']>option[value='1994']"));
        year.click();

        WebElement sex = driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
        sex.click();

        WebElement RegisterButton = driver.findElement(By.cssSelector("button[type='submit'][name='websubmit']"));
        RegisterButton.click();

    }

}
