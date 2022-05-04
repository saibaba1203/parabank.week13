package com.parabank.parasoft.pages;

import com.parabank.parasoft.utility.Utility;
import org.openqa.selenium.By;

public class SignUpEasyPage extends Utility {
 By clickRegisterButton = (By.xpath("//a[contains(text(),'Register')]"));

 public void verifyThatSigningUpPage(){

         clickOnElement(clickRegisterButton);
     }
 }

