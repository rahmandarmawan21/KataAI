package pageObject;

import static org.junit.Assert.assertEquals;
import config.Base;
import org.openqa.selenium.By;

public class loginPage extends Base {
    By sign_btn         = By.xpath("//a[contains(text(),'Sign in')]");
    By email_create     = By.id("email_create");
    By create_btn        = By.id("SubmitCreate");
    By email_input      = By.id("email");
    By password_input   = By.id("passwd");
    By signin_btn       = By.id("SubmitLogin");
    By myaccount        = By.xpath("//h1[contains(text(),'My account')]");

    public void openUrl(String url) {
        driver.get(url);
    }

    public void clickSignBtn() {
        waitUntilElementIsVisible(sign_btn, 15);
        driver.findElement(sign_btn).click();
    }

    public void validateEmailReg() {
        waitUntilElementIsVisible(email_create, 15);
        assertEquals(true, driver.findElement(email_create).isDisplayed());
    }

    public void inputEmailRegField(String emails) {
        waitUntilElementIsVisible(email_create, 15);
        driver.findElement(email_create).sendKeys(emails);
    }

    public void clickCreateBtn() { driver.findElement(create_btn).click(); }

    //login form
    public void validateEmail() {
        waitUntilElementIsVisible(email_input, 15);
        assertEquals(true, driver.findElement(email_input).isDisplayed());
    }

    public void validatePassword() {
        waitUntilElementIsVisible(password_input, 15);
        assertEquals(true, driver.findElement(password_input).isDisplayed());
    }

    public void inputEmailField(String emails) {
        waitUntilElementIsVisible(email_input, 15);
        driver.findElement(email_input).sendKeys(emails);
    }

    public void inputPasswordField(String pass) {
        waitUntilElementIsVisible(password_input, 15);
        driver.findElement(password_input).sendKeys(pass);
    }

    public void clickSignInBtn() {
        waitUntilElementIsVisible(signin_btn, 15);
        driver.findElement(signin_btn).click();
    }

    public void verifyAccountHasLogin() {
        waitUntilElementIsVisible(myaccount, 15);
        Boolean visible = driver.findElement(myaccount).isDisplayed();
        String text = driver.findElement(myaccount).getText();
        assertEquals(text, "My account");
        assertEquals(visible, true);
    }

}
