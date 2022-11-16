package TheInternet.test.t14_mouseHovers;

import TheInternet.pages.T14_MouseHoversPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class MouseHovers extends TestBase {

    T14_MouseHoversPage mouseHoversPage = new T14_MouseHoversPage();

    @Test
    public void mouseHovers_test() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("mouseHoverUrl"));

        List<WebElement> users = mouseHoversPage.Users;
        List<WebElement> userNames = mouseHoversPage.UsersName;
        Actions actions = new Actions(Driver.getDriver());

        for (int i = 0; i < users.size(); i++) {
            Thread.sleep(1000);
            actions.moveToElement(users.get(i)).perform();
            System.out.println("image" + i + " = " + userNames.get(i).isDisplayed());
            assertTrue(userNames.get(i).isDisplayed());
        }

    }

}
