package tests;


import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.byText;

public class AdminTest extends BaseTest {

    @Test
    @Description("Поиск админов")
    public void SearchAdmin() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        app.adminPage.searchButton.click();

    }

    @Test
    @Description("Поиск работников")
    public void SearchEmployeeNameExist() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.EmployeeNameField.setValue("admin");
        app.adminPage.EmployeeNameField.shouldBe(Condition.exactValue("admin"));
        app.adminPage.searchButton.click();
    }

    @Test
    @Flaky
    @Description("Поиск с выпадающим списком")
    @Issue("Number 123")
    @Tag("Regression")
    @Severity(SeverityLevel.MINOR)
    public void SearchAndDropDownCheck() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        //Drop down
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropdown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.searchButton.click();
    }

    @Test
    @Description("Поиск работника")
    @Issue("Number 123")
    @Tag("Regression")
    @Severity(SeverityLevel.MINOR)
    public void SearchEmployee() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.EmployeeNameField.setValue("James  Butler");
        app.adminPage.EmployeeNameField.shouldHave(Condition.exactValue("James  Butler"));
        //Drop down
        app.adminPage.statusButton.click();
        app.adminPage.statusDropdown.getWrappedElement().findElement(byText("Enabled")).click();
        app.adminPage.searchButton.click();
    }
}
