package steps;

import io.cucumber.java8.Pt;
import org.openqa.selenium.By;
import page.HomePage;

import static org.junit.Assert.assertTrue;

public class maisVendidosCasaSteps implements Pt {

    private HomePage page = new HomePage();

    public maisVendidosCasaSteps() {

        Dado("que estou na tela de mais vendidos", () -> {
            page.clickItem(By.linkText("Mais Vendidos"));
            assertTrue(page.getCurrentUrl().contains("/bestsellers"));
        });

        Quando("clico em produtos de casa", () -> {
            page.clickItem(By.linkText("Casa"));
        });

        Então("sou redirecionado para os mais vendidos de casa", () -> {
            assertTrue(page.getCurrentUrl().contains("/bestsellers/home"));
        });

    }
}
