package TheInternet.test.t7_dynamicContent;

import TheInternet.pages.T7_DynamicContentPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicContent extends TestBase {

    T7_DynamicContentPage dynamicContentPage = new T7_DynamicContentPage();

    @Test
    public void setDynamicContent_test() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("dynamicContentUrl"));

        // before refreshing
        String beforeRefreshing1 = dynamicContentPage.firstDynamicDiv.getText();
        Assert.assertTrue(dynamicContentPage.firstDynamicImg.getAttribute("src").contains("/img/avatars/Original-Facebook-Geek-Profile-Avatar-"));
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        // after refreshing
        String afterRefreshing1 = dynamicContentPage.firstDynamicDiv.getText();
        Assert.assertNotEquals(beforeRefreshing1,afterRefreshing1);
        Assert.assertTrue(dynamicContentPage.firstDynamicImg.getAttribute("src").contains("/img/avatars/Original-Facebook-Geek-Profile-Avatar-"));

        // before refreshing
        String beforeRefreshing2 = dynamicContentPage.secondDynamicDiv.getText();
        Assert.assertTrue(dynamicContentPage.secondDynamicImg.getAttribute("src").contains("/img/avatars/Original-Facebook-Geek-Profile-Avatar-"));
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        // after refreshing
        String afterRefreshing2 = dynamicContentPage.secondDynamicDiv.getText();
        Assert.assertNotEquals(beforeRefreshing2,afterRefreshing2);
        Assert.assertTrue(dynamicContentPage.secondDynamicImg.getAttribute("src").contains("/img/avatars/Original-Facebook-Geek-Profile-Avatar-"));

        // before refreshing
        String beforeRefreshing3 = dynamicContentPage.thirdDynamicDiv.getText();
        Assert.assertTrue(dynamicContentPage.thirdDynamicImg.getAttribute("src").contains("/img/avatars/Original-Facebook-Geek-Profile-Avatar-"));
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        // after refreshing
        String afterRefreshing3 = dynamicContentPage.thirdDynamicDiv.getText();
        Assert.assertNotEquals(beforeRefreshing3,afterRefreshing3);
        Assert.assertTrue(dynamicContentPage.thirdDynamicImg.getAttribute("src").contains("/img/avatars/Original-Facebook-Geek-Profile-Avatar-"));
    }
}
