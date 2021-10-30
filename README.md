Existem algumas formas de nomeação, contudo, em muitos casos os times definem qual padrão utilizar. 
O importante é que o nome dos métodos sejam expressivos e que o padrão escolhido seja seguido.

### convenções de nomes de teste
https://dzone.com/articles/7-popular-unit-test-naming

### doc do cucumber
https://cucumber.io/docs/cucumber/
https://cucumber.io/docs/cucumber/checking-assertions/

### pontos de atenção:

- @RunWith(Cucumber.class) Verificar se o cucumber já roda com o junit 5
- o Cucumber não fornece nenhuma ferramenta para efetivamente verificar condições
- temos que fazer isso a partir da classe org.junit.Assert https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html


#### passos para usar:
- colocar as dependencias no pom;
- criar o dir /src/test/resources/features
- criar a feature;
- criar a classe anotada com @RunWith(Cucumber.class) e @CucumberOptions(features = "classpath:features");
- criar as implementações do gherkin;


### spoken languages
caso queira trocar a linguagem (para nao misturar pt e en) pode-se usar:
```
#  language: pt
```
no arquivo de features.

### Cucumber Expression

É possível passar parâmetros pelas features

Na feature podemos colocar um valor:

```
Scenario: Propondo um unico lance valido
 Given Dado um lance valido de 10.0 de "fulano"
 When Quando "fulano" propoe o lance
 Then Entao o lance sera aceito
```

E o resultado nos mostra como usar:


```
io.cucumber.junit.UndefinedStepException: The step "Dado um lance valido de 10.0 de "fulano"" is undefined. You can implement it using the snippet(s) below:

@Given("Dado um lance valido de {double} de {string}")
public void dado_um_lance_valido_de_de(Double double1, String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
```

Por fim a implementação:



### Regex

Também é possível usar expressões regulares:
```
@Dado("^um lance de (\\d+[.]\\d\\d?) reais do usuario (\\w+)$")
```

###  Hooks

- @After e @Before: executados antes e depois de cenários
- @BeforeStep e @AfterStep: executados antes e depois de passos @Dado @Quando ou @Entao
- Esses métodos não ficam visíveis para quem lê apenas o arquivo .feature

