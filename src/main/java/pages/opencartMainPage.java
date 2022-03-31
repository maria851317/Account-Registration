package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class opencartMainPage {

    @FindBy(className = "hidden-xs")
    private static WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    private static WebElement register;

    static {
        PageFactory.initElements(Browser.driver, opencartMainPage.class);

    }

    /**
     * This method redirects you to the 'opencartMainPage' page.
     */

    public static void goTo(){
        Browser.driver.get("http://shop.pragmatic.bg");
    }

    /**
     * This method clicks the "My Account" button.
     */
    public static void clickmyAccountButton(){
        myAccount.click();
    }

    /**
     * This method clicks the "Register" button.
     */
    public static void clickRegisterButton(){
        register.click();
    }



}