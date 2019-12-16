package wag;

import org.junit.Assert;
import org.junit.Test;

public class BecomeWalkerAllFieldsMissedTest extends BaseTest {
    private HomePage homePage;
    private BecomeWalkerPage becomeWalkerPage;

    @Test
    public void testBecomeWalkerAllFieldsMissed() {
        homePage = new HomePage(driver);
        becomeWalkerPage = homePage.clickBecomeWalkerButton();

        becomeWalkerPage.clickApplyNowButton();

        Assert.assertEquals("First name cannot be blank", becomeWalkerPage.assertInputError(0));
        Assert.assertEquals("Last name cannot be blank", becomeWalkerPage.assertInputError(1));
        Assert.assertEquals("Enter a valid email address", becomeWalkerPage.assertInputError(2));
        Assert.assertEquals("Enter a valid phone number", becomeWalkerPage.assertInputError(3));
    }
}
