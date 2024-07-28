package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.CommonWaits;
import util.WebElementUtil;

public class LoginPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement loginBtn;

    @FindBy(xpath = "//a[text()= 'Lost your password?']")
    WebElement resetPassword;

    private WebElementUtil webElementUtil;

    public LoginPage() {
        PageFactory.initElements(driver, this);
        webElementUtil = new WebElementUtil();
    }

    public void setLogin(String userName, String password) {
        webElementUtil.sendTextToElement(userNameTextBox, userName);
        webElementUtil.sendTextToElement(passwordTextBox, password);
        CommonWaits.waitUntilElementToBeClickable(loginBtn);


    }
    public void setResetPassword(){
        CommonWaits.waitUntilElementToBeClickable(resetPassword);

    }
}
