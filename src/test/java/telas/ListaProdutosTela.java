package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaProdutosTela extends BaseTela{

    public ListaProdutosTela(WebDriver app) {
        super(app);
    }

    public AdicionarProdutoTela direcionaParaTelaAdicaoProduto() {
        app.findElement(By.id("com.lojinha:/id/floatingActionButton")).click();

        return new AdicionarProdutoTela(app);
    }
}
