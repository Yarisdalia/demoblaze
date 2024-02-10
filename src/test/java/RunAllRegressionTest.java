import  org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pom.contact.EnviarFormularioTest;
import pom.login.LoginConUsuarioInexistenteTest;
import pom.login.LoginCorrectoTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({EnviarFormularioTest.class, LoginCorrectoTest.class, LoginConUsuarioInexistenteTest.class})
public class RunAllRegressionTest {
}