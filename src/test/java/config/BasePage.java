package config;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    // Propiedades
    public final WebDriver driver;
    private By locator;

    // Constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
    }

    // Funcionalidades
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void visit(String url){
        driver.get(url);
    }
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void waitElementAndType(By locator, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
        } catch (NoSuchElementException e){
            // El popup no estaba presente, puedes manejarlo aquí
            System.out.println("El elemento no está presente. Continuando...");
        } catch (TimeoutException e){
            System.out.println("Se acabo el tiempo de espera del elemento. Continuando...");
        }

    }
    public String getAlertMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String alertMessage = alert.getText();

        return alertMessage;
    }
}

