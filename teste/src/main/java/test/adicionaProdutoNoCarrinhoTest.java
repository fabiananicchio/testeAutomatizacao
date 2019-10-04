package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/java/feature/adicionaProdutoNoCarrinho.feature",
    glue = "",
    tags = {"not @ignore"},
    plugin = {"summary", "pretty", "html:target/report-html", "json:target/report.json"},
    monochrome = true,
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    dryRun = false,
    strict = true
)

public class adicionaProdutoNoCarrinhoTest {

}
