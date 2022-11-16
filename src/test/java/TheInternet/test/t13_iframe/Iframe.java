package TheInternet.test.t13_iframe;

import TheInternet.pages.T13_IframePage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe extends TestBase {

    T13_IframePage iframePage = new T13_IframePage();

    @Test
    public void iframe_test() throws InterruptedException {

        driver.get(ConfigurationReader.getProperty("iframeUrl"));
        driver.switchTo().frame(0);

        String beforeTypingAndCleaning = iframePage.textArea.getText();
        iframePage.textArea.clear();

        Thread.sleep(2000);
        iframePage.textArea.sendKeys("Your content goes here.");
        Thread.sleep(2000);

        String afterTypingAndCleaning = iframePage.textArea.getText();
        Assert.assertEquals(beforeTypingAndCleaning,afterTypingAndCleaning);

        driver.switchTo().parentFrame();

    }

}
