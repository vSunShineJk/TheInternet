package TheInternet.test.t10_fileDownloading;

import TheInternet.pages.T10_FileDownloadingPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;



public class FileDownloading extends TestBase {

    T10_FileDownloadingPage fileDownloadingPage = new T10_FileDownloadingPage();

    @Test
    public void FileDownloading_test(){
        driver.get(ConfigurationReader.getProperty("fileDownloadingUrl"));
        fileDownloadingPage.downloadLink.click();

        File file = new File("D:\\Downloads\\" + "some-file.txt");
//        Assert.assertTrue(file.exists());

        File folder = new File("D:\\Downloads\\");
        File[] listOfFiles = folder.listFiles();
        String downloadedFile = "";
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile() && listOfFiles[i].getName().contains(".tmp")) downloadedFile = listOfFiles[i].getName();
        }

        Assert.assertTrue(downloadedFile.contains(".tmp"));
    }

}
