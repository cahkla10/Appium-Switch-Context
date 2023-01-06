package pages;

import helpers.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ChromeHomePage {
    private WebDriver webDriver;

    public ChromeHomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, GlobalVariables.TIMEOUT), this);
    }

    @FindBy(id = "com.android.chrome:id/terms_accept")
    @CacheLookup
    private WebElement acceptBtn;

    @FindBy(id = "com.android.chrome:id/negative_button")
    @CacheLookup
    private WebElement noThanks;

    public void clickAcceptBtn(){
        acceptBtn.click();
    }

    public void clickNoThanks(){
        noThanks.click();
    }
}