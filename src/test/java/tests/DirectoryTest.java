package tests;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;

public class DirectoryTest extends BaseTest {

    @Test
    @Flaky
    @Description("Поиск управляющих")
    @Issue("Number 123")
    @Tag("Regression")
    @Severity(SeverityLevel.MINOR)

    public void DirectorySearch() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        app.directoryPage.directoryTab.click();
        app.directoryPage.dirEmployeeNameField.setValue("Peter Mac Anderson");
        //Drop down
        app.directoryPage.dirJobButton.click();
        app.directoryPage.dirJobDropDown.getWrappedElement().findElement(byText("Automaton Tester")).click();
        app.directoryPage.dirJobButton.shouldHave(Condition.exactText("Automaton Tester"));
        app.directoryPage.dirLocationButton.click();
//        app.directoryPage.dirLocationDropDown.getWrappedElement().findElement(byText("Texas R&D")).click();
//        app.directoryPage.dirLocationButton.shouldHave(Condition.exactText("Texas R&D"));
        app.directoryPage.searchButton.click();
    }
}
