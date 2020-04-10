package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CustomerLoginPage extends Utility {

    By yourName = By.xpath("//select[@id='userSelect']");
    By loginBtn = By.xpath("//button[@class='btn btn-default']");

    public void setYourName(){
        selectByVisibleTextFromDropDown(yourName,"Harry Potter");
    }
    public void setLoginBtn(){
        clickOnElement(loginBtn);
    }

}