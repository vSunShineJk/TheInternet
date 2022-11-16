package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T9_DynamicLoadingPage {

    public T9_DynamicLoadingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn;

    @FindBy(xpath = "//div[@id='finish']/h4")
    public WebElement msg;

}
