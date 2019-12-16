package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.yeXEn")
    private WebElement firstWalkFreeButton;

    @FindBy(css = ".sc-ifAKCX.fHUled")
    private List<WebElement> headerFields;

    /*
    0 - Services
    1 - Wag Tag
    2 - Help Center
    3 - Login
     */

    @FindBy(css = ".sc-ifAKCX.jlgKgQ")
    private WebElement becomeWalker;

    public PromotionWalkPage clickFirstWalkFreeButton() {
        firstWalkFreeButton.click();
        return new PromotionWalkPage(driver);
    }

    public LoginPage clickLoginButton() {
        headerFields.get(3).click();
        return new LoginPage(driver);
    }

    public BecomeWalkerPage clickBecomeWalkerButton() {
        wait.until(ExpectedConditions.elementToBeClickable(becomeWalker));
        becomeWalker.click();
        return new BecomeWalkerPage(driver);
    }



}
