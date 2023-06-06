import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {

    @Test
    public void findElements(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("Pierwszy");

        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        // Gwiazdka zwraca nam wszystkie elelmenty ze strony
        By all = By.cssSelector("*");
        driver.findElement(all);

        // znajdziemy na dwie listy, które znajdują się w tagu div
        By ulInsideDiv = By.cssSelector("div ul");

        // Tr szukamy tr w całej strukturze table, nie tylko w tbody
        By trInTable = By.cssSelector("table tr");

        By trInBody = By.cssSelector("tbody tr");

        driver.findElement(ulInsideDiv);
        driver.findElement(trInTable);
        driver.findElement(trInBody);





    }
}
