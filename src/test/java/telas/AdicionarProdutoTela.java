package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarProdutoTela {
    private WebDriver app;

    public AdicionarProdutoTela(WebDriver app) {
        this.app = app;
    }

    public AdicionarProdutoTela inserirNomeProduto (String nomeProduto) {
        app.findElement(By.id("com.lojinha:/id/productName")).click();
        app.findElement(By.id("com.lojinha:/id/productName")).findElement(By.id("com.lojinha:/id/editText")).sendKeys(nomeProduto);

        return this;
    }

    public AdicionarProdutoTela inserirPrecoProduto (String precoProduto) {
        app.findElement(By.id("com.lojinha:/id/productValue")).click();
        app.findElement(By.id("com.lojinha:/id/productValue")).findElement(By.id("com.lojinha:/id/editText")).sendKeys(precoProduto);

        return this;
    }

    public AdicionarProdutoTela inserirCoresProduto(String coresProduto) {
        app.findElement(By.id("com.lojinha:/id/productColors")).click();
        app.findElement(By.id("com.lojinha:/id/productColors")).findElement(By.id("com.lojinha:/id/editText")).sendKeys(coresProduto);

        return this;
    }

    public AdicionarProdutoTela submissaoComErro() {
        app.findElement(By.id("com.lojinha:/id/saveButton")).click();

        return this;
    }

    public String obterMensagemDeErro() {
        return app.findElement(By.xpath("//android.widget.Toast")).getText();
    }
}
