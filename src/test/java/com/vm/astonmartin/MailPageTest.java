package com.vm.astonmartin;

import com.vm.astonmartin.pages.MailPage;
import com.vm.astonmartin.steps.MailStep;
import org.testng.annotations.Test;

public class MailPageTest{
    MailStep mailStep = new MailStep();

    @Test
    public void testMailPage(){
        MailPage page = new MailPage();
        mailStep.actionMailPage();
        String password = page.getTextFromArray();
        System.out.println(password);
    }
}
