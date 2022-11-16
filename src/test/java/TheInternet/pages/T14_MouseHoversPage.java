package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T14_MouseHoversPage {

    public T14_MouseHoversPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div.figure")
    public List<WebElement> Users;

    @FindBy(xpath = "//h5")
    public List<WebElement> UsersName;
}
