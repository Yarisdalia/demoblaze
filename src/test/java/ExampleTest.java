import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class ExampleTest{
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
        SafariOptions options = new SafariOptions();
        SafariDriver driver = new SafariDriver(options);
        driver.get("https://www.example.com/");
        driver.findElement(By.xpath("//a[contains(text(),'More information...')]")).click();
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}