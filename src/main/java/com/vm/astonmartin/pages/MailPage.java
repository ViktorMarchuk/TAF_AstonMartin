package com.vm.astonmartin.pages;

import com.vm.astonmartin.domain.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MailPage extends BasePage{
    @FindBy(xpath = "//html/body/header/div/div/div/a[2]")
    private WebElement buttonEnter;
    @FindBy(xpath = "//input[@type=\"email\"]")
    private WebElement fieldForInputEmail;
    @FindBy(xpath = "//div[@id='identifierNext']/div/button/span")
    private WebElement buttonNextOnPageWithEmail;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement fieldForInputPassword;
    @FindBy(xpath = "//div[@id='passwordNext']/div/button/span")
    private WebElement buttonNextOnPageWithPassword;
    @FindBy(xpath = "//span[@id=\":23\"]/span")
    private WebElement nameNoReplay;
    @FindBy(xpath = "//button[@jslog=\"122573; u014N:cOuCgd,xr6bB\"]")
    private WebElement buttonPauseMobileNotifications;
    @FindBy(xpath = "//input[@class=\"gb_jf aJh\"][1]")
    private WebElement fieldSearchInMail;
    @FindBy(xpath = "//form[@id=\"aso_search_form_anchor\"]/button[4]")
    private WebElement fieldSearch;
    @FindBy(xpath = "//div[@id=\":r1\"]/div[1]/p")
    private WebElement nameVerificationCode;
    @FindBy(xpath = "//span[@id=\":mg\"]/span")
    private WebElement fieldInBox;
    @FindBy(xpath = "//tr[@id=\":tq\"]/td[4]")
    private WebElement lastLetterField;
    @FindBy(xpath = "//div[@id=\":4\"]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/span")
    private WebElement fieldOpenLetter;
    @FindBy(xpath = "//div[@id=\":4\"]/div[2]/div[2]/div[1]/div/div/div[3]/div[1]")
    private WebElement buttonCloseLetter;

    public void clickButtonEnter(){
        buttonEnter.click();
    }

    public WebElement getFieldForInputEmail(){
        return fieldForInputEmail;
    }

    public WebElement getFieldForInputPassword(){
        return fieldForInputPassword;
    }

    public WebElement getNameVerificationCode(){
        return nameVerificationCode;
    }

    public void inputEmail(){
        fieldForInputEmail.sendKeys(UserData.EMAIL);
    }

    public void clickButtonNextOnPageWithEmail(){
        buttonNextOnPageWithEmail.click();
    }

    public void inputPassword(){
        fieldForInputPassword.sendKeys(UserData.PASSWORD);
    }

    public void clickButtonNextOnPageWithPassword(){
        buttonNextOnPageWithPassword.click();
    }

    public void clickNameNoReplay(){
        nameNoReplay.click();
    }

    public void clickButtonPauseMobileNotifications(){
        buttonPauseMobileNotifications.click();
    }

    public void inputToFieldSearchInMail(){
        fieldSearchInMail.sendKeys(UserData.EMAIL_NO_REPLY);
    }

    public void clickFieldSearch(){
        fieldSearch.click();
    }

    public String getTextVerificationCode(){
        return nameVerificationCode.getText();
    }

    public void clickFieldInBox(){
        fieldInBox.click();
    }

    public void clickLastLetterField(){
        lastLetterField.click();
    }

    public void clickButtonSelectAllLetters(){
        fieldOpenLetter.click();
    }
    public void clickButtonMarkAsRead(){
        buttonCloseLetter.click();
    }

    public String getTextFromArray(){
        String result = "";
        List <WebElement> elements = driver.findElements(By.xpath("//span[contains(text(),'Verification code:')]"));
        for(int i = 0; i < elements.size(); i++){
            result = elements.get(0).getText().replaceAll("\\D+", "");
        }
        return result;
    }

    public void getElements(){
        List <WebElement> elements = driver.findElements(By.xpath("//span[contains(text(),'Verification code:')]"));
        for(WebElement element: elements){
            System.out.println(element.getText().replaceAll("\\D+", ""));
        }
    }
}
