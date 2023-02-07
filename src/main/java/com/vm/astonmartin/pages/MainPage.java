package com.vm.astonmartin.pages;

import com.vm.astonmartin.domain.UserData;
import com.vm.astonmartin.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "//nav[@class='header-desktop_navigation__PdYWM']/div[2]/a/span")
    private WebElement namePreOwnedVehiclesOnMainPage;
    @FindBy(xpath = "//div[@class='cookie_actions__pm7_S']/button")
    private WebElement cookie;
    @FindBy(xpath = "//div[@id='newVehiclesCatalog']/section/div/div[1]/div[3]/div/a[1]/h3")
    private WebElement imagineOfTheFirstCarOnSecondPage;
    @FindBy(xpath = "//div[@class='price-details_button__s_EN4'][1]/button/div[2]/span")
    private WebElement nameCustomizePaymentOnThirdPage;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameOnPageCustomizeYourPayment;
    @FindBy(id = "lastName")
    private WebElement lastNameOnPageCustomizeYourPayment;
    @FindBy(xpath = "//div[@id='__next']/section/div/div/div/form/div[3]/div/div/div/div/*[name()='svg']")
    private WebElement checkBoxPreferredContactOnPageCustomizeYourPayment;
    @FindBy(xpath = "//ul[@class='styles_list__vMf4Z']/li[3]/span")
    private WebElement nameEmailOnPreferredContactOnPageCustomizeYourPayment;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement nameEmailAddressOnPageCustomizeYourPayment;
    @FindBy(id = "zipCode")
    private WebElement nameZipCodeOnPageCustomizeYourPayment;
    @FindBy(xpath = "//button[@class='styles_button__2CcKk finance-calculator_submitButton__kgiYd styles_primary__LOVSi']")
    private WebElement buttonNextOnPageCustomizeYourPayment;

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
        firstNameOnPageCustomizeYourPayment.sendKeys(UserData.FIRST_NAME);
    }

    public void inputLastName(){
        lastNameOnPageCustomizeYourPayment.sendKeys(UserData.LAST_NAME);
    }

    public void clickOnTheFieldPreferredContact(){
        checkBoxPreferredContactOnPageCustomizeYourPayment.click();
    }

    public void chooseNameEmailOnTheFieldPreferredContact(){
        nameEmailOnPreferredContactOnPageCustomizeYourPayment.click();
    }

    public void inputEmailOnTheFieldEmailAddressOnPageCustomizeYourPayment(){
        nameEmailAddressOnPageCustomizeYourPayment.sendKeys(UserData.EMAIL);
    }

    public void inputZipCodeOnPageCustomizeYourPayment(){
        nameZipCodeOnPageCustomizeYourPayment.sendKeys(UserData.ZIP_CODE);
    }

    public void clickButtonNext(){
        buttonNextOnPageCustomizeYourPayment.click();
    }
}

