package Page;

import org.openqa.selenium.By;

import static Utilities.selenium.DriverFactory.driver;

public class Logout {

    public void LogoutUser(){
        driver.findElement(By.id("menu")).click();
        driver.findElement(By.xpath("")).click();

    }
}
