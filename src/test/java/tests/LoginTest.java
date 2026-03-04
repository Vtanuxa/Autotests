package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    @Test
    @Description("Тест с валидными данными")
    @Issue("Number 123")
    @Tag("Regression")
    @Severity(SeverityLevel.NORMAL)
    public void loginWithValidCred() {
        app.loginPage.usernameField.setValue("Admin");
        app.loginPage.usernameField.shouldBe(Condition.exactValue("Admin"));
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.passwordField.shouldBe(Condition.exactValue("admin123"));
        app.loginPage.buttonLogin.click();

    }

    @Test
    public void loginWithInValidCred() {
        app.loginPage.usernameField.setValue("Admin");
        app.loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));
        app.loginPage.passwordField.setValue("wrong");
        app.loginPage.passwordField.shouldHave(Condition.exactValue("wrong"));
        app.loginPage.buttonLogin.click();
        app.loginPage.errorMessage.shouldBe(Condition.visible);
        app.loginPage.errorMessage.shouldHave(Condition.text("Invalid credentials"));
        app.loginPage.usernameField.shouldBe(Condition.empty);
        app.loginPage.passwordField.shouldBe(Condition.empty);
    }

    @Test
    public void loginWithInValidUsername() {
        app.loginPage.usernameField.setValue("wrong");
        app.loginPage.usernameField.shouldHave(Condition.exactValue("wrong"));
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));
        app.loginPage.buttonLogin.click();
        app.loginPage.errorMessage.shouldBe(Condition.visible);
        app.loginPage.errorMessage.shouldHave(Condition.text("Invalid credentials"));

    }

    @Test
    public void loginWithInEmptyCreds() {
        app.loginPage.usernameField.setValue("");
        app.loginPage.usernameField.shouldBe(Condition.empty);
        app.loginPage.passwordField.setValue("");
        app.loginPage.passwordField.shouldBe(Condition.empty);
        app.loginPage.buttonLogin.click();
        app.loginPage.errorMessageRequiredUsername.shouldBe(Condition.visible);
        app.loginPage.errorMessageRequiredPassword.shouldBe(Condition.visible);
        app.loginPage.usernameField.shouldHave(Condition.empty);
        app.loginPage.passwordField.shouldHave(Condition.empty);
        app.loginPage.errorMessageRequiredUsername.shouldHave(Condition.text("Required"));
        app.loginPage.errorMessageRequiredPassword.shouldHave(Condition.text("Required"));


    }

    @Test
    public void loginWithInLongUsername() {
        app.loginPage.usernameField.setValue("perigtpigpekfpf[pkrpokprfkposrkfpskfpkpfkprfpowkfpwkfpoowfkp");
        app.loginPage.usernameField.shouldHave(Condition.exactValue("perigtpigpekfpf[pkrpokprfkposrkfpskfpkpfkprfpowkfpwkfpoowfkp"));
        app.loginPage.passwordField.setValue("");
        app.loginPage.passwordField.shouldHave(Condition.exactValue(""));
        app.loginPage.passwordField.shouldHave(Condition.empty);
        app.loginPage.passwordField.shouldBe(Condition.empty);
        app.loginPage.buttonLogin.click();
        app.loginPage.errorMessageRequiredPassword.shouldBe(Condition.visible);
        app.loginPage.errorMessageRequiredPassword.shouldHave(Condition.text("Required"));
    }

}
