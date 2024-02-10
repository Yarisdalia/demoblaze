package pom.cart;

import config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    // Propiedades
    By producto;
    By agregarProducto = By.xpath("//a[contains(text(), 'Add to cart')]");
    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Funcionalidades
    public void darClickEnProducto(String nombreDelProducto) {
        waitForSeconds(2);
        producto = By.xpath("//a[contains(text(),'"+ nombreDelProducto +"')]");
        click(producto);

    }
    public void agregarProductoAlCarrito(){
        waitForSeconds(2);
        click(agregarProducto);

    }
    public boolean verificarMensaje(String message){
        String alertMessaget = getAlertMessage();
        if (alertMessaget.equals(message)){
            return true;
        }
        return false;
    }


}
