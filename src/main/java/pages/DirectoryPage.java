package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DirectoryPage extends BasePage {

    public SelenideElement directoryTab = $(By.xpath("(//*[@class='oxd-main-menu-item-wrapper'])[9]"));
    public SelenideElement dirEmployeeNameField = $(By.xpath("//*[@placeholder='Type for hints...']"));
    public SelenideElement dirJobButton = $(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']"));
    public SelenideElement dirJobDropDown = $(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement dirLocationButton = $(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
    public SelenideElement dirLocationDropDown = $(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement searchButton = $(By.xpath("//button[@type='submit']"));


}
