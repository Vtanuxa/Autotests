package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.App;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    App app = new App();

    @BeforeClass
    public void setup() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void teardown() {
        //Чистка кук
    }
}
