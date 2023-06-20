import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class UploadTest {

    @Test
    public void uploadFile() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        int randomNumber = (int) (Math.random()*1000);
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File before = screenshot.getScreenshotAs(OutputType.FILE);
        String fileName = "beforeUpload " + randomNumber + ".png";
        FileUtils.copyFile(before, new File("src/test/resources/" + fileName));
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\kamil.holody\\OneDrive - GK\\Dokumenty\\test\\test.txt");

    }
}
