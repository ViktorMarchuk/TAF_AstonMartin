package com.vm.astonmartin.steps;


import com.vm.astonmartin.pages.MailPage;

public class MailStep extends MailPage{

    public void actionMailPage(){
        openPage(URL_MAIL_PAGE);
        clickButtonEnter();
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
    public void actionOpenMail(){
        clickButtonSelectAllLetters();
        clickButtonMarkAsRead();
    }
}
