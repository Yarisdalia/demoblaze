package pom.contact;

import config.WebBrowser;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EnviarFormularioTest extends TestCase {

    // Propiedades
    WebBrowser web;
    ContactPage contactPage;

    @Before
    public void setUp(){
        web = new WebBrowser("safari");
        //instanciar la page
        contactPage = new ContactPage(web.getDriver());
    }
    @Test
    public void test(){
        contactPage.visit("https://www.demoblaze.com/");
        contactPage.abrirFormulario();
        contactPage.llenarFormulario();
        contactPage.enviarFormulario();
        assertTrue(contactPage.verificarMensaje("Thanks for the message!!"));
    }

    @After
    public void tearDown(){
        web.quitWebWindow();
    }

}

