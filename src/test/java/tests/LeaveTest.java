package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest {

    @Test

    public void invalidEmployeeNameSearch() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.employeeNameField.setValue("5555555");
        app.leavePage.employeeNameField.shouldBe(Condition.exactValue("5555555"));
        app.leavePage.searchButton.click();
        app.leavePage.errorMessage.shouldBe(Condition.visible);
        app.leavePage.errorMessage.shouldBe(Condition.exist);


    }
}
