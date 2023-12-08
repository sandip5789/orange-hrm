package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {

    By addButton = By.xpath("//button[normalize-space()='Add']");
    By userNameFieldInSystemUsers = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRoleDropDownInSystemUsers = By.xpath("(//div[contains(text(),'-- Select --')])[1]");
    By adminOptionInUserRoleDropDownInSystemUsers = By.xpath("//span[contains(text(),'Admin')]");
    By statusDropDownInSystemUsers = By.xpath("(//i)[13]");
    By disableStatusOptionInSystemUsers = By.xpath("//span[normalize-space()='Disabled']");
    By searButtonInSystemUsers = By.xpath("//button[normalize-space()='Search']");
    By userNameInRecord = By.xpath("(//div[@data-v-6c07a142])[1]");
    By checkBoxAgainstFirstUserName = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButtonAgainstFirstUSerName = By.xpath("//button[normalize-space()='Delete Selected']");
    By yesDeleteOption = By.xpath("//button[normalize-space()='Yes, Delete']");




    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    public void sendDataToUserNameFieldInSystemUsers(String uname) {
        sendTextToElement(userNameFieldInSystemUsers, uname);
    }

    public void clickOnUserRoleDropDownInSystemUsers() {
        clickOnElement(userRoleDropDownInSystemUsers);
    }

    public void mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers() {
        mouseHoverToElementAndClick(adminOptionInUserRoleDropDownInSystemUsers);
    }

    public void clickOnStatusDropDownInSystemUsers() {
        clickOnElement(statusDropDownInSystemUsers);
    }

    public void mouseHoverAndCLickOndDisableStatusOptionInSystemUsers() {
        mouseHoverToElementAndClick(disableStatusOptionInSystemUsers);
    }

    public void clickOnSearButtonInSystemUsers() {
        clickOnElement(searButtonInSystemUsers);
    }
    public String getDataFromUserNameInRecord() {
        return getTextFromElement(userNameInRecord);
    }
    public void clickOnCheckBoxAgainstFirstUserName() {
        clickOnElement(checkBoxAgainstFirstUserName);
    }

    public void clickOnDeleteSelectedOption() {
        clickOnElement(deleteButtonAgainstFirstUSerName);
    }

    public void clickOnYesDeleteOption() {
        clickOnElement(yesDeleteOption);
    }

}
