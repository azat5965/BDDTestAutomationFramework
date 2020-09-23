package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver = Driver.getDriver("browser");

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//")
    public WebElement element;
}
