package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();


    // 1.adminShouldAddUserSuccessFully().
    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        // Verify "System Users" Text
        String expectedSystemUsersText = "System Users";
        String actualSystemUserText = adminPage.verifySystemUserText().substring(0, expectedSystemUsersText.length());
        Assert.assertEquals(actualSystemUserText, expectedSystemUsersText);
        // click On "Add" button
        viewSystemUsersPage.clickOnAddButton();
        // Verify "Add User" Text
        String expectedAddUSerText = "Add User";
        String actualAddUserText = addUserPage.verifyAddUserText().substring(0, expectedAddUSerText.length());
        Assert.assertEquals(actualAddUserText, expectedAddUSerText);
        // Select User Role "Admin"
        addUserPage.mouseHoverAndClickOnUserRoleDropDownInAddUser();
        addUserPage.clickOnAdminOptionInUserRoleDropDownInAddUser();
        // enter Employee Name "Ananya Dash"
        addUserPage.enterEmployeeName("Ananya Dash");
        // enter Username
        addUserPage.sendDataToUserNameFieldInAddUser("ananya123");
        // Select status "Disable"
        addUserPage.clickOnStatusDropDownMenuInAddUser();
        Thread.sleep(2000);
        addUserPage.mouseHoverAndClickOnDisableOptionInAddUser();
        // enter password
        addUserPage.sendDataToPasswordFieldInAddUser("dash567");
        // enter Confirm Password
        addUserPage.sendDataToConfirmPasswordFieldInAddUser("dash567");
        // click On "Save" Button
        addUserPage.clickOnSaveButtonInAddUser();
        // verify message "Successfully Saved"
        Thread.sleep(2000);
        String expectedMessage = "Successfully Saved";
        String actualMessage = addUserPage.getSuccessfullySavedMessageInAddUser().substring(0, expectedMessage.length());
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    // 2. searchTheUserCreatedAndVerifyIt().
    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        // Verify "System Users" Text
        String expectedSystemUsersText = "System Users";
        String actualSystemUserText = adminPage.verifySystemUserText().substring(0, expectedSystemUsersText.length());
        Assert.assertEquals(actualSystemUserText, expectedSystemUsersText);
        // Enter Username
        viewSystemUsersPage.sendDataToUserNameFieldInSystemUsers("Prime123");
        // Select User Role
        viewSystemUsersPage.clickOnUserRoleDropDownInSystemUsers();
        // Select Status
        viewSystemUsersPage.mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
        viewSystemUsersPage.clickOnStatusDropDownInSystemUsers();
        viewSystemUsersPage.mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
        // Click on "Search" Button
        viewSystemUsersPage.clickOnSearButtonInSystemUsers();
        // Verify the User should be in Result list.
        String expectedUserName = "Prime123";
        String actualUserName = viewSystemUsersPage.getDataFromUserNameInRecord();
        Assert.assertEquals(actualUserName, expectedUserName);
    }

    // 3. verifyThatAdminShouldDeleteTheUserSuccessFully.
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        // Verify "System Users" Text
        String expectedSystemUsersText = "System Users";
        String actualSystemUserText = adminPage.verifySystemUserText().substring(0, expectedSystemUsersText.length());
        Assert.assertEquals(actualSystemUserText, expectedSystemUsersText);
        // Enter Username
        viewSystemUsersPage.sendDataToUserNameFieldInSystemUsers("Prime123");
        // Select User Role
        viewSystemUsersPage.clickOnUserRoleDropDownInSystemUsers();
        // Select Status
        viewSystemUsersPage.mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
        viewSystemUsersPage.clickOnStatusDropDownInSystemUsers();
        viewSystemUsersPage.mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
        // Click on "Search" Button
        viewSystemUsersPage.clickOnSearButtonInSystemUsers();
        // Verify the User should be in Result list.
        String expectedUserName = "Prime123";
        String actualUserName = viewSystemUsersPage.getDataFromUserNameInRecord();
        Assert.assertEquals(actualUserName, expectedUserName);
        // Click on Check box
        viewSystemUsersPage.clickOnCheckBoxAgainstFirstUserName();
        // Click on Delete Button
        viewSystemUsersPage.clickOnDeleteSelectedOption();
        // Popup will display
        viewSystemUsersPage.clickOnYesDeleteOption();
        // Click on Ok Button on Popup
        // verify message "Successfully Deleted"
    }

    // 4. searchTheDeletedUserAndVerifyTheMessageNoRecordFound
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // click On "Admin" Tab
        dashboardPage.clickOnAdminTab();
        // Verify "System Users" Text
        String expectedSystemUsersText = "System Users";
        String actualSystemUserText = adminPage.verifySystemUserText().substring(0, expectedSystemUsersText.length());
        Assert.assertEquals(actualSystemUserText, expectedSystemUsersText);
        // Enter Username
        viewSystemUsersPage.sendDataToUserNameFieldInSystemUsers("Prime123");
        // Select User Role
        viewSystemUsersPage.clickOnUserRoleDropDownInSystemUsers();
        // Select Status
        viewSystemUsersPage.mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
        viewSystemUsersPage.clickOnStatusDropDownInSystemUsers();
        viewSystemUsersPage.mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
        // Click on "Search" Button
        viewSystemUsersPage.clickOnSearButtonInSystemUsers();
        // verify message "No Records Found"
    }
}
