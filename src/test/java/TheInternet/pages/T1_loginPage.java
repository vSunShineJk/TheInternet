package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T1_loginPage {

    public T1_loginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.=' Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.=' Logout']")
    public WebElement logoutBtn;

    @FindBy(xpath = "//div[@class='flash error']")
    public WebElement errorMsg;

}
