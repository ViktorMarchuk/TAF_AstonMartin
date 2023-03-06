package com.vm.astonmartin.steps;

import com.vm.astonmartin.pages.HomePage;
import com.vm.astonmartin.pages.MailPage;

public class HomeStep extends HomePage{
    MailStep mailStep = new MailStep();
    MailPage mailPage = new MailPage();

    public void actionOnHomePage(){
        openPage(URL_NOME_PAGE);
        clickCookie();
        clickPreOwnedVehicles();
        clickImagineOfTheFirstCarOnSecondPage();
        clickNameCustomizePaymentOnThirdPage();
        getIframe(0);
        inputFirstName();
        inputLastName();
        clickOnTheFieldPreferredContact();
        chooseNameEmailOnTheFieldPreferredContact();
        inputEmailOnTheFieldEmailAddressOnPageCustomizeYourPayment();
        inputZipCodeOnPageCustomizeYourPayment();
        clickButtonNext();
        getPage(URL_MAIL_PAGE);
        mailStep.actionMailPage();
        String password = mailPage.getTextFromArray();
        switchPage(0);
        getIframe(0);
        inputTextToFieldCodeOnPopupPersonalUnlockCodeSent(password);
        clickButtonCalculatePaymentPopUpPersonalUnlockCodeSent();
        leaveIframe();
    }
    public void actionWithSwitchPages(){
        switchPage(0);
        switchPage(1);
    }
}
