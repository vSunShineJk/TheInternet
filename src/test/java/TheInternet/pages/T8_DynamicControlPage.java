package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T8_DynamicControlPage {

    public T8_DynamicControlPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement removeBtn;

    @FindBy(xpath = "//input[@id='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//button[.='Add']")
    public WebElement addBtn;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement goneMsg;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableBtn;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement textInput;

    @FindBy(xpath = "//button[.='Disable']")
    public WebElement disableBtn;
}
