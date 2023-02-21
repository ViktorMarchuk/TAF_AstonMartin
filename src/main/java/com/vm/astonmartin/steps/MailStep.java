package com.vm.astonmartin.steps;


import com.vm.astonmartin.pages.MailPage;

public class MailStep extends MailPage{
    public void actionOnMailPage(){
        openPage(URL_MAIL_PAGE);
        getExplicitlyWaiter(getFieldForInputEmail(), 7);
        inputEmail();
        clickButtonNextOnPageWithEmail();
        getExplicitlyWaiter(getFieldForInputPassword(), 7);
        inputPassword();
        clickButtonNextOnPageWithPassword();
        clickButtonPauseMobileNotifications();
        inputToFieldSearchInMail();
        clickFieldSearch();
    }
}
