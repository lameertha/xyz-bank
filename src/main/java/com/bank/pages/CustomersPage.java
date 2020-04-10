package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By TransactionsFeature= By.xpath("//button[contains(text(),'Transactions')]");
    By DepositFeature=By.xpath("//button[contains(text(),'Deposit')]");
    By WidthdrawlFeature=By.xpath("//button[contains(text(),'Withdrawl')]");
    By logOutBtn=By.xpath("//button[@class='btn logout']");
    public void setTransactionsFeature(){
        clickOnElement(TransactionsFeature);
    }
    public void setDepositFeature(){
        clickOnElement(DepositFeature);
    }
    public void setWidthdrawlFeature(){
        clickOnElement(WidthdrawlFeature);
    }
    public void setLogOutBtn(){
        mouseHoverToElementAndClick(logOutBtn);
    }
}
