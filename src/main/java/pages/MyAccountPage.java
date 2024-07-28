package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class MyAccountPage extends WebTestBase {

@FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;

@FindBy(xpath = "//a[text()= 'Logout']")
WebElement logOutBtn;



public  MyAccountPage(){
    PageFactory.initElements(driver,this);
}

public  String  getTextOfMyAccount(){
   return WebElementUtil.getTextOfElement(myAccountText);


}
public  boolean logOutBtnDisplayed(){
   return WebElementUtil.getElementDisplayed(logOutBtn);

}
}
