package com.vm.astonmartin;

import com.vm.astonmartin.driver.DriverSingleton;
import com.vm.astonmartin.pages.MailPage;
import com.vm.astonmartin.steps.HomeStep;
import com.vm.astonmartin.steps.MailStep;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest{
    @Test
    public void testPage(){
        HomeStep homeStep = new HomeStep();
        MailStep mailStep = new MailStep();
        homeStep.actionOnHomePage();
//         с помощью 3 нижних строк происходит переключение между страницами а homeStep.actionWithSwitchPages(); -это создал
//         отдельный метод для этих действий,он делает тоже самое
//        ArrayList <String> pageList = new ArrayList(DriverSingleton.getDriver().getWindowHandles());
//        DriverSingleton.getDriver().switchTo().window(pageList.get(0));
//        DriverSingleton.getDriver().switchTo().window(pageList.get(1));
        homeStep.actionWithSwitchPages();
        mailStep.actionOpenMail();
    }
}

