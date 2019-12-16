package wag;

import org.junit.Assert;
import org.junit.Test;

public class AllFieldsMissedTest extends BaseTest {

    private HomePage homepage;
    private PromotionWalkPage promotionWalkPage;

    @Test
    public void testAllFieldsMissed() {
        homepage = new HomePage(driver);
        promotionWalkPage = homepage.clickFirstWalkFreeButton();
        promotionWalkPage.clickEmailField();
        promotionWalkPage.clickPasswordField();
        promotionWalkPage.clickFirstName();
        promotionWalkPage.clickLastName();
        promotionWalkPage.clickCellPhoneField();
        promotionWalkPage.clickEmailField();

        String emailErrorMessage = promotionWalkPage.getEmailErrorMessage();
        Assert.assertEquals("required", emailErrorMessage);

        String firstNameErrorMessage = promotionWalkPage.getFirstNameErrorMessage();
        Assert.assertEquals("required", firstNameErrorMessage);

        String lastNameErrorMessage = promotionWalkPage.getLastNameErrorMessage();
        Assert.assertEquals("required", lastNameErrorMessage);

        String cellPhoneErrorMessage = promotionWalkPage.getCellPhoneErrorMessage();
        Assert.assertEquals("required", cellPhoneErrorMessage);

        String passwordErrorMessageOne = promotionWalkPage.getPasswordErrorMessageOne();
        Assert.assertEquals("(8 Characters,", passwordErrorMessageOne);

        String passwordErrorMessageTwo = promotionWalkPage.getPasswordErrorMessageTwo();
        Assert.assertEquals("1 Letter,", passwordErrorMessageTwo);

        String passwordErrorMessageThree = promotionWalkPage.getPasswordErrorMessageThree();
        Assert.assertEquals("1 Number)", passwordErrorMessageThree);



























    }

}
