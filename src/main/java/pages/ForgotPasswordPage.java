package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.CommonWaits;
import util.WebElementUtil;

public class ForgotPasswordPage extends WebTestBase {


    @FindBy(xpath = "//input[@id='user_login']")
    WebElement emailTextbox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    WebElement submitBtn;

    @FindBy(xpath = "//div[@class='account-message_wrapper']")
    WebElement successMessage;

    public ForgotPasswordPage(){
        PageFactory.initElements(driver,this);

    }
   public void setEmailTextbox(String Emailid){
       WebElementUtil.sendTextToElement(emailTextbox,Emailid);
   }
   public void setSubmitBtn(){
       CommonWaits.waitUntilElementToBeClickable(submitBtn);
   }
   public boolean setSuccessMessage(){
        return WebElementUtil.getElementDisplayed(successMessage);

   }
}
