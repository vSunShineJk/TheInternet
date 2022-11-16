package TheInternet.test.t5_dragAndDrop;

import TheInternet.pages.T5_DragAndDropPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {

    T5_DragAndDropPage dragAndDropPage = new T5_DragAndDropPage();

    @Test
    public void setDragAndDropPage_test() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("dragAndDropUrl"));
        Assert.assertEquals(dragAndDropPage.firstBox.getText(),dragAndDropPage.boxA.getText());

        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.clickAndHold(dragAndDropPage.boxA).moveToElement(dragAndDropPage.boxB).release().perform();
        System.out.println("A: "+dragAndDropPage.boxA.getText());
        System.out.println("B: "+dragAndDropPage.boxB.getText());
        System.out.println("first: "+dragAndDropPage.firstBox.getText());

        //Assert.assertEquals(dragAndDropPage.firstBox.getText(),dragAndDropPage.boxB.getText());
    }

}
