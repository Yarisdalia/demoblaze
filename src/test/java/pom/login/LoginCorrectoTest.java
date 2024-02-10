package pom.login;

import config.WebBrowser;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginCorrectoTest extends TestCase {
    // Propiedades
    WebBrowser web;
    LoginPage loginPage;

    @Before
    public void setUp(){
        web = new WebBrowser("safari");
        //instanciar la page
        loginPage = new LoginPage(web.getDriver());
        loginPage.visit("https://www.demoblaze.com/");
    }
    @Test
    public void test(){
        loginPage.abrirFormularioLogin();
        loginPage.llenarFormularioLogin("yari", "1234");
        loginPage.enviarFormularioLogin();
        assertTrue(loginPage.verificarUsuarioLogueado("yari"));
    }
    @After
    public void tearDown(){
       web.quitWebWindow();
    }
}
