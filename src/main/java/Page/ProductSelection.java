package Page;

import Utilities.selenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.selenium.DriverFactory.driver;

public class ProductSelection {

    //WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public void ProductSelect(){
        driver.get("https://practicesoftwaretesting.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[normalize-space()='Thor Hammer']")));
        driver.findElement(By.xpath("//h5[normalize-space()='Thor Hammer']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-add-to-cart']")));
        driver.findElement(By.xpath("//button[@id='btn-add-to-cart']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='cart']")));
        driver.get("https://practicesoftwaretesting.com/checkout");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='float-end ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")));
        driver.findElement(By.xpath("//div[@class='float-end ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")).click();
        driver.findElement(By.id("email")).sendKeys("yousseftm13@gmail.com");
        driver.findElement(By.id("password")).sendKeys("YoussefTarek@13");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }
}
