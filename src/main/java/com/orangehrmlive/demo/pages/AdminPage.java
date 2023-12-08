package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By systemUserText = By.xpath("//h5[normalize-space()='System Users']");


    public String verifySystemUserText(){
        return getTextFromElement(systemUserText);
    }
}
