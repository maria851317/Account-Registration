package pages;

import core.BaseTest;
import org.testng.annotations.Test;

public class SuccessPage extends BaseTest {
    @Test
    public void registerSuccessfully(){
        accountSuccessPage.goTo();
        accountSuccessPage.verifyCorrectMessage("Your Account Has Been Created!");

    }
}
