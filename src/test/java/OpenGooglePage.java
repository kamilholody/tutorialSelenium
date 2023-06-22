import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenGooglePage {


    @Test
    public void openGooglePage() throws InterruptedException {

        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");


        // znalezenie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        // kliknięcie przycisków
        agreeButton.click();
        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        // zasymuluj nacisniecie przycisku Enter
        Thread.sleep(1000);
        searchField.sendKeys(Keys.ENTER);
        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());

    }


    public WebDriver getDriver(String browser){


        if (browser.equals("chrome")) {
            String path1 = "C:\\Users\\kamil.holody\\OneDrive - GK\\Dokumenty\\chromedriver_win32\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path1);
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            String path2 = "C:\\Users\\kamil.holody\\OneDrive - GK\\Dokumenty\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", path2);
            return new FirefoxDriver();
        } else if (browser.equals("ie")) {
            String path3 = "C:\\Users\\kamil.holody\\OneDrive - GK\\Dokumenty\\IEDriverServer_x64_4.8.1\\IEDriverServer.exe";
            System.setProperty("webdriver.ie.driver", path3);
            return new InternetExplorerDriver();
        }
        throw new InvalidArgumentException("Invalid browser name");
    }
}
