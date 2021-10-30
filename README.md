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