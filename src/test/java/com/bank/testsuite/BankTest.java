package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage=new HomePage();
    CustomersPage customersPage=new CustomersPage();
    CustomerLoginPage customerLoginPage=new CustomerLoginPage();
    BankManagerLoginPage bankManagerLoginPage=new BankManagerLoginPage();
    AddCustomerPage addCustomerPage=new AddCustomerPage();
    AccountPage accountPage=new AccountPage();
    OpenAccountPage openAccountPage=new OpenAccountPage();
    BankTestPage bankTestPage=new BankTestPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.setAddCustomerFeature();
        addCustomerPage.setFirstName();
        addCustomerPage.setLastName();
        addCustomerPage.setPostCode();
        addCustomerPage.setAddCustomer();
        Alert alert=driver.switchTo().alert();
        alert.accept();


    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.setOpenAccountFeature();
        openAccountPage.setCustomerNameSelect();
        openAccountPage.setCurrencySelector();
        openAccountPage.setProcess();
        Alert alert=driver.switchTo().alert();
        alert.accept();



    }
    @Test
    public void customerShouldLoginAndLogoutSucessfully() {
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.setYourName();
        customerLoginPage.setLoginBtn();

        String expectedResult = "Harry Potter";
        String actualResult = accountPage.setWelcomeMessage();
        Assert.assertEquals(expectedResult, actualResult);
        customersPage.setLogOutBtn();
    }
    @Test

    public void customerShouldDepositMoneySucessfully(){
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.setYourName();
        customerLoginPage.setLoginBtn();
        accountPage.setDeposit();
        accountPage.setAmountShouldBeDeposit();
        accountPage.setDepositBtn();
        String expectedResult = "Deposit Successful";
        String actualResult = accountPage.setDepositSuccessfulMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void customerShouldWidrawMoneySucessfully(){
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.setYourName();
        customerLoginPage.setLoginBtn();
        accountPage.setWithdrawal();
        accountPage.setAmountToBeWithdrawn();
        accountPage.setWithdrawBtn();
       // String expectedResult = "Transaction successful";
       // String actualResult = accountPage.getTextFromElement(By.linkText("Transaction successful"));
       // Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void bankManagerShouldDeleteCustomerSuccessFully(){
        homePage.clickOnBankManagerLoginBtn();
        bankTestPage.setCustomerFeature();
        bankTestPage.setSearchCustomer();
        bankTestPage.setDeleteBtn();

    }
}
