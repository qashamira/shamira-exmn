package com.nttdata.steps;

import com.nttdata.page.BensgLoginPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.esperaImplicita;
import static com.nttdata.core.DriverManager.*;

public class bensLoginSteps {

    private WebDriver driver;

    //constructor
    public bensLoginSteps(WebDriver driver){
        this.driver = driver;
    }
    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        //Espera implicita
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        //Espera explicita
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));
    }
    public void inicibotton(){
        this.driver.findElement(BensgLoginPage.botonIniciarSesión).click();
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }


    public void ingresoUsuarioYClave(String user, String password) {
        typeUser(user);
        typePassword(password);
        esperaImplicita();
        login();
        inicibotton();
    }
}
