package core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.DriverFactory.getDriver;
import static core.LocalProperties.WAIT_TIME_IN_SECONDS;

/**
 * A classe BasePage encapsula atributos e métodos do framework Selenium, como campos e ações que
 * serão aplicadas em cada pagina (Page)
 */
public class BasePage {

    /**
     * Define o tempo de espera para os métodos que utilizam a instancia do WebDriverWait.
     */
    private WebDriverWait wait = new WebDriverWait(getDriver(), WAIT_TIME_IN_SECONDS);


    /**
     * Verificar se um elemento está presente na página localizado pela propriedade by do selenium.
     *
     * @param by elemento estático da classe WebElement
     */
    public void waitPresenceElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * Limpa e digita em um elemento, que aceite definir um valor localizado pela propriedade Id do
     * selenium.
     *
     * @param by elemento estático da classe WebElement
     * @param text texto a ser inserido no elemento input
     */
    public void setText(String by, String text) {
        getDriver().findElement(By.id(by)).clear();
        getDriver().findElement(By.id(by)).sendKeys(text);
    }

    /**
     * Pressiona o botão Enter(Return), em um campo de texto que aceite definir um valor localizado
     * pela propriedade by do selenium.
     *
     * @param by elemento estático da classe WebElement
     */
    public void pressReturnKey(By by) {
        getDriver().findElement(by).sendKeys(Keys.RETURN);
    }

    /**
     * Clica em um elemento localizado pela propriedade by do selenium.
     *
     * @param by elemento estático da classe WebElement
     */
    public void clickItem(By by) {
        getDriver().findElement(by).click();

    }

    /**
     * Retorna a URL em que o navegador está no momento que a função é chamada
     *
     * @return URL atual
     */
    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    };

}
