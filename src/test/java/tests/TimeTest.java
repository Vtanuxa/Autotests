package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TimeTest extends BaseTest{

    @Test

    public  void notExistEmployeeName() {

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
    public  void emptyTimeEmployeeName() {
        app.timePage.timeTab.click();
        app.timePage.timeEmployeeNameField.setValue("");
        app.timePage.timeEmployeeNameField.shouldBe(Condition.exactValue(""));
        app.timePage.timeEmployeeNameField.shouldHave(Condition.empty);
        app.timePage.viewButton.click();
        app.timePage.errorMessageRequired.shouldBe(Condition.visible);
        app.timePage.errorMessage.shouldHave(Condition.text("Required"));
    }
//    @Test


}
