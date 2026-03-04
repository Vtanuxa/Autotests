package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TimeTest extends BaseTest {

    @Test
    @Description("Ввод существующего работника")
    @Severity(SeverityLevel.NORMAL)
    public void notExistEmployeeName() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.timePage.timeTab.click();
        app.timePage.timeEmployeeNameField.setValue("5555555");
        app.timePage.timeEmployeeNameField.shouldBe(Condition.exactValue("5555555"));
        app.timePage.viewButton.click();
        app.timePage.errorMessage.shouldBe(Condition.visible);
        app.timePage.errorMessage.shouldBe(Condition.exist);
        app.timePage.errorMessage.shouldHave(Condition.text("Invalid"));
    }

    @Test
    @Description("Ввод пустого значения")
    @Severity(SeverityLevel.NORMAL)
    public void emptyTimeEmployeeName() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.timePage.timeTab.click();
        app.timePage.timeEmployeeNameField.setValue("");
        app.timePage.timeEmployeeNameField.shouldBe(Condition.exactValue(""));
        app.timePage.timeEmployeeNameField.shouldHave(Condition.empty);
        app.timePage.viewButton.click();
        app.timePage.errorMessageRequired.shouldBe(Condition.visible);
        app.timePage.errorMessage.shouldHave(Condition.text("Required"));
    }

    @Test
    @Description("Ввод существующего работника")
    @Severity(SeverityLevel.MINOR)
    public void ExistEmployeeName() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.timePage.timeTab.click();
        app.timePage.timeEmployeeNameField.setValue("Peter Mac Anderson");
        app.timePage.timeEmployeeNameField.shouldBe(Condition.exactValue("Peter Mac Anderson"));
        app.timePage.viewButton.click();
        app.timePage.errorMessage.shouldBe(Condition.visible);
        app.timePage.errorMessage.shouldBe(Condition.exist);
    }
}
