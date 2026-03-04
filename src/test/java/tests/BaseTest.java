package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.App;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    App app = new App();

    @BeforeClass
    public void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void teardown() {
        //Чистка кук
    }
}
