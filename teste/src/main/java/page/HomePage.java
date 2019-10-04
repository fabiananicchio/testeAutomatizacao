package page;

import core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public void setProdutoBusca (String texto) {
        setText("twotabsearchtextbox", texto);
    }

    public void teclaEnter() {
        pressReturnKey(By.id("twotabsearchtextbox"));
    }



}

