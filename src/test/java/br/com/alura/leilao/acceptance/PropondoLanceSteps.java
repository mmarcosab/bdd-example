package br.com.alura.leilao.acceptance;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.math.BigDecimal;

public class PropondoLanceSteps {

    private Lance lance;
    private Leilao leilao;

    @Given("Dado um lance valido")
    public void dandoUmLanceValido(){
        Usuario usuario = new Usuario("fulano");
        lance = new Lance(usuario, BigDecimal.TEN);
    }

    @When("Quando propoe o lance")
    public void quandoPropoeOLance(){
        leilao = new Leilao("Tablet XXXXXXXx");
        leilao.propoe(lance);
    }

    @Then("Entao o lance sera aceito")
    public void entaoOLanceSeraAceito(){
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
    }

}
