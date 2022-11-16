package TheInternet.test.t6_dropdown;

import TheInternet.pages.T6_DropdownPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown extends TestBase {

    T6_DropdownPage dropdownPage = new T6_DropdownPage();

    @Test
    public void setDropdown_test(){
        driver.get(ConfigurationReader.getProperty("dropdownUrl"));

        Select select = new Select(dropdownPage.dropdown);
        List<WebElement> options = select.getOptions();

        int numOfOptions = 1;

        for (int i = 1; i < options.size(); i++) {
            options.get(i).click();
            Assert.assertEquals("Option " + numOfOptions++, options.get(i).getText());
        }
    }
}
