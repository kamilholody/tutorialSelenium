import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssGooglePageTest {


    @Test
    public void findCssElements() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver DriverGoogle = new ChromeDriver();
        DriverGoogle.get("https://www.google.pl/");

        By cssID = By.cssSelector("#L2AGLb > div");
        WebElement agreeButton = DriverGoogle.findElement(cssID);
        agreeButton.click();

        By cssName = By.cssSelector("[name='btnK']");
        DriverGoogle.findElement(cssName);
        System.out.println("To jest Selektor Css name " + cssName);

        By cssId2 = By.cssSelector("#APjFqb");
        WebElement searchWindow = DriverGoogle.findElement(cssId2);
        searchWindow.sendKeys("Manchester United");
        Thread.sleep(1000);
        searchWindow.sendKeys(Keys.ENTER);


    }
}
