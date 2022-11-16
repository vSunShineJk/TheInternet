package TheInternet.test.t17_openingNewWindow;

import TheInternet.pages.T17_OpeningNewWindowPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpeningNewWindow extends TestBase {

    T17_OpeningNewWindowPage openingNewWindowPage = new T17_OpeningNewWindowPage();

    @Test
    public void openingNewWindow_test(){
        driver.get(ConfigurationReader.getProperty("openingWindowUrl"));

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        openingNewWindowPage.clickHerBtn.click();
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
        }

        String newWind0wTitle = driver.getTitle();
        Assert.assertEquals(newWind0wTitle,"New Window");

    }

}
