import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class IframeTest {

    @Test
    public void testNewWindow(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        WebElement Iframe = driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(Iframe);
        driver.findElement(By.id("fname")).sendKeys("Kamil");
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());

    }
}
