package com.parabank.parasoft.pages;

import com.parabank.parasoft.utility.Utility;
import org.openqa.selenium.By;

public class RegisterTest extends Utility {
    By registerText = (By.xpath("//a[contains(text(),'Register')]"));
    By firstName = (By.xpath("//input[@id='customer.firstName']"));
    By lastName = (By.xpath("//input[@id='customer.lastName']"));
    By address = (By.xpath("//input[@id='customer.address.street']"));
    By city = (By.xpath("//input[@id='customer.address.city']"));
    By state = (By.xpath("//input[@id='customer.address.state']"));
    By zipcode = (By.xpath("//input[@id='customer.address.zipCode']"));
    By phone = (By.xpath("//input[@id='customer.phoneNumber']"));
    By ssn = (By.xpath("//input[@id='customer.ssn']"));
    By usernametext = (By.xpath("//input[@id='customer.username']"));
    By passwordtext  = (By.xpath("//input[@id='customer.password']"));
    By confirmPassword = (By.xpath("//input[@id='repeatedPassword']"));
    By registerBtn = (By.xpath("//input[@value='Register']"));
    By getautotext = (By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));

    public void verifyRegisterText(){
        verifyText("Register", registerText, "Error, Register text not displayed as expected");
    }
    public void inputFirstName(){
        sendTextToElement(firstName,"Sanket123");
    }
    public void inputLastName(){
        sendTextToElement(lastName, "desai12");
    }
    public void inputAddress(){
        sendTextToElement(address,"2,Mayfield");
    }
    public void inputCity(){sendTextToElement(city,"Harrow");}
    public void inputState(){sendTextToElement(state,"Essex");}
    public void inputzipcode(){sendTextToElement(zipcode,"AB1 2CD");}
    public void inputphoneno(){sendTextToElement(phone,"1234567891");}
    public void inputssnno(){sendTextToElement(ssn,"123456789");}
    public void inputusername(){sendTextToElement(usernametext,"san12345");}
    public void inputPassword(){
        sendTextToElement(passwordtext, "prime12345");
    }
    public void inputConfirmPassword(){
        sendTextToElement(confirmPassword, "prime12345");
    }
    public void clickRegisterButton(){
        clickOnElement(registerBtn);
    }
    public void verifyRegistrationCompleteText(){
        verifyText("Your account was created successfully. You are now logged in.",getautotext, "Error, Message not displayed as expected");
    }
    //public void clickOnContinueButton(){
      //  clickOnElement(continueButton);
//    }
}


