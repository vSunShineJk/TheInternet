package TheInternet.test.t3_checkbox;

import TheInternet.pages.T3_CheckBoxesPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.BrowserUtils;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes extends TestBase {
    T3_CheckBoxesPage checkBoxesPage = new T3_CheckBoxesPage();

    @Test
    public void checkCheckboxes() {
        driver.get(ConfigurationReader.getProperty("checkboxUrl"));

        // checking that the first checkbox is not checked
        Assert.assertFalse(checkBoxesPage.checkbox1.isSelected());
        BrowserUtils.sleep(1);
        checkBoxesPage.checkbox1.click();

        Assert.assertTrue(checkBoxesPage.checkbox1.isSelected());
        BrowserUtils.sleep(1);
        checkBoxesPage.checkbox1.click();

        // checking that the second checkbox is checked
        Assert.assertTrue(checkBoxesPage.checkbox2.isSelected());
        BrowserUtils.sleep(1);
        checkBoxesPage.checkbox2.click();

        Assert.assertFalse(checkBoxesPage.checkbox2.isSelected());
        BrowserUtils.sleep(1);
        checkBoxesPage.checkbox2.click();
    }

}
