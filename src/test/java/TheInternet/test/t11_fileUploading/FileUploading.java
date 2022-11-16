package TheInternet.test.t11_fileUploading;

import TheInternet.pages.T11_FileUploadingPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploading extends TestBase {

    T11_FileUploadingPage fileUploadingPage = new T11_FileUploadingPage();

    @Test
    public void FileUploading_test(){
        driver.get(ConfigurationReader.getProperty("fileUploadingUrl"));
        fileUploadingPage.chooseBtn.sendKeys("D:\\Downloads\\some-file.txt");
        fileUploadingPage.uploadBtn.click();

        Assert.assertTrue(fileUploadingPage.verifyingMsg.isDisplayed());
    }
}
