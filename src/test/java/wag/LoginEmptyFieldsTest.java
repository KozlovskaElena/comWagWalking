package wag;

import org.junit.Assert;
import org.junit.Test;

public class LoginEmptyFieldsTest extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void testLoginEmptyFields() {
        homePage = new HomePage(driver);
        loginPage = homePage.clickLoginButton();
        loginPage.clickSubmitButton();

        Assert.assertEquals("Required", loginPage.getEmptyInputError(0));
        Assert.assertEquals("Required", loginPage.getEmptyInputError(1));

        //commit test
    }
}
