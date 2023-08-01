package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaProdutosTela {
    private WebDriver app;

    public ListaProdutosTela(WebDriver app) {
        this.app = app;
    }

    public AdicionarProdutoTela direcionaParaTelaAdicaoProduto() {
        app.findElement(By.id("com.lojinha:/id/floatingActionButton")).click();

        return new AdicionarProdutoTela(app);
    }
}
