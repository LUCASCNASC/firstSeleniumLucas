package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {


    CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^eu preencho o formlulário de cadastro$")
    public void eu_preencho_o_formlulário_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Lucas");
        cadastroPage.preencheSobrenome("Camargo");
        cadastroPage.preenchePassword("@fnjf595");
        cadastroPage.selecionaAniversario(30,9, "1998");
        cadastroPage.preencheAddress("Rua teste, 123");
        cadastroPage.preencheCity("Florianópolis");
        cadastroPage.selecionaState("Colorado");
        cadastroPage.preenchePostCode("987788989");
        cadastroPage.preenchePhoneMobile("+55045985548373");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {

    }

    @Então("^vejo a mensagem de cadastro de realizado com sucesso")
    public void vejo_a_mensagem_de_cadastro_de_realizado_com_sucesso() {

    }
}
