package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T18_NotificationMessagePage {

    public T18_NotificationMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Click here']")
    public WebElement clickHereBtn;

    @FindBy(css = "div#flash")
    public WebElement notification;

}
