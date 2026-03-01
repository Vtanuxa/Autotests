package tests;


import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class AdminTest extends BaseTest {

    @Test
    public void SearchAdmin() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        app.adminPage.usernameField.shouldHave(Condition.exactValue("admin"));
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

    @Test
    public void SearchAndDropDownCheck() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        app.adminPage.usernameField.shouldHave(Condition.exactValue("admin"));
        //Drop down
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropdown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleButton.shouldHave(Condition.exactText("Admin"));
        app.adminPage.searchButton.click();
    }
}
