package wag;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectPasswordTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkPage promotionWalkPage;

    @Test
    public void testIncorrectPassword() {
        homePage = new HomePage(driver);
        promotionWalkPage = homePage.clickFirstWalkFreeButton();
        promotionWalkPage.inputEmail(user.getEmail());
        promotionWalkPage.inputPassword(user.getPassword());
        promotionWalkPage.inputFirstName(user.getFirstName());
        promotionWalkPage.inputLastName(user.getLastName());
        promotionWalkPage.inputCellPhone("646392609");

        String phoneError = promotionWalkPage.getCellPhoneErrorMessage();
        Assert.assertEquals("please enter a valid phone number", phoneError);


    }
}
