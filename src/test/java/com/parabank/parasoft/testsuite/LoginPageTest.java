package com.parabank.parasoft.testsuite;

import com.parabank.parasoft.pages.ErrorMessagePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.RegisterTest;
import com.parabank.parasoft.pages.SignUpEasyPage;
import com.parabank.parasoft.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
           LoginPage loginPage = new LoginPage();
           RegisterTest registerTest = new RegisterTest();
           SignUpEasyPage signUpEasyPage = new SignUpEasyPage();
           ErrorMessagePage errorMessagePage = new ErrorMessagePage();
@Test
public void userShouldLoginSuccessfullyWithValidCredentials(){
    loginPage.enterUserName();
    loginPage.enterpassword();
    loginPage.clickonloginbutton();
    String expectedMessage = "Accounts Overview";
    String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Accounts Overview')]"));
    Assert.assertEquals("Accounts Overview is not displayed", expectedMessage, actualMessage);
}
@Test
    public void verifyTheErrorMessage(){
    errorMessagePage.enterUserName();
    errorMessagePage.enterpassword();
    errorMessagePage.clickonloginbutton();
    String expectedMessage = "The username and password could not be verified.";
    String actualMessage = getTextFromElement(By.xpath("//p[contains(text(),'The username and password could not be verified.')]"));
    Assert.assertEquals("Accounts Overview is displayed", expectedMessage, actualMessage);
}
@Test
    public void userShouldLogOutSuccessfully(){
    loginPage.enterUserName();
    loginPage.enterpassword();
    loginPage.clickonloginbutton();
    loginPage.clicklogoutbutton();
    String expectedMessage = "Customer Login";
    String actualMessage2 = getTextFromElement(By.cssSelector("div[id='leftPanel'] h2"));
    Assert.assertEquals("Customer Login is not displayed", expectedMessage, actualMessage2);
}
@Test
    public void verifyThatSigningUpPageDisplay(){
    signUpEasyPage.verifyThatSigningUpPage();
    String expectedMessage = "Signing up is easy!";
    String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
    Assert.assertEquals("Not navigate to Register page", expectedMessage, actualMessage);
}
@Test
    public void userShouldRegisterAccountSuccessfully(){
   registerTest.verifyRegisterText();
   registerTest.inputFirstName();
   registerTest.inputLastName();
   registerTest.inputAddress();
   registerTest.inputCity();
   registerTest.inputState();
   registerTest.inputzipcode();
   registerTest.inputphoneno();
   registerTest.inputssnno();
   registerTest.inputusername();
   registerTest.inputPassword();
   registerTest.inputConfirmPassword();
   registerTest.clickRegisterButton();
   registerTest.verifyRegistrationCompleteText();
    String expectedMessage = "Your account was created successfully. You are now logged in.";
    String actualMessage = getTextFromElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));
    Assert.assertEquals("Registration page is not displayed", expectedMessage, actualMessage);
}
}



