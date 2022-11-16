package TheInternet.test.t15_jsAlerts;

import TheInternet.pages.T15_JsAlertsPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jsAlerts extends TestBase {

    T15_JsAlertsPage jsAlertsPage = new T15_JsAlertsPage();

    @Test
    public void jsAlerts_test() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("jsAlertsUrl"));

        jsAlertsPage.justJsAlert.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        Assert.assertEquals(jsAlertsPage.resultMsg.getText(),"You successfuly clicked an alert");


        jsAlertsPage.jsConfirm.click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(1000);
        alert2.accept();
        Assert.assertTrue(jsAlertsPage.resultMsg.getText().contains("Ok"));


        jsAlertsPage.jsPrompt.click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(1000);
        String input = "Hello world!";
        alert3.sendKeys(input);
        alert.accept();
        Assert.assertTrue(jsAlertsPage.resultMsg.getText().contains(input));

    }
}
