package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T6_DropdownPage {

    public T6_DropdownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "select#dropdown")
    public WebElement dropdown;

}
