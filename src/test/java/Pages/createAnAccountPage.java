package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createAnAccountPage extends BasePage {


    public createAnAccountPage(WebDriver driver) {
        super(driver);
    }

    public createAnAccountPage typeFirstName(String customer_firstname) {
        driver.findElement(By.id("customer_firstname")).sendKeys(customer_firstname);

        return this;
    }

    public createAnAccountPage typeLastName(String customer_lastname) {
        driver.findElement(By.id("customer_lastname")).sendKeys(customer_lastname);

        return this;

    }

    public createAnAccountPage selectSate(String state) {
        WebElement findState = driver.findElement(By.id("id_state"));
        new Select(findState).selectByVisibleText(state);

        return this;

    }

}

