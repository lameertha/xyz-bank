package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By welcomeMessage= By.xpath("//span[@class='fontBig ng-binding']");
    By transactions=By.xpath("//button[contains(text(),'Transactions')]");
    By depositLink=By.xpath("//button[contains(text(),'Deposit')]");
    By amountShouldBeDeposit=By.xpath("//input[@placeholder='amount']");
    By depositBtn=By.xpath("//button[@class='btn btn-default']");
    By depositSuccessfulMessage=By.xpath("//span[@class='error ng-binding']");
    By withdrawal=By.xpath("//button[contains(text(),'Withdrawl')]");
    By amountToBeWithdrawn=By.xpath("//input[@placeholder='amount']");
    By withdrawBtn=By.xpath("//button[@class='btn btn-default']");
    By withdrawSuccessfulMessage=By.xpath("//span[@class='error ng-binding']");

    public String setWelcomeMessage(){
       return getTextFromElement(welcomeMessage);

    }
    public void setTransactions(){
        clickOnElement(transactions);
    }
    public void setDeposit(){
        clickOnElement(depositLink);
    }
    public void setAmountShouldBeDeposit(){
        sendTextToElement(amountShouldBeDeposit,"1000");
    }
    public void setDepositBtn(){
        clickOnElement(depositBtn);
    }
    public String setDepositSuccessfulMessage(){
       return   getTextFromElement(depositSuccessfulMessage);
    }
    public void setWithdrawal(){
        clickOnElement(withdrawal);
    }
    public void setAmountToBeWithdrawn(){
        sendTextToElement(amountToBeWithdrawn,"0");
    }
    public void setWithdrawBtn(){
        clickOnElement(withdrawBtn);
    }
    public String setWithdrawSuccessfulMessage(){
      return   getTextFromElement(withdrawSuccessfulMessage);
    }
}
