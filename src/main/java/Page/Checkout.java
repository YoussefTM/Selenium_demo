package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

    WebDriver driver = new ChromeDriver();

    public void CheckoutAndPayment(){
        driver.get("https://practicesoftwaretesting.com/checkout");
        driver.findElement(By.id("email")).sendKeys("yousseftm13@gmail.com");
        driver.findElement(By.id("password")).sendKeys("YoussefTarek@13");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }
}
