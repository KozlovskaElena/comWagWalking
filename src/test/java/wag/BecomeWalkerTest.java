package wag;

import org.junit.Assert;
import org.junit.Test;

public class BecomeWalkerTest extends BaseTest{

    private HomePage homePage;
    private BecomeWalkerPage becomeWalkerPage;

    @Test
    public void testBecomeWalker() {
        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clickBecomeWalkerButton();

        becomeWalkerPage.inputFirstName("Elena");
        becomeWalkerPage.inputLastName("Kozlovska");
        becomeWalkerPage.inputEmail("kozlovska.lana@yahoo");
        becomeWalkerPage.inputPhone("6463926093");
        becomeWalkerPage.inputAddress("1730 E18th str");
        becomeWalkerPage.chooseAddressResult(0);
        becomeWalkerPage.inputApt("4G");
        becomeWalkerPage.inputCity("Brooklyn");
        becomeWalkerPage.clickApplyNowButton();

//        Assert.assertEquals("Enter a valid email address", becomeWalkerPage.assertEmailError());

        Assert.assertEquals("Enter a valid email address", becomeWalkerPage.assertInputError(2));
    }
}
