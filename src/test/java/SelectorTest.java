import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElements(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //clickOnMe
        By buttonID = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonID);

        //fname
        //Pierwszy sposób lokalizowania;
        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);

        //Drugi sposób lokalizowania
        driver.findElement(By.name("fname"));

        //topSecret
        By paraHidden = By.className("topSecret");
        driver.findElement(paraHidden);

        //input
        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");

        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

        //link
        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);

        By partialLink = By.partialLinkText("Visit");
        WebElement schoolPartial = driver.findElement(partialLink);


    }
}
