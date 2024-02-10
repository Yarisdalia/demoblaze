package pom.login;

import config.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // Propiedades
    By linkLogin = By.xpath("//*[@id=\"login2\"]");
    By userName = By.xpath("//input[@id='loginusername']");
    By password = By.xpath("//input[@id='loginpassword']");
    By botonLogin =By.xpath("//button[contains(text(),'Log in')]");
    By nameOfUser =By.xpath("//a[@id='nameofuser']");
    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Funcionalidades
    public void abrirFormularioLogin() {
        click(linkLogin);
    }
    public void llenarFormularioLogin(String userName2, String password2){
        waitElementAndType(userName, userName2);
        waitElementAndType(password, password2);
    }
    public void enviarFormularioLogin(){
        click(botonLogin);
    }
    public boolean verificarMensaje(String message){
        String alertMessaget = getAlertMessage();
        if (alertMessaget.equals(message)){
            return true;
        }
        return false;
    }
    public boolean verificarUsuarioLogueado(String userName){
        waitForSeconds(2);
        WebElement element = findElement(nameOfUser);
        String textoUsuario = getText(element);
        if (textoUsuario.equals("Welcome "+userName)){
            return true;
        }
        return false;
    }
}
