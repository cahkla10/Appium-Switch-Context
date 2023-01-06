package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.Switcher;
import pages.ChromeHomePage;
import pages.LoginPage;
import setups.DriverSetup;

public class BackgroundStep {
    LoginPage loginPage = new LoginPage(DriverSetup.getAppiumDriver());
    ChromeHomePage chromeHomePage = new ChromeHomePage(DriverSetup.getAppiumDriver());
    Switcher switcher = new Switcher();

    @Given("^user type \"([^\"]*)\" in address bar$")
    public void userTypeInAddressBar(String url) throws InterruptedException {
        chromeHomePage.clickAcceptBtn();
        chromeHomePage.clickNoThanks();
        Thread.sleep(3000);
        DriverSetup.getAppiumDriver().navigate().to(url);
        Thread.sleep(3000);
        switcher.switchContextTo(1);
    }

    @Then("^Sauce Demo web will displayed$")
    public void sauceDemoWebWillDisplayed() throws Throwable {
        loginPage.seeLogoImg();
    }
}