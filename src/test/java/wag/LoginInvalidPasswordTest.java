package wag;

import org.junit.Assert;
import org.junit.Test;

public class LoginInvalidPasswordTest extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void testLoginInvalidPassword() throws InterruptedException {
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginButton();

        loginPage.inputEmail(user.getEmail());
        loginPage.inputPassword("123");
        loginPage.clickSubmitButton();


        Thread.sleep(3000);

        Assert.assertEquals("Invalid credentials", loginPage.getLoginErrorMessage());
    }
}
