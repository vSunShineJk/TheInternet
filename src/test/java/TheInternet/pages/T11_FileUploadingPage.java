package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T11_FileUploadingPage {

    public T11_FileUploadingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='file-submit']")
    public WebElement uploadBtn;

    @FindBy(xpath = "//input[@id='file-upload']")
    public WebElement chooseBtn;

    @FindBy(xpath = "//h3")
    public WebElement verifyingMsg;

}
