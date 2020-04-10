package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpenAccountPage extends Utility {
    By customerNameSelect = By.xpath("//select[@id='userSelect']");
    By currencySelector = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[contains(text(),'Process')]");

    public void setCustomerNameSelect() {
        sendTextToElement(customerNameSelect,"Harry Potter");
    }
    public void setCurrencySelector(){
        selectByVisibleTextFromDropDown(currencySelector,"Pound");
    }
    public void setProcess(){
        clickOnElement( process);
    }


}


