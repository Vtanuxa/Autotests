package tests;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    @Test
    public  void loginWithValidCred() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        SelenideElement usernameField = $(By.name ("username"));
        SelenideElement passwordField = $(By.name ("password"));
        SelenideElement buttonLogin = $(By.xpath("//button[@type='submit']"));

        usernameField.setValue("Admin");
        passwordField.setValue("admin123");
        buttonLogin.click();

    }

}
