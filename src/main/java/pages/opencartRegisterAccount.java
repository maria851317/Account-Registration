package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class opencartRegisterAccount {

    @FindBy(className = "btn-primary")
    private static WebElement newCustomerContinueButton;

    @FindBy(id="input-firstname")
    private static WebElement firstNameInputField;

    @FindBy(id = "input-lastname")
    private static WebElement lastNameInPutField;

    @FindBy(id = "input-email")
    private static WebElement emailInPutField;

    @FindBy(id = "input-telephone")
    private static WebElement phoneNumberInPutField;

    @FindBy(id="input-password")
    private static WebElement passWordInPutField;

    @FindBy(id = "input-confirm")
    private static WebElement confirmPassWordInPutField;

    @FindBy(name = "newsletter")
    private static WebElement newsLetterField;

    @FindBy(name = "agree")
    private static WebElement privacyPolicyField;

    static {
        PageFactory.initElements(Browser.driver,opencartRegisterAccount.class);
    }

    /**
     * This method redirects you to the 'opencartRegisterAccount' page.
     */

    public static void goTo(){
        Browser.driver.get("https://shop.pragmatic.bg/index.php?route=account/register");
    }


    /**
     * This method writes text in the "First Name" input field.
     * @param firstname
     */
    public static void writeInTheFirstNameInputField(String firstname){
        firstNameInputField.sendKeys(firstname);
    }

    /**
     * This method writes text in the "Last Name" input field.
     * @param lastname
     */
   public static void writeInTheLastNameInputField(String lastname){
        lastNameInPutField.sendKeys(lastname);

}

    /**
     * This method writes text in the "Email" input field.
     * @param email
     */
    public static void writeInTheEmailInputField(String email){
        emailInPutField.sendKeys(email);
}

    /**
     * This method writes text in the "Phone Number" input field.
     * @param phonenumber
     */
    public static void writeInThePhoneNumberInputField(String phonenumber){
        phoneNumberInPutField.sendKeys(phonenumber);

}

    /**
     * This method writes text in the "Password" input field.
     * @param password
     */
    public static void writeInThePassWordInputField(String password){
        passWordInPutField.sendKeys(password);

}

    /**
     * This method writes text in the "Password Confirm" input field.
     * @param password
     */
    public static void writeInTheConfirmPassWordInputField(String password){
        confirmPassWordInPutField.sendKeys(password);

}

    /**
     * This method checks the Privacy Policy.
     */

public static void checkPrivacyPolicy(){
        privacyPolicyField.click();
}

    /**
     * This method clicks the "Continue" button.
     */
    public static void clickNewCustomerContinueButton(){
        newCustomerContinueButton.click();
    }
}

