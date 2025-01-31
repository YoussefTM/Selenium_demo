package Page;

import Utilities.selenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utilities.selenium.DriverFactory.driver;

public class Registration {

    //WebDriver driver = new ChromeDriver();

    public void Register(){
        driver = DriverFactory.getDriver();
        driver.navigate().to("https://practicesoftwaretesting.com/auth/register");
        driver.findElement(By.id("first_name")).sendKeys("Youssef");
        driver.findElement(By.id("last_name")).sendKeys("Tarek");
        driver.findElement(By.id("dob")).sendKeys("08/13/1997");
        driver.findElement(By.id("address")).sendKeys("Mohandessin");
        driver.findElement(By.id("postcode")).sendKeys("12588");
        driver.findElement(By.id("city")).sendKeys("Agouza");
        driver.findElement(By.id("state")).sendKeys("Giza");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("phone")).sendKeys("00201018183973");
        driver.findElement(By.id("email")).sendKeys("yousseftm13@gmail.com");
        driver.findElement(By.id("password")).sendKeys("YoussefTarek@13");
        driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();

}
}
