package pom.login;

import config.WebBrowser;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginConUsuarioInexistenteTest extends TestCase {
    // Propiedades
    WebBrowser web;
    LoginPage loginPage;

    @Before
    public void setUp(){
        web = new WebBrowser("safari");
        //instanciar la page
        loginPage = new LoginPage(web.getDriver());
    }
    @Test
    public void test(){
        loginPage.visit("https://www.demoblaze.com/");
        loginPage.abrirFormularioLogin();
        loginPage.llenarFormularioLogin("Yasniel", "1234");
        loginPage.enviarFormularioLogin();
        assertTrue(loginPage.verificarMensaje("User does not exist."));
    }
    @After
    public void tearDown(){
        web.quitWebWindow();
    }
}
