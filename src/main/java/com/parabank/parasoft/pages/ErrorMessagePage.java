package com.parabank.parasoft.pages;

import com.parabank.parasoft.utility.Utility;
import org.openqa.selenium.By;

public class ErrorMessagePage extends Utility {
    By username = (By.xpath("//input[@name='username']"));
    By password = (By.xpath("//input[@name='password']"));
    By loginbutton = (By.xpath("//input[@class='button']"));

    public void enterUserName(){
        sendTextToElement(username,"san123");

    }
    public void enterpassword(){
        sendTextToElement(password,"Prime12");
    }
    public void clickonloginbutton(){
        clickOnElement(loginbutton);
    }
}

