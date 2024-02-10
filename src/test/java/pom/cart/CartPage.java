package pom.cart;

import config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    // Propiedades
    By producto;

    // Constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Funcionalidades
    public boolean verificarProducto(String nombreDelProducto) {
        waitForSeconds(3);
        producto = By.xpath("//td[contains(text(),'" + nombreDelProducto + "')]");
        System.out.println(isDisplayed(producto));
        return isDisplayed(producto);

    }


}
