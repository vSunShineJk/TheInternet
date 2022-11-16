package TheInternet.test.t12_floatingMenu;

import TheInternet.pages.T12_FloatingMenuPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FloatingManu extends TestBase {

    T12_FloatingMenuPage floatingMenuPage = new T12_FloatingMenuPage();

    @Test
    public void FloatingMenu_test() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("floatingMenuUrl"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", floatingMenuPage.scrollFromElement);
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true)", floatingMenuPage.scrollUntilElement);
    }

}
