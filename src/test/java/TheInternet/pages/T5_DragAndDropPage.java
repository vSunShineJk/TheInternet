package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T5_DragAndDropPage {

    public T5_DragAndDropPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div#column-a")
    public WebElement boxA;

    @FindBy(css = "div#column-b")
    public WebElement boxB;

    @FindBy(xpath = "//div[@class='column']")
    public WebElement firstBox;
}
