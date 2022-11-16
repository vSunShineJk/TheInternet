package TheInternet.test.t9_dynomicLoading;

import TheInternet.pages.T9_DynamicLoadingPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import TheInternet.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoading extends TestBase {

    T9_DynamicLoadingPage dynamicLoadingPage = new T9_DynamicLoadingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);

    @Test
    public void DynamicLoading_test(){
        driver.get(ConfigurationReader.getProperty("dynamicLoadingUrl"));
        dynamicLoadingPage.startBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicLoadingPage.msg));
        Assert.assertTrue(dynamicLoadingPage.msg.isDisplayed());
    }

}
