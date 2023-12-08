package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    AddUserPage addUserPage = new AddUserPage();
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();



    // 1. verifyUserShouldLoginSuccessFully()
    @Test
    public void verifyUserShouldLoginSuccessFully(){
        //  Enter username
        loginPage.enterUserName("Admin");
        //  Enter password
        loginPage.enterPassword("admin123");
        //  Click on Login Button
        loginPage.clickOnLoginButton();
        //  Verify "Dashboard" Message
        String expectedText = "Dashboard";
        String actualText = dashboardPage.getDashBoardText();
        Assert.assertEquals(actualText,expectedText,"Dashboard not displayed");
    }

    // 2. VerifyThatTheLogoDisplayOnLoginPage()
    @Test
    public void verifyThatTheLogoDisplayOnLoginPage(){
        // Verify Logo is Displayed
        Assert.assertTrue(loginPage.verifyHRForAllLogo(),"Logo is not displayed");
    }

    // 3. VerifyUserShouldLogOutSuccessFully()
    @Test
    public void verifyUserShouldLogOutSuccessFully() throws InterruptedException {
        // Login To The application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // Click on User Profile logo
        dashboardPage.clickOnUserProfileLogo();
        // Mouse hover on "Logout" and click
        Thread.sleep(2000);
        dashboardPage.mouseHoverAndClickOnLogoutButton();
        // Verify the text "Login Panel" is displayed
        loginPage.verifyLoginPanelText();

    }

}
