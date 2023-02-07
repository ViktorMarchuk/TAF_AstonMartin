package com.vm.astonmartin.steps;

import com.vm.astonmartin.pages.MainPage;

public class MainStep extends MainPage{

    public void actionOnPage(){
        openPage(URL);
        clickCookie();
        clickPreOwnedVehicles();
        clickImagineOfTheFirstCarOnSecondPage();
        clickNameCustomizePaymentOnThirdPage();
        getIframe();
        inputFirstName();
        inputLastName();
        clickOnTheFieldPreferredContact();
        chooseNameEmailOnTheFieldPreferredContact();
        inputEmailOnTheFieldEmailAddressOnPageCustomizeYourPayment();
        inputZipCodeOnPageCustomizeYourPayment();
        clickButtonNext();
        leaveIframe();
    }
}
