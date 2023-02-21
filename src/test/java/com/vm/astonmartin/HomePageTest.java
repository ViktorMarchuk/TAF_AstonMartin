package com.vm.astonmartin;

import com.vm.astonmartin.domain.Waiter;
import com.vm.astonmartin.pages.HomePage;
import com.vm.astonmartin.pages.MailPage;
import com.vm.astonmartin.steps.HomeStep;
import com.vm.astonmartin.steps.MailStep;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class HomePageTest extends BaseTest{
    @Test
    public void testPage(){
        HomeStep homeStep = new HomeStep();
        MailStep mailStep = new MailStep();
        MailPage mailPage = new MailPage();
        homeStep.actionOnHomePage();
        mailStep.actionOnMailPage();
        Waiter.waiter(10000);
        homeStep.secondActionOnHomePage();
        //   homeStep.demoMethod();
        // System.out.println(mailPage.getTextFromArray());
        //  homeStep.secondActionOnHomePage();

        // assertEquals(step.CALCULATE_PAYMENT,step.getTextCalculatePayment());

    }

//    @Test
//    public void testFields(){
//        HomeStep step = new HomeStep();
//        HomePage page = new HomePage();
//        step.actionOnPopupCustomizeYourPayment();
//        assertEquals(page.expectedResult(), page.actualResult());
//    }
//
//    @Test
//    public void testFieldGetFirstName(){
//        HomeStep step = new HomeStep();
//        HomePage page = new HomePage();
//        step.actionOnPopupCustomizeYourPayment();
//        Assert.assertEquals(page.getTextFirstName(), page.FIRST_NAME);
//    }
}
