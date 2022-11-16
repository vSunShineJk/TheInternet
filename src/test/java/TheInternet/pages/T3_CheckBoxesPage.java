package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T3_CheckBoxesPage {

    public T3_CheckBoxesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//form/input[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "//form/input[2]")
    public WebElement checkbox2;
}
