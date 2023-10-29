package com.bms.step_definitions;

import com.bms.pages.ContactPage;
import com.bms.utilities.ConfigurationReader;
import com.bms.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactStepdefinitions {
    ContactPage contactPage = new ContactPage();
    @Given("user is on the contact page")
    public void user_is_on_the_contact_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("contactPageUrl"));
        contactPage.acceptCookiesButton.click();
    }
    @Given("user enters valid name {string} to name input on the contact page")
    public void user_enters_valid_name_to_name_input_on_the_contact_page(String name) {
        contactPage.nameInput.sendKeys(name);
    }
    @Given("user enters valid email {string} to email input on the contact page")
    public void user_enters_valid_email_to_email_input_on_the_contact_page(String email) {
        contactPage.emailInput.sendKeys(email);
    }
    @Given("user enters invalid phone number {string} to phone number input on the contact page")
    public void user_enters_invalid_phone_number_to_phone_number_input_on_the_contact_page(String phoneNumber) {
        contactPage.telefonInput.sendKeys(phoneNumber);
    }
    @Given("user clicks to send button on the contact page")
    public void user_clicks_to_send_button_on_the_contact_page() {
        contactPage.sendButton.click();
    }
    @Then("user sees Invalid Phone Number message on validation message")
    public void user_sees_invalid_phone_number_message_on_validation_message() {
        String actualMessage = contactPage.telefonInput.getAttribute("validationMessage");
        System.out.println("+++++++++++++++++++++");
        Assert.assertEquals(ConfigurationReader.getProperty("wrongPhoneNumberErrorMessage"),actualMessage);
    }
}
