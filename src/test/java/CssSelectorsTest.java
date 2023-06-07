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

        By firstChildUlinDiv = By.cssSelector("div > ul");
        By firstChildTrInbody = By.cssSelector("tbody > tr");

        driver.findElement(firstChildUlinDiv);
        driver.findElement(firstChildTrInbody);

        By firstFormAfterLabel = By.cssSelector("label + form");
        By allFormsAfterLabel = By.cssSelector("label ~ form");

        driver.findElement(firstFormAfterLabel);
        driver.findElement(allFormsAfterLabel);

        By attrTag = By.cssSelector("input[name='fname']");
        By attrContains = By.cssSelector("[name*='name']");
        By attrStarts = By.cssSelector("[name^='f']");
        By attrEnds = By.cssSelector("[name$='name']");

        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnds);

        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");

        driver.findElement(firstChild);
        driver.findElement(lastChild);
        driver.findElement(thirdChild);

    }
}
