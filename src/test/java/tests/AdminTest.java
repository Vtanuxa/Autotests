package tests;


import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

    @Test
    public void SearchAdmin() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        app.adminPage.usernameField.shouldBe(Condition.exactValue("admin"));
        app.adminPage.searchButton.click();

    }

    @Test
    public void SearchEmployeeNameExist() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.EmployeeNameField.setValue("admin");
        app.adminPage.EmployeeNameField.shouldBe(Condition.exactValue("admin"));
        app.adminPage.searchButton.click();
    }
}
