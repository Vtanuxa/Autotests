package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class TimeTest extends BaseTest{

    @Test

    public  void notExistEmployeeName() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        //кликнуть на time вкладку
        app.timePage.timeTab.click();
        //ввести имя сотрудника
        app.timePage.timeEmployeeNameField.setValue("5555555");
        //кликнуть на кнопку поиска
        app.timePage.viewButton.click();
        //проверить ошибку
        app.timePage.errorMessage.shouldBe(Condition.visible);
        app.timePage.errorMessage.shouldBe(Condition.exist);
        app.timePage.errorMessage.shouldHave(Condition.text("Invalid"));

    }
    @Test
    public  void emptyTimeEmployeeName() {
        app.timePage.timeTab.click();
        app.timePage.timeEmployeeNameField.setValue("");
        app.timePage.viewButton.click();
        app.timePage.errorMessageRequired.shouldBe(Condition.visible);
        app.timePage.errorMessage.shouldHave(Condition.text("Required"));
    }
//    @Test


}
