package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage extends BasePage{

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public createAnAccountPage typeEmail(String email_create){
        driver.findElement(By.id("email_create")).sendKeys(email_create);
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();

        //WebDriverWait waiting = new WebDriverWait(driver, 30);
        //waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
               // "//*[@id=\\\"content\\\"]/section[2]/div/div/div/div[4]/a/div/div/h3"))).click();

        return new createAnAccountPage(driver);
    }
}
