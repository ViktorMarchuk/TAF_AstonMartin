package com.vm.astonmartin;

import com.vm.astonmartin.pages.MailPage;
import com.vm.astonmartin.steps.MailStep;
import org.testng.annotations.Test;

public class MailPageTest{
    @Test
    public void testMailPage(){
        MailStep step=new MailStep();
        MailPage page=new MailPage();
        step.actionOnMailPage();
        System.out.println( page.getTextFromArray());

    }
}
