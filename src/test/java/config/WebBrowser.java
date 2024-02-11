package config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class WebBrowser {

    // Propiedades
    private WebDriver driver;

    // Constructor
    public WebBrowser(String type){
        if(type.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver");
            driver = new FirefoxDriver();
        }
        if (type.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
            driver = new ChromeDriver();
        }
        if (type.equals("safari")) {
            SafariOptions options = new SafariOptions();
            driver = new SafariDriver(options);
        }
    }

    // Getters y Setters
    public WebDriver getDriver() {
        return driver;
    }

    // Funcionalidades
    public void quitWebWindow () {
        wait2Seconds();
        driver.quit();
    }

    public void wait2Seconds() {
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
