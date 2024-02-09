package pom.contact;

import config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {

    // Propiedades
    By contactLink = By.xpath("//a[@data-target='#exampleModal']");
    By contactEmail = By.id("recipient-email");
    By contactName = By.xpath("//input[@id='recipient-name']");
    By message = By.xpath("//textarea[@id='message-text']");
    By sendMessage = By.xpath("//button[contains(text(),'Send message')]");
    // Constructor
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    // Funcionalidades
    public void abrirFormulario(){
        click(contactLink);
    }

    public void llenarFormulario() {
        waitElementAndType(contactEmail,"yarita@gmail.com");
        waitElementAndType(contactName,"Yari");
        waitElementAndType(message, "Hola");
    }
    public void enviarFormulario(){
        click(sendMessage);
    }
    public boolean verificarMensaje(String message){
        String alertMessaget = getAlertMessage();
        if (alertMessaget.equals(message)){
            return true;
        }
        return false;
    }

}


