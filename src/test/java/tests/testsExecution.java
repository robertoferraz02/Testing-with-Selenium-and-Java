package tests;

import Pages.SignInPage;
import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class testsExecution {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = Web.createChrome();

    }

    @Test
    public void testSignIn() {
        new SignInPage(driver)
                .newUser()
                .typeEmail("teste5@hotmail.com")
                .typeFirstName("Roberto")
                .typeLastName("Ferraz");

    }

    @After

    public void tearDown() {

        driver.quit();


    }

}