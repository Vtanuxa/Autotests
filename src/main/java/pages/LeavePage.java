package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeavePage extends BasePage {

    public SelenideElement leaveTab = $(By.xpath("//*[@class='oxd-main-menu-item active']"));
    public SelenideElement employeeNameField = $(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
    public SelenideElement searchButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(By.xpath("//*[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));

}
