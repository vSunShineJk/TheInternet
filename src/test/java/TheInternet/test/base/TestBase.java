package TheInternet.test.base;

import TheInternet.test.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
