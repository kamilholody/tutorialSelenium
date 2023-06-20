import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;

public class homePageTest {

    @Test
    public void homePage(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Perform test for Title subject
        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.tagName("h1"));
        actions.moveToElement(heading).perform();

        //Perform test for ClickMe button
        WebElement firstButton = driver.findElement(By.id("clickOnMe"));
        firstButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Perform test for input
        WebElement input = driver.findElement(By.name("fname"));
        input.sendKeys("Kamil");

        //Perform test for link

        WebElement schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        schoolLink.click();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement schoolPartial = driver.findElement(By.linkText("IamWeirdLink"));
        schoolPartial.click();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Perform test for table
        WebElement tableHeader = driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(2) > td:nth-child(1)"));
        System.out.println(tableHeader.getText());

        //Perform test for select
        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByValue("volvo");
        System.out.println(selectCar.getText());

        //Perform test for checkbox
        WebElement checkbox = driver.findElement(By.cssSelector("[type='checkbox']"));
        checkbox.click();
        WebElement checkboxSex = driver.findElement(By.cssSelector("[value='male']"));
        checkboxSex.click();

        //Perform test for input
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.clear();
        userNameInput.sendKeys("admin");
        System.out.println(userNameInput.getText());
        System.out.println(userNameInput.getAttribute("value"));
        userNameInput.sendKeys(Keys.ENTER);
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        driver.switchTo().alert().accept();

        //Perform test for New window
        String currentWindow = driver.getWindowHandle();
        driver.findElement(By.id("newPage")).click();
        Set<String> windowNames = driver.getWindowHandles();
        for(String window : windowNames){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
        By cssID = By.cssSelector("#L2AGLb > div");
        WebElement agreeButton = driver.findElement(cssID);
        agreeButton.click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("fname")).sendKeys("Kamil");
    }
}
