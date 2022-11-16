package TheInternet.test.t8_dynamicControl;

import TheInternet.pages.T8_DynamicControlPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import TheInternet.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControl extends TestBase {

    T8_DynamicControlPage dynamicControlPage = new T8_DynamicControlPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);

    @Test
    public void DynamicControl_test() throws InterruptedException {

        driver.get(ConfigurationReader.getProperty("dynamicControlUrl"));

        dynamicControlPage.removeBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicControlPage.addBtn));
        Assert.assertTrue(dynamicControlPage.goneMsg.isDisplayed());

        dynamicControlPage.addBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicControlPage.checkbox));
        Assert.assertTrue(dynamicControlPage.checkbox.isDisplayed());

        dynamicControlPage.enableBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicControlPage.disableBtn));
        Assert.assertTrue(dynamicControlPage.textInput.isEnabled());

        dynamicControlPage.disableBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicControlPage.enableBtn));
        Assert.assertFalse(dynamicControlPage.textInput.isEnabled());
    }
}
