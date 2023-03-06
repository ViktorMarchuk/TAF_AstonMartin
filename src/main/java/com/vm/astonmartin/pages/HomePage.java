package com.vm.astonmartin.pages;

import com.vm.astonmartin.domain.UserData;
import com.vm.astonmartin.steps.MailStep;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends BasePage{
    MailPage mailPage = new MailPage();
    public final String CALCULATE_PAYMENT = "CALCUlATE PAYMENT";
    public final String FIRST_NAME = "First Name *";
    public final String LAST_NAME = "Last Name *";
    public final String PREFERRED_CONTACT = "Preferred Contact *";
    public final String PHONE = "Phone *";
    public final String EMAIL_ADDRESS = "Email Address";
    public final String ZIP_CODE = "Zip Code *";
    @FindBy(xpath = "//nav[@class='header-desktop_navigation__PdYWM']/div[2]/a/span")
    private WebElement namePreOwnedVehiclesOnMainPage;
    @FindBy(xpath = "//div[@class='cookie_actions__pm7_S']/button")
    private WebElement cookie;
    @FindBy(xpath = "//div[@id='newVehiclesCatalog']/section/div/div[1]/div[3]/div/a[1]/h3")
    private WebElement imagineOfTheFirstCarOnSecondPage;
    @FindBy(xpath = "//div[@class='price-details_button__s_EN4'][1]/button/div[2]/span")
    private WebElement nameCustomizePaymentOnThirdPage;
    @FindBy(xpath = " //label[@for='firstName']")
    private WebElement nameFirstNameOnPageCustomizeYourPayment;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement fieldFirstNameOnPageCustomizeYourPayment;
    @FindBy(xpath = "//label[@for='lastName']")
    private WebElement nameLastNameOnPageCustomizeYourPayment;
    @FindBy(id = "lastName")
    private WebElement fieldLastNameOnPageCustomizeYourPayment;
    @FindBy(xpath = "//label[@for='contactType']")
    private WebElement namePreferredContactOnPageCustomizeYourPayment;
    @FindBy(xpath = "//div[@id='__next']/section/div/div/div/form/div[3]/div/div/div/div/*[name()='svg']")
    private WebElement checkBoxPreferredContactOnPageCustomizeYourPayment;
    @FindBy(xpath = "//div[@id='__next']/section/div/div/div/form/div[3]/div/div/div/ul/li[3]")
    private WebElement nameEmailOnPreferredContactOnPageCustomizeYourPayment;
    @FindBy(xpath = "//label[@for='phone']")
    private WebElement namePhoneOnPageCustomizeYourPayment;
    @FindBy(xpath = "//label[@for='email']")
    private WebElement nameEmailAddressOnPageCustomizeYourPayment;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement fieldEmailAddressOnPageCustomizeYourPayment;
    @FindBy(xpath = "//label[@for='zipCode']")
    private WebElement nameZipCodeOnPageCustomizeYourPayment;
    @FindBy(id = "zipCode")
    private WebElement fieldZipCodeOnPageCustomizeYourPayment;
    @FindBy(xpath = "//button[@class='styles_button__2CcKk finance-calculator_submitButton__kgiYd styles_primary__LOVSi']")
    private WebElement buttonNextOnPageCustomizeYourPayment;
    @FindBy(xpath = "//h4[@class='personal-code_title__Caf1I']")
    private WebElement namePersonalUnlockCodeSent;
    @FindBy(xpath = "//label[@class='styles_label__bJz3l']")
    private WebElement nameCode;
    @FindBy(xpath = "//div[@id='__next']/section/div/section[2]/button/span")
    private WebElement nameCalculatePayment;
    @FindBy(xpath = "//*[@id=\"__next\"]/section/div/section[2]/div/div/input")
    private WebElement fieldCodeOnPopupPersonalUnlockCodeSent;
    @FindBy(xpath = "//button[@name=\"submitPersonalCode\"]")
    private WebElement buttonCalculatePaymentPopUpPersonalUnlockCodeSent;

    public void clickPreOwnedVehicles(){
        namePreOwnedVehiclesOnMainPage.click();
    }

    public void clickCookie(){
        cookie.click();
    }

    public void clickImagineOfTheFirstCarOnSecondPage(){
        imagineOfTheFirstCarOnSecondPage.click();
    }

    public void clickNameCustomizePaymentOnThirdPage(){
        nameCustomizePaymentOnThirdPage.click();
    }

    public void inputFirstName(){
        fieldFirstNameOnPageCustomizeYourPayment.sendKeys(UserData.FIRST_NAME);
    }

    public void inputLastName(){
        fieldLastNameOnPageCustomizeYourPayment.sendKeys(UserData.LAST_NAME);
    }

    public void clickOnTheFieldPreferredContact(){
        checkBoxPreferredContactOnPageCustomizeYourPayment.click();
    }

    public void chooseNameEmailOnTheFieldPreferredContact(){
        nameEmailOnPreferredContactOnPageCustomizeYourPayment.click();
    }

    public void inputEmailOnTheFieldEmailAddressOnPageCustomizeYourPayment(){
        fieldEmailAddressOnPageCustomizeYourPayment.sendKeys(UserData.EMAIL);
    }

    public void inputZipCodeOnPageCustomizeYourPayment(){
        fieldZipCodeOnPageCustomizeYourPayment.sendKeys(UserData.ZIP_CODE);
    }

    public void clickButtonNext(){
        buttonNextOnPageCustomizeYourPayment.click();
    }

    public String getTextCalculatePayment(){
        return nameCalculatePayment.getText();
    }

    public String getTextFirstName(){
        return nameFirstNameOnPageCustomizeYourPayment.getText();
    }

    public String getTextLastName(){
        return nameLastNameOnPageCustomizeYourPayment.getText();
    }

    public String getTextPreferredContact(){
        return namePreferredContactOnPageCustomizeYourPayment.getText();
    }

    public String getTextPhone(){
        return namePhoneOnPageCustomizeYourPayment.getText();
    }

    public String getTextEmailAddress(){
        return nameEmailAddressOnPageCustomizeYourPayment.getText();
    }

    public String getTextZipCode(){
        return nameZipCodeOnPageCustomizeYourPayment.getText();
    }

    public void inputTextToFieldCodeOnPopupPersonalUnlockCodeSent(String s){
        fieldCodeOnPopupPersonalUnlockCodeSent.sendKeys(s);
    }

    public void clickButtonCalculatePaymentPopUpPersonalUnlockCodeSent(){
        buttonCalculatePaymentPopUpPersonalUnlockCodeSent.click();
    }

    public ArrayList <String> actualResult(){
        ArrayList <String> actualResultList = new ArrayList <>();
        actualResultList.add(getTextFirstName());
        actualResultList.add(getTextLastName());
        actualResultList.add(getTextPreferredContact());
        actualResultList.add(getTextPhone());
        actualResultList.add(getTextEmailAddress());
        actualResultList.add(getTextZipCode());
        return actualResultList;
    }

    public ArrayList <String> expectedResult(){
        ArrayList <String> expectedResultList = new ArrayList <>();
        expectedResultList.add(FIRST_NAME);
        expectedResultList.add(LAST_NAME);
        expectedResultList.add(PREFERRED_CONTACT);
        expectedResultList.add(PHONE);
        expectedResultList.add(EMAIL_ADDRESS);
        expectedResultList.add(ZIP_CODE);
        return expectedResultList;
    }
}


