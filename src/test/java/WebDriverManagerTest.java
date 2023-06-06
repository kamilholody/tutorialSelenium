import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverManagerTest {

    @Test
    public void openBrowser(){

//        WebDriverManager.firefoxdriver().setup();
//      //Uruchamianie Firefoxa za pomocą WebDriverManegera, nie trzeba ustawiać lokalizacji
//        WebDriver driver = new FirefoxDriver();

        WebDriverManager.chromedriver().setup();
        // Uruchamianie Chrome za pomocą WebDriverManegera, nie trzeba ustawiać lokalizacji
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("alert('Hello')");
        driver.get("https://www.google.com");


    }
}
