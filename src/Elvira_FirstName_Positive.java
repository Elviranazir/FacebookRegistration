

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Elvira_FirstName_Positive extends BaseDriver {
    @Test
    public void faceBookCreateAccount() {
        driver.get("https://www.facebook.com/");

        WebElement button1 = driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
        button1.click();
    }
}