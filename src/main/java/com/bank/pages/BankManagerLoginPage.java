package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By AddCustomerFeature= By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountFeature=By.xpath("//button[contains(text(),'Open Account')]");
    By customersFeature=By.xpath("//button[contains(text(),'Customers')]");
    public void setAddCustomerFeature(){
        clickOnElement(AddCustomerFeature);
    }
    public void setOpenAccountFeature(){
        clickOnElement(openAccountFeature);
    }
    public void setCustomersFeature(){
        clickOnElement(customersFeature);
    }
}
