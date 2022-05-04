package com.parabank.parasoft.pages;

import com.parabank.parasoft.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = (By.xpath("//input[@name='username']"));
    By password = (By.xpath("//input[@name='password']"));
    By loginbutton = (By.xpath("//input[@class='button']"));
    By logoutbutton = (By.xpath("//a[contains(text(),'Log Out')]"));

    public void enterUserName() {
        sendTextToElement(username, "san12345");

    }

    public void enterpassword() {
        sendTextToElement(password, "Prime12345");
    }

    public void clickonloginbutton() {
        clickOnElement(loginbutton);
    }

    public void clicklogoutbutton() {
        clickOnElement(logoutbutton);
    }
}