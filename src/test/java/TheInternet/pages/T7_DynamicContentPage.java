package TheInternet.pages;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T7_DynamicContentPage {
    public T7_DynamicContentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='large-10 columns large-centered']/div[1]/div[@class='large-2 columns']/img")
    public WebElement firstDynamicImg;
    @FindBy(xpath = "//div[@class='large-10 columns large-centered']/div[1]/div[@class='large-10 columns']")
    public WebElement firstDynamicDiv;

    @FindBy(xpath = "//div[@class='large-10 columns large-centered']/div[2]/div[@class='large-2 columns']/img")
    public WebElement secondDynamicImg;
    @FindBy(xpath = "//div[@class='large-10 columns large-centered']/div[2]/div[@class='large-10 columns']")
    public WebElement secondDynamicDiv;

    @FindBy(xpath = "//div[@class='large-10 columns large-centered']/div[3]/div[@class='large-2 columns']/img")
    public WebElement thirdDynamicImg;
    @FindBy(xpath = "//div[@class='large-10 columns large-centered']/div[3]/div[@class='large-10 columns']")
    public WebElement thirdDynamicDiv;

}
