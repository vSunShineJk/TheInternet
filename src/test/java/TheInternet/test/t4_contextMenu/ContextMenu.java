package TheInternet.test.t4_contextMenu;

import TheInternet.pages.T4_ContextMenuPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenu extends TestBase {

    T4_ContextMenuPage contextMenuPage = new T4_ContextMenuPage();

    @Test
    public void contextMenuTest() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("contextMenuUrl"));

        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.contextClick(contextMenuPage.box).perform();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        Assert.assertEquals(alert.getText(),"You selected a context menu");
    }
}
