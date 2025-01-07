package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("http://qazando.com.br/curso.html");
        Assert.assertEquals( "", true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavaScriptExecutor jse (JavascriptExecutor) driver;
        jse.executeScript ( s: "window.scrollTo(0, 10000)");
        Thread.sleep( millis: 20000);
    }

    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("camargolucasnasc@gmail.com");
    }

    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }

    public void verificarCuponDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals( "QAZANDO15OFF", texto_cupom);
    }
}
