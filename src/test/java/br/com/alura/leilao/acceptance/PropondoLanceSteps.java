package br.com.alura.leilao.acceptance;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;

import java.math.BigDecimal;

public class PropondoLanceSteps {

    private Lance lance1;
    private Lance lance2;
    private Leilao leilao;

    @Before
    public void init(){
        leilao = new Leilao("Tablet XXXXXXXX");
    }

    @Given("Dado um lance valido de {double} de {string}")
    public void dandoUmLanceValido(Double valorLance, String nome){
        Usuario usuario = new Usuario(nome);
        lance1 = new Lance(usuario, new BigDecimal(valorLance));
    }

    @When("Quando propoe o lance")
    public void quandoPropoeOLance(){
        leilao = new Leilao("Tablet XXXXXXXx");
        leilao.propoe(lance1);
    }

    @Then("Entao o lance sera aceito")
    public void entaoOLanceSeraAceito(){
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
    }

    @Given("Dado varios lances valido")
    public void dado_varios_lances_valido() {
        Usuario usuario1 = new Usuario("fulano");
        lance1 = new Lance(usuario1, BigDecimal.TEN);
        Usuario usuario2 = new Usuario("fulano");
        lance2 = new Lance(usuario2, BigDecimal.ONE);
    }

    @When("Quando propoe varios lances")
    public void quando_propoe_varios_lances() {
        leilao.propoe(lance1);
        leilao.propoe(lance2);
        System.out.println(leilao.getLances());
    }

    @Then("Entao os lances serao aceitos")
    public void entao_os_lances_serao_aceitos() {
        Assert.assertEquals(2, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
        Assert.assertEquals(BigDecimal.ONE, leilao.getLances().get(1).getValor());
    }


}
