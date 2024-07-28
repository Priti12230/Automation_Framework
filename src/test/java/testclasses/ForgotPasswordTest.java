package testclasses;

import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class ForgotPasswordTest extends WebTestBase {

    HomePage homePage;

    LoginPage loginPage;

    MyAccountPage myAccountPage;

    ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        forgotPasswordPage = new ForgotPasswordPage();

    }

    @Test(description = "Verify forgot password page")
    public void verifyForgotPasswordPage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closeFirstAd();
        loginPage.setResetPassword();
        forgotPasswordPage.setEmailTextbox(properties.getProperty("Emailid"));
        forgotPasswordPage.setSubmitBtn();
        softAssert.assertTrue(forgotPasswordPage.setSuccessMessage(),"Password reset email has been sent should be displayed");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
