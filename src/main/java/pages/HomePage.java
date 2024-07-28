package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.CommonWaits;

import javax.swing.*;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//button[@title='Close']")
    WebElement closePopUp;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement userLogo;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeFirstAd;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void closeFirstAd() {
        CommonWaits.waitUntilElementToBeClickable(closePopUp);
        CommonWaits.waitUntilElementToBeClickable(closeFirstAd);
        CommonWaits.waitUntilElementToBeClickable(userLogo);


    }
}
