import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Luba extends BaseDriver {

@Test
    public void testEmail(){

    MyMethods.myWait(1);
    WebElement email = driver.findElement(By.cssSelector("input[id^='u_'][name='reg_email__']"));
    WebElement emailConf = driver.findElement(By.name("reg_email_confirmation__"));
    Assert.assertFalse(emailConf.isDisplayed());

    MyMethods.myWait(2);
    email.sendKeys("mary@gmail.com");

    Assert.assertTrue(emailConf.isDisplayed());
    emailConf.sendKeys("mary@gmail.com");

}


}
