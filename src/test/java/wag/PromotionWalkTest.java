package wag;

import org.junit.Test;

public class PromotionWalkTest extends BaseTest {

    private HomePage homePage;
    private PromotionWalkPage promotionWalkPage;

    @Test

    public void testPromotionWalk() {
        homePage = new HomePage(driver);
        promotionWalkPage = homePage.clickFirstWalkFreeButton();
        promotionWalkPage.inputEmail(user.getEmail());
        promotionWalkPage.inputPassword(user.getPassword());
        promotionWalkPage.inputFirstName(user.getFirstName());
        promotionWalkPage.inputLastName(user.getLastName());
        promotionWalkPage.inputCellPhone(user.getCellPhone());

    }
}
