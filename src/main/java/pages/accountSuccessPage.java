package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;
import utils.Browser;

public class accountSuccessPage {

    @FindBy(id="content")
    private static WebElement message;

    static{
        PageFactory.initElements(Browser.driver,accountSuccessPage.class);
    }

    public static void goTo(){
        Browser.driver.get("http://shop.pragmatic.bg/index.php?route=account/success");
    }

    public static void verifyCorrectMessage(String expectedSuccessfulAccountRegistrationMessage ){
        Assert.assertEquals(message.getText(),expectedSuccessfulAccountRegistrationMessage);

    }
}
