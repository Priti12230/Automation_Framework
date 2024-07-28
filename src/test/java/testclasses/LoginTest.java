package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {

    HomePage homePage ;

    LoginPage loginPage ;

    MyAccountPage myAccountPage ;

    public LoginTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test(description = "verify log out button is displayed on My account page")
    public void verifyLogOutBtnDisplayed() {
        SoftAssert softAssert = new SoftAssert();

        homePage.closeFirstAd();
        loginPage.setLogin(properties.getProperty("username"), properties.getProperty("password") );
        softAssert.assertTrue(myAccountPage.logOutBtnDisplayed(),"logout btn should be displayed");

        softAssert.assertAll();



    }
    @AfterMethod
    public void  afterMethod(){
        driver.close();
    }
}
