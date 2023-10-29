package com.bms.pages;

import com.bms.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "Name")
    public WebElement nameInput;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Telefon")
    public WebElement telefonInput;

    @FindBy(xpath = "//*[@id=\"senden\"]/button")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"BorlabsCookieBox\"]/div/div/div/div[1]/div/div[3]/div[3]/p/a")
    public WebElement acceptCookiesButton;
}
