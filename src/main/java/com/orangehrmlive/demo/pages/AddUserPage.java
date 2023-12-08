package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By userRoleDropDown = By.xpath("(//div[@class = 'oxd-select-wrapper'])[1]");
    By adminOptionInUserRole = By.xpath("//span[contains(text(),'Admin')]");
    By employeeNameType = By.xpath("//input[@placeholder='Type for hints...']");
    By userNameFieldInAddUser = By.xpath("//div[@class = 'oxd-form-row']//input[@class = 'oxd-input oxd-input--active']");
    By statusDropDown = By.xpath("//div[contains(text(),'-- Select --')]");
    By disabledStatusOptionInAddUser = By.xpath("//span[normalize-space()='Disabled']");
    By passwordFieldInAddUser = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By confirmPasswordFieldInAddUser = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By saveButtonInAddUser = By.xpath("//button[normalize-space()='Save']");
    By successfullySavedMessageInAddUser = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");



    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }
    public void mouseHoverAndClickOnUserRoleDropDownInAddUser(){
        mouseHoverToElementAndClick(userRoleDropDown);
    }
    public void clickOnAdminOptionInUserRoleDropDownInAddUser() {
        clickOnElement(adminOptionInUserRole);
    }
    public void enterEmployeeName(String empName){
        sendTextToElement(employeeNameType, empName);
    }
    public void sendDataToUserNameFieldInAddUser(String uName) {
        sendTextToElement(userNameFieldInAddUser, uName);
    }
    public void clickOnStatusDropDownMenuInAddUser() {
        clickOnElement(statusDropDown);
    }
    public void mouseHoverAndClickOnDisableOptionInAddUser() {
        mouseHoverToElementAndClick(disabledStatusOptionInAddUser);
    }
    public void sendDataToPasswordFieldInAddUser(String password) {
        sendTextToElement(passwordFieldInAddUser, password);
    }

    public void sendDataToConfirmPasswordFieldInAddUser(String cPassword) {
        sendTextToElement(confirmPasswordFieldInAddUser, cPassword);
    }
    public void clickOnSaveButtonInAddUser() {
        clickOnElement(saveButtonInAddUser);
    }
    public String getSuccessfullySavedMessageInAddUser() {
        return getTextFromElement(successfullySavedMessageInAddUser);
    }

}
