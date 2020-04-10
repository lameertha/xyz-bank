package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By customerLoginBtn= By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLoginBtn=By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnCustomerLoginBtn(){
        clickOnElement(customerLoginBtn);
    }
    public void clickOnBankManagerLoginBtn(){
        clickOnElement(bankManagerLoginBtn);
    }
}
