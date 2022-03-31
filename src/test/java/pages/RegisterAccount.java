package pages;

import core.BaseTest;
import org.testng.annotations.Test;

public class RegisterAccount extends BaseTest {

    @Test
    public static void fillInMyPersonalInfo (){
        opencartRegisterAccount.goTo();
        opencartRegisterAccount.writeInTheFirstNameInputField("Maria");
        opencartRegisterAccount.writeInTheLastNameInputField("Kamenova");
        opencartRegisterAccount.writeInTheEmailInputField("maria@bla.bg");
        opencartRegisterAccount.writeInThePhoneNumberInputField("0878867062");
        opencartRegisterAccount.writeInThePassWordInputField("parola123!");
        opencartRegisterAccount.writeInTheConfirmPassWordInputField("parola123!");
        opencartRegisterAccount.checkPrivacyPolicy();
        opencartRegisterAccount.clickNewCustomerContinueButton();


    }
}
