package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class BecomeWalkerPage extends BasePage {

    public BecomeWalkerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".form-utils-input")
    private List<WebElement> inputFields;

    /*
    0 - firstName
    1 - lastName
    2 - email
    3 - phone
    4 - address
    5 - apt
    6 - city
    7 - zip
     */

    @FindBy(css = ".autocomplete-result")
    private List<WebElement> addressResults;

    @FindBy(css = ".button-text-wrapper")
    private WebElement applyNowButton;

    @FindBy(css = ".error-message")
    private List<WebElement> inputErrorFields;

    /*
    0 - firstName
    1 - lastName
    2 - email
    3 - phone
    */

    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(0)));
        inputFields.get(0).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(1)));
        inputFields.get(1).sendKeys(lastName);
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(2)));
        inputFields.get(2).sendKeys(email);
    }

    public void inputPhone(String phone) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(3)));
        inputFields.get(3).sendKeys(phone);
    }

    public void inputAddress(String address) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(4)));
        inputFields.get(4).sendKeys(address);
    }

    public void chooseAddressResult(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElements(addressResults));
        addressResults.get(index).click();
    }

    public void inputApt (String apt) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(5)));
        inputFields.get(5).sendKeys(apt);
    }

    public void inputCity(String city) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(6)));
        inputFields.get(6).sendKeys(city);
    }

    public void clickApplyNowButton() {
        wait.until(ExpectedConditions.elementToBeClickable(applyNowButton));
        applyNowButton.click();
    }

    public String assertEmailError() {
//        String emailError;
        wait.until(ExpectedConditions.visibilityOf(inputErrorFields.get(2)));
        String emailError = inputErrorFields.get(2).getText();
        return emailError;
    }

    public String assertInputError(int index) {
        wait.until(ExpectedConditions.visibilityOf(inputErrorFields.get(index)));
        String inputError = inputErrorFields.get(index).getText();
        return inputError;
    }

}
