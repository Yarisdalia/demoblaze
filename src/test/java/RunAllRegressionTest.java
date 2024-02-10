import  org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pom.cart.AgregarProductoAlCarritoTest;
import pom.contact.EnviarFormularioTest;
import pom.login.LoginConUsuarioInexistenteTest;
import pom.login.LoginCorrectoTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({EnviarFormularioTest.class, LoginCorrectoTest.class, LoginConUsuarioInexistenteTest.class, AgregarProductoAlCarritoTest.class})
public class RunAllRegressionTest {
}