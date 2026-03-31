package utils;

import pages.*;

public class App extends BasePage {

    public LoginPage loginPage = new LoginPage();
    public AdminPage adminPage = new AdminPage();
    public LeavePage leavePage = new LeavePage();
    public TimePage timePage = new TimePage();
    public DirectoryPage directoryPage = new DirectoryPage();

    public UserCredentials userCreds = new UserCredentials();
    public DBTest dbTest = new DBTest();

}
