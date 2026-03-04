package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TimePage extends BasePage {

    public SelenideElement timeTab = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]"));
    public SelenideElement timeEmployeeNameField = $(By.xpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement viewButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
    public SelenideElement errorMessageRequired = $(By.xpath("//*[@class = 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
//    public SelenideElement viewButton = $(By.xpath(""));
//    public SelenideElement viewButton = $(By.xpath(""));
}
