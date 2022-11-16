package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T17_OpeningNewWindowPage {

    public T17_OpeningNewWindowPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Click Here']")
    public WebElement clickHerBtn;
}
