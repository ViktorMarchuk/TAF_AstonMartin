package com.vm.astonmartin;

import com.vm.astonmartin.steps.MainStep;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{
    @Test
    public void testPage(){
        MainStep step = new MainStep();
        step.actionOnPage();
    }
}
