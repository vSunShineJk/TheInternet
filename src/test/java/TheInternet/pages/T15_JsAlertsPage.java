package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T15_JsAlertsPage {

    public T15_JsAlertsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Click for JS Alert']")
    public WebElement justJsAlert;

    @FindBy(xpath = "//button[.='Click for JS Confirm']")
    public WebElement jsConfirm;

    @FindBy(xpath = "//button[.='Click for JS Prompt']")
    public WebElement jsPrompt;

    @FindBy(css = "p#result")
    public WebElement resultMsg;

}
