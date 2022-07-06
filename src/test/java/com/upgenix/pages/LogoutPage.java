package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath= "//span[@class='oe_topbar_name']")
    public WebElement userIcon;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement LogoutButton;

    @FindBy(className = "modal-title")
    public WebElement sessionExpiredMessage;
}
