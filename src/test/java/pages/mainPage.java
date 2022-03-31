package pages;

import core.BaseTest;
import org.testng.annotations.Test;

public class mainPage extends BaseTest {

    @Test
    public void goToMyAccount(){
        opencartMainPage.goTo();
        opencartMainPage.clickmyAccountButton();
        opencartMainPage.clickRegisterButton();

    }
}
