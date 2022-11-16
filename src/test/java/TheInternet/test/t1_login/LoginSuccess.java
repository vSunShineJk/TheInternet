package TheInternet.test.t1_login;

import TheInternet.pages.T1_loginPage;
import TheInternet.test.base.TestBase;
import TheInternet.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSuccess extends TestBase {

    T1_loginPage loginPage = new T1_loginPage();

    @Test
    public void loginSuccess(){
        driver.get(ConfigurationReader.getProperty("loginUrl"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

        // assertion to make sure that user logged successfully with valid credentials
        Assert.assertTrue(loginPage.logoutBtn.isDisplayed());
        Assert.assertEquals(loginPage.logoutBtn.getText(),"Logout");
    }

}
