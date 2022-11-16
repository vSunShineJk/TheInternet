package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T12_FloatingMenuPage {

    public T12_FloatingMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@target='_blank']")
    public WebElement scrollUntilElement;

    @FindBy(xpath = "//h3")
    public WebElement scrollFromElement;

}
