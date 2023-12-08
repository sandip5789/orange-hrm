package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameLink = By.name("username");
    By passwordLink = By.name("password");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By hrForAllLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
    By loginPanel = By.xpath("//div[@class='orangehrm-login-slot']"); // full panel
   // By loginPanel = By.xpath("//h5[normalize-space()='Login']"); // just for login




    public void enterUserName(String userName){
        sendTextToElement(userNameLink,userName);

    }
    public void enterPassword(String password){
        sendTextToElement(passwordLink,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String verifyLoginPanelText(){
        return getTextFromElement(loginPanel);
    }
    public boolean verifyHRForAllLogo(){
        return driver.findElement(hrForAllLogo).isDisplayed();
    }
}
