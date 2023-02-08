package com.vm.astonmartin.pages;

import com.vm.astonmartin.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage{
    public WebDriver driver;
    public final String URL = "https://astonmartinsummit.stage.runmylease.com/";

    public BasePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    public void openPage(String url){
        driver = DriverSingleton.getDriver();
        driver.navigate().to(URL);
    }
    public void getIframe(int levelIframe){
        driver.switchTo().frame(levelIframe);
    }
    public void leaveIframe(){
        driver.switchTo().defaultContent();
    }
}
