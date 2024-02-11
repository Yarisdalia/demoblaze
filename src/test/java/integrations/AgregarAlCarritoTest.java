package integrations;

import config.WebBrowser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.login.LoginPage;

public class AgregarAlCarritoTest {

    WebBrowser web;
    LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        web = new WebBrowser("safari");
        //instanciar la page
        loginPage = new LoginPage(web.getDriver());
        loginPage.visit("https://www.demoblaze.com/");

    }

    @Test
    public void test() {
        System.out.print("Test");
    }

    @Test
    public void test1() {
        System.out.print("Test");
    }

    @AfterClass
    public void afterClass() {
        web.quitWebWindow();
    }
}
