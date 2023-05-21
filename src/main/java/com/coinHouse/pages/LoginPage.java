package com.coinHouse.pages;

import com.coinHouse.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage extends Base {

    public LoginPage(){
        try {
            File file = new File("src/main/java/com/coinHouse/properties/config.properities");
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FindBy(id ="customer_email")
    WebElement emailField;

    @FindBy(id ="customer_password")
    WebElement passwordField;

    @FindBy(id = "email-login")
    WebElement loginButton;

    @FindBy(xpath="//*[@name='q']")
    WebElement searchField;

    @FindBy(xpath="(//*[@value='Recherche Google'  and @name='btnK'])[2]")
    WebElement searchBtn;


    public void connectToTheApp(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void openSite() {
        System.out.println("-----------------Test Start-----------------");
        driver.get("https://www.google.com/");}

    public void iAddTextAnd(String arg0, String arg1)  {
        searchField.sendKeys(arg0);
        searchField.sendKeys(arg1);}

    public void clickSearch() {
        searchBtn.click();
    }




}
