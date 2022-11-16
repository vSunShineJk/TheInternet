package TheInternet.test.t1_login;

import TheInternet.pages.T1_loginPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFailure extends TestBase {

    T1_loginPage loginPage = new T1_loginPage();

    @Test
    public void loginFailure(){
        driver.get(ConfigurationReader.getProperty("loginUrl"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("invalidUsername"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        loginPage.loginButton.click();

        // assertion to make sure that user could not log in successfully with invalid credentials
        Assert.assertTrue(loginPage.errorMsg.isDisplayed());
    }
}
