package com.vm.astonmartin.steps;

import com.vm.astonmartin.domain.Waiter;
import com.vm.astonmartin.pages.HomePage;
import com.vm.astonmartin.pages.MailPage;

public class HomeStep extends HomePage{
    MailPage mailPage = new MailPage();

    public void actionOnHomePage(){

        //   MailStep mailStep=new MailStep();
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
        //    mailStep.actionOnMailPage();
        //  inputTextToFieldCodeOnPopupPersonalUnlockCodeSent();
//        leaveIframe();
//        getIframe(0);
//        inputTextToFieldCodeOnPopupPersonalUnlockCodeSent();
    }

    public void actionOnPopupCustomizeYourPayment(){
        openPage(URL_NOME_PAGE);
        clickCookie();
        clickPreOwnedVehicles();
        clickImagineOfTheFirstCarOnSecondPage();
        clickNameCustomizePaymentOnThirdPage();
        getIframe(0);
    }

    public void secondActionOnHomePage(){
        MailStep mailStep = new MailStep();
        openPage(URL_NOME_PAGE);
        //  clickCookie();
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
        //  mailStep.actionOnMailPage();
        //  getIframe(0);
        inputTextToFieldCodeOnPopupPersonalUnlockCodeSent("3746");
//        leaveIframe();
//        getIframe(0);
//        inputTextToFieldCodeOnPopupPersonalUnlockCodeSent();
    }

    public void demoMethod(){
        MailStep mailStep = new MailStep();
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
        mailStep.actionOnMailPage();
        driver.getWindowHandle();
        openPage(URL_NOME_PAGE);
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
        Waiter.waiter(10000);
        inputTextToFieldCodeOnPopupPersonalUnlockCodeSent(mailPage.getTextFromArray());
    }
}
