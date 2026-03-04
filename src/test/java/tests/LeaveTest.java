package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class LeaveTest extends BaseTest {

    @Test
    public void invalidEmployeeNameSearch() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.employeeNameField.setValue("5555555");
        app.leavePage.employeeNameField.shouldHave(Condition.exactValue("5555555"));
        app.leavePage.searchButton.click();
        app.leavePage.errorMessage.shouldBe(Condition.visible);
        app.leavePage.errorMessage.shouldBe(Condition.exist);
    }

    @Test
    @Description("Тест с валидными данными")
    @Issue("Number 123")
    @Tag("Regression")
    @Severity(SeverityLevel.NORMAL)
    public void validEmployeeNameSearch() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.employeeNameField.setValue("Peter Mac Anderson");
        app.leavePage.employeeNameField.shouldHave(Condition.exactValue("Peter Mac Anderson"));
        app.leavePage.subUnitButton.click();
        app.leavePage.subUnitDropDown.getWrappedElement().findElement(byText("Administration")).click();
        app.leavePage.subUnitButton.shouldHave(Condition.exactText("Administration"));
        app.leavePage.searchButton.click();
    }

    @Test
    @Description("Тест с календарем и выпадающим списком")
    @Issue("Number ")
    @Tag("tag")
    @Severity(SeverityLevel.NORMAL)
    public void calendarAndDropDown() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.fromDateField.clear();
        app.leavePage.fromDateField.setValue("2026-01-01");
//        app.leavePage.fromDateField.shouldHave(Condition.value("2026-01-01"));
        app.leavePage.toDateField.clear();
        app.leavePage.toDateField.setValue("2026-03-03");
        app.leavePage.toDateField.shouldHave(Condition.value("2026-03-03"));
        app.leavePage.showLiveWithStatusButton.click();
        app.leavePage.showLiveWithStatusDropDown.getWrappedElement().findElement(byText("Taken")).click();
        app.leavePage.statusAdd.shouldHave(Condition.exactText("Taken"));
        app.leavePage.liveTypeButton.click();
        app.leavePage.liveTypeDropDown.getWrappedElement().findElement(byText("CAN - FMLA")).click();
        app.leavePage.liveTypeButton.shouldHave(Condition.exactText("CAN - FMLA"));
    }
}
