package steps;

import io.cucumber.java8.Pt;
import org.openqa.selenium.By;
import page.HomePage;

public class adicionaProdutoNoCarrinhoSteps implements Pt {

    private HomePage page = new HomePage();

    public adicionaProdutoNoCarrinhoSteps() {

        Dado("que eu faco uma busca por um produto", () -> {
            page.setProdutoBusca("mochila Targus");
            page.teclaEnter();
        });

        Dado("abro seus detalhes", () -> {
            page.clickItem(By.xpath("//span[contains(text(),'Mochila Targus Terra Backpack para Notebook 15.6 T')]"));
        });

        Quando("adiciono no carrinho de compras", () -> {
            page.clickItem(By.id("add-to-cart-button"));
        });

        Então("o produto aparece no carrinho", () -> {
            page.clickItem(By.id("nav-cart"));
        });

    }
}
