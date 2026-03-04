package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    public SelenideElement usernameField = $(By.name("username"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement buttonLogin = $(By.xpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
    public SelenideElement errorMessageRequiredUsername = $(By.xpath("(//*[@class= 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]"));
    public SelenideElement errorMessageRequiredPassword = $(By.xpath("(//*[@class= 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]"));

    @Step("Логин")
    public void login(String login, String password) {
        usernameField.setValue(login);
        usernameField.shouldBe(Condition.exactValue(login));
        passwordField.setValue(password);
        passwordField.shouldBe(Condition.exactValue(password));
        buttonLogin.click();
    }

}
