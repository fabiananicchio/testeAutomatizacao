$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/feature/maisVendidosCasa.feature");
formatter.feature({
  "name": "Visulizar produtos mais vendidos de casa",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Visualizar mais vendidos de casa",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que estou na tela de mais vendidos",
  "keyword": "Dado "
});
formatter.match({
  "location": "maisVendidosCasaSteps.java:15"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em produtos de casa",
  "keyword": "Quando "
});
formatter.match({
  "location": "maisVendidosCasaSteps.java:20"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sou redirecionado para os mais vendidos de casa",
  "keyword": "Então "
});
formatter.match({
  "location": "maisVendidosCasaSteps.java:24"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alguma coisa",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});