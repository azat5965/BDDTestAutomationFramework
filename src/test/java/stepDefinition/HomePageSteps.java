package stepDefinition;

import pages.HomePage;
import utilities.Driver;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver = Driver.getDriver("chrome");
    HomePage homePage = new HomePage();

}
