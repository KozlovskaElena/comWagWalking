package wag;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PromotionWalkPage extends BasePage {

    public PromotionWalkPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(css = "input[name=\"email\"]")
//    private WebElement emailField;
//
//    public void inputEmail(String email) {
//        emailField.sendKeys(email);
//    }

    @FindBy(css = "input")
    private List<WebElement> inputFields;

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> errorMessages;

    @FindBy(css = ".sc-gzVnrw.fzplxK")
    private List<WebElement> passwordErrorMessages;

    public void inputEmail(String email) { inputFields.get(0).sendKeys(email); }

    public void inputPassword(String password) {
        inputFields.get(1).sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        inputFields.get(2).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        inputFields.get(3).sendKeys(lastName);
    }

    public void inputCellPhone(String cellPhone) {
        inputFields.get(4).sendKeys(cellPhone);
    }

    public void clickEmailField() {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(0)));
        inputFields.get(0).click();
    }

    public void clickPasswordField() {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(1)));
        inputFields.get(1).click();
    }

    public void clickFirstName() {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(2)));
        inputFields.get(2).click();
    }

    public void clickLastName() {
        wait.until(ExpectedConditions.elementToBeClickable(inputFields.get(3)));
        inputFields.get(3).click();
    }

    public void clickCellPhoneField() {
        inputFields.get(4).click();
    }

    public String getEmailErrorMessage() {
        return errorMessages.get(0).getText();
    }

    public String getFirstNameErrorMessage() {
        return errorMessages.get(1).getText();
    }

    public String getLastNameErrorMessage() {
        return errorMessages.get(2).getText();
    }

    public String getCellPhoneErrorMessage() {
        return errorMessages.get(3).getText();
    }

    public String getPasswordErrorMessageOne() {
        return passwordErrorMessages.get(0).getText();
    }

    public String getPasswordErrorMessageTwo() {
        return passwordErrorMessages.get(1).getText();
    }

    public String getPasswordErrorMessageThree() {
        return passwordErrorMessages.get(2).getText();
    }


































}
