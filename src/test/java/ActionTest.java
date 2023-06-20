import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionTest {

    @Test
    public void actionTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");
        Actions action = new Actions(driver);
        action.contextClick().perform();
        //action.contextClick(driver.findElement(By.id("myFile"))).perform();

        WebElement button = driver.findElement(By.id("bottom"));
        action.doubleClick(button).perform();
    }
}
