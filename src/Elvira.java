
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Elvira extends BaseDriver {
    @Test
    public void faceBookCreateAccount() {
        driver.get("https://www.facebook.com/");

        WebElement button1 = driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
        button1.click();

        WebElement name = driver.findElement(By.cssSelector("input[id^='u_'][name='firstname']"));
        name.sendKeys("Elvira");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Snow");

        MyMethods.myWait(1);

        WebElement eMail = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        eMail.sendKeys(" ");

        MyMethods.myWait(1);

        WebElement password = driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
        password.sendKeys("Cankut1234.");

        WebElement date = driver.findElement(By.cssSelector("select[aria-label='Month']>option[value='4']"));
        date.click();

        WebElement day = driver.findElement(By.cssSelector("select[aria-label='Day']>option[value='4']"));
        day.click();

        WebElement year = driver.findElement(By.cssSelector("select[id='year']>option[value='1985']"));
        year.click();

        WebElement sex = driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
        sex.click();

        WebElement RegisterButton = driver.findElement(By.cssSelector("button[type='submit'][name='websubmit']"));
        RegisterButton.click();

    }
}