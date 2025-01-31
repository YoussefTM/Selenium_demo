package Page;

import Utilities.selenium.DriverFactory;
import Utilities.testData.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utilities.selenium.DriverFactory.driver;

public class Login {

//WebDriver driver = new ChromeDriver();

    public void LoginValidUser(){
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys("yousseftm13@gmail.com");
        driver.findElement(By.id("password")).sendKeys("YoussefTarek@13");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void LoginInValidUser(){
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys(Constant.Invalid_Email);
        driver.findElement(By.id("password")).sendKeys(Constant.Invalid_Password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

}
