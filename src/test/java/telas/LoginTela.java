package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTela {
    private WebDriver app;
    public LoginTela(WebDriver app) {
        this.app = app;
    }

    public LoginTela inserirUsuario(String nomeUsuario) {
        app.findElement(By.id("com.lojinha:/id/user")).click();
        app.findElement(By.id("com.lojinha:/id/user")).findElement(By.id("com.lojinha:/id/editText")).sendKeys(nomeUsuario);

        return this;
    }

    public LoginTela inserirSenha(String senhaUsuario) {
        app.findElement(By.id("com.lojinha:/id/password")).click();
        app.findElement(By.id("com.lojinha:/id/password")).findElement(By.id("com.lojinha:/id/editText")).sendKeys(senhaUsuario);

        return this;
    }

    public ListaProdutosTela direcionaParaListagemDeProdutos() {
        app.findElement(By.id("com.lojinha:/id/loginButton")).click();

        return new ListaProdutosTela(app);
    }
}
