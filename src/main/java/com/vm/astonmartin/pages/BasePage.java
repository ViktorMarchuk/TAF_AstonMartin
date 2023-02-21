package com.vm.astonmartin.pages;

import com.vm.astonmartin.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage{
    public WebDriver driver;
    public final String URL_NOME_PAGE = "https://astonmartinsummit.stage.runmylease.com/";
    public final String URL_MAIL_PAGE="https://mail.google.com/mail/u/0/#inbox";

    public BasePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    public void openPage(String url){
        driver = DriverSingleton.getDriver();
        driver.navigate().to(url);
    }
    public void getIframe(int levelIframe){
        driver.switchTo().frame(levelIframe);
    }
    public void leaveIframe(){
        driver.switchTo().defaultContent();
    }
    public void getExplicitlyWaiter(WebElement element, int waitTime){
        WebElement result = new WebDriverWait(driver, Duration.ofSeconds(waitTime))
                .until(ExpectedConditions.visibilityOf(element));
        System.out.println(result);
    }
}
