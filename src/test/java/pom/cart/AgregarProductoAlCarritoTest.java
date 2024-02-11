package pom.cart;

import config.WebBrowser;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pom.contact.ContactPage;

public class AgregarProductoAlCarritoTest extends TestCase {
    // Propiedades
    WebBrowser web;
    HomePage homePage;
    CartPage cartPage;

    @Before
    public void setUp(){
        web = new WebBrowser("safari");
        //instanciar la page
        homePage = new HomePage(web.getDriver());
        homePage.visit("https://www.demoblaze.com/");
        cartPage=new CartPage(web.getDriver());
    }
    @Test
    public void test(){
        homePage.darClickEnProducto("Samsung galaxy s6");
        homePage.agregarProductoAlCarrito();
        assertTrue(homePage.verificarMensaje("Product added"));
        homePage.visit("https://www.demoblaze.com/cart.html");
        assertTrue(cartPage.verificarProducto("Samsung galaxy s6"));
    }

    @After
    public void tearDown(){
        web.quitWebWindow();
    }

}
