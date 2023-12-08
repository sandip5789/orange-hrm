package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By dashboardText = By.xpath("//h6[normalize-space()='Dashboard']");
    By userProfileLogo = By.xpath("//img[@class='oxd-userdropdown-img']");
    By logoutLinkBelowLogo = By.xpath("//a[normalize-space()='Logout']");
    By adminLink = By.xpath("//li[1]//a[1]//span[1]");


    public String getDashBoardText(){
        return getTextFromElement(dashboardText);
    }

    public void clickOnUserProfileLogo(){
        clickOnElement(userProfileLogo);
    }
    public void mouseHoverAndClickOnLogoutButton(){
        mouseHoverToElementAndClick(logoutLinkBelowLogo);

    }
    public void clickOnAdminTab(){
        clickOnElement(adminLink);
    }

}
