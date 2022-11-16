package TheInternet.test.t18_notificationMessage;

import TheInternet.pages.T18_NotificationMessagePage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessage extends TestBase {

    T18_NotificationMessagePage obj1 = new T18_NotificationMessagePage();
    public static boolean checking(String message){
        return message.contains("Action unsuccesful, please try again") || message.contains("Action successful") || message.contains("Action Unsuccessful");
    }

    @Test
    public void NotificationMessage_test() throws InterruptedException {

        driver.get(ConfigurationReader.getProperty("notificationMessageUrl"));

        obj1.clickHereBtn.click();
        Assert.assertTrue(checking(obj1.notification.getText()));

        Thread.sleep(1000);
        obj1.clickHereBtn.click();
        Assert.assertTrue(checking(obj1.notification.getText()));

        Thread.sleep(1000);
        obj1.clickHereBtn.click();
        Assert.assertTrue(checking(obj1.notification.getText()));

    }
}
