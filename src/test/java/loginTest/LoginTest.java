package loginTest;

import Page.Login;
import Page.Logout;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureResultsWriter;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static Utilities.selenium.DriverFactory.driver;

public class LoginTest {

    final Login login = new Login();
    final Logout logout = new Logout();

    @org.testng.annotations.Test(priority = 1)
    public void LoginWithValidCredentials() {
        login.LoginValidUser();
    }

    @org.testng.annotations.Test(priority = 2)
    public void LoginWithInValidCredentials() {
        login.LoginInValidUser();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.help-block")));
        String errorMessage = errorMessageElement.getText();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage, "Invalid email or password");
        Reporter.log("Youssef Tarek");

    }

    @AfterTest
    public void Close_Driver(){
        driver.close();
    }
}
