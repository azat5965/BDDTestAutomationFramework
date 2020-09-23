package StepDefinition;

import Pages.HomePage;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver = Driver.getDriver("chrome");
    HomePage homePage = new HomePage();

}
