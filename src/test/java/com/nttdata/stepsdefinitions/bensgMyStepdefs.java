package com.nttdata.stepsdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class bensgMyStepdefs {
    private WebDriver driver;

    @Given("estoy en la página de la tienda bensg")
    public void estoyEnLaPáginaDeLaTiendaBensg() throws InterruptedException {
        driver = getDriver();
        driver.get(" https://qalab.bensg.com/store");
        Thread.sleep(2000);

        screenShot();
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String arg0, String arg1) {
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
        driver.findElement(By.id("field-email")).sendKeys("qashamira29@gmail.com");
        driver.findElement(By.id("field-password")).sendKeys("1234fgr.qw");
        screenShot();

        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @And("hago clic en el boton de Iniciar sesion")
    public void hagoClicEnElBotonDeIniciarSesion() throws InterruptedException {
        driver.findElement(By.id("submit-login")).click();
        Thread.sleep(5000);
        screenShot();

        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String arg0, String arg1) throws InterruptedException {
        WebElement menuClothes = driver.findElement(By.xpath("//*[@id=\"category-3\"]/a"));
        Thread.sleep(5000);

        screenShot();
// 2. Pasar el cursor (hover) para que se despliegue el submenú
        Actions actions = new Actions(driver);
        actions.moveToElement(menuClothes).perform();

// 3. Esperar a que la opción "Men" sea visible y hacer clic
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement optionMen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Men')]")));
        optionMen.click();


        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }
}
