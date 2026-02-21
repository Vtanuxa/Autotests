package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public  void loginWithValidCred() {
        loginPage.usernameField.setValue("Admin");
        loginPage.passwordField.setValue("admin123");
        loginPage.buttonLogin.click();
        //TODO
    }

    @Test
    public  void loginWithInValidCred() {
        loginPage.usernameField.setValue("Admin");
        loginPage.passwordField.setValue("wrong");
        loginPage.buttonLogin.click();
        //TODO
    }

    @Test
    public  void loginWithInValidUsername() {
        loginPage.usernameField.setValue("wrong");
        loginPage.passwordField.setValue("admin123");
        loginPage.buttonLogin.click();
        //TODO
    }

    @Test
    public  void loginWithInEmptyCreds() {
        loginPage.usernameField.setValue("");
        loginPage.passwordField.setValue("");
        loginPage.buttonLogin.click();
        //TODO
    }
    @Test
    public  void loginWithInLongUsername() {
        loginPage.usernameField.setValue("perigtpigpekfpf[pkrpokprfkposrkfpskfpkpfkprfpowkfpwkfpoowfkp");
        loginPage.passwordField.setValue("");
        loginPage.buttonLogin.click();
        //TODO
    }

}
