package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    @Dado("^que estou no site da qazando$")
    public void acessar_site_qazando() {
        driver.get("http://qazando.com.br/curso.html");
        Assert.assertEquals( "", true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() {

        JavaScriptExecutor jse (JavascriptExecutor) driver;
        jse.executeScript ( s: "window.scrollTo(0, 10000)");
        Thread.sleep( millis: 20000);

        driver.findElement(By.id("email")).sendKeys("camargolucasnasc@gmail.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        driver.findElement(By.id("button")).click();
    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals( "QAZANDO15OFF", texto_cupom);
    }
}
