package com.vm.astonmartin;

import com.vm.astonmartin.steps.MainStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{
    @Test
    public void testPage(){
        MainStep step = new MainStep();
        step.actionOnPage();
        Assert.assertEquals(step.CALCULATE_PAYMENT,step.getTextCalculatePayment());
    }
}
