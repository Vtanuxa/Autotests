package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeavePage extends BasePage {

    public SelenideElement leaveTab = $(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]"));
    public SelenideElement employeeNameField = $(By.xpath("//*[@placeholder='Type for hints...']"));
    public SelenideElement searchButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement errorMessage = $(By.xpath("//*[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
    public SelenideElement subUnitButton = $(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[3]"));
    public SelenideElement subUnitDropDown = $(By.xpath("//*[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement fromDateField = $(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
    public SelenideElement toDateField = $(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
    public SelenideElement showLiveWithStatusButton = $(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[1]"));
    public SelenideElement showLiveWithStatusDropDown = $(By.xpath("//*[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement statusAdd = $(By.xpath("(//span[@class='oxd-chip oxd-chip--default oxd-multiselect-chips-selected'])[2]"));
    public SelenideElement liveTypeButton = $(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[2]"));
    public SelenideElement liveTypeDropDown = $(By.xpath("//*[@class='oxd-select-dropdown --positon-bottom']"));
}
