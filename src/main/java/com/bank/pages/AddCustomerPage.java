package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstName= By.xpath("//input[@placeholder='First Name']");
    By LastName=By.xpath("//input[@placeholder='Last Name']");
    By PostCode=By.xpath("//input[@placeholder='Post Code']");
    By AddCustomer=By.xpath("//button[@class='btn btn-default']");
    By alertBox=By.xpath("//button[@class='btn btn-default']");
    public void setFirstName(){
        sendTextToElement(firstName,"LAMEERTHA");
    }
    public void setLastName(){
        sendTextToElement(LastName,"THEVARAJAH");
    }
    public void setPostCode(){
        sendTextToElement(PostCode,"ub25lj");
    }
    public void setAddCustomer(){
        clickOnElement(AddCustomer);
    }
    public void setAlertBox(){clickOnElement(alertBox);

    }
}
