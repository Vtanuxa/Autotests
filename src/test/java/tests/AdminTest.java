package tests;


import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

    @Test
    public void SearchAdmin() {

        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        //Кликнуть на страницу админ
        app.adminPage.adminTab.click();
        //ввести данные в поле username
        app.adminPage.usernameField.setValue("admin");
        //нажать на кнопку search
        app.adminPage.searchButton.click();

    }

    @Test
    public void SearchEmployeeNameExist() {
        app.loginPage.login(app.userCreds.adminLogin, app.userCreds.adminPassword);
        //Кликнуть на страницу админ
        app.adminPage.adminTab.click();
        //ввести данные в поле username
        app.adminPage.EmployeeNameField.setValue("Tanya");
        //нажать на кнопку search
        app.adminPage.searchButton.click();
    }
}
