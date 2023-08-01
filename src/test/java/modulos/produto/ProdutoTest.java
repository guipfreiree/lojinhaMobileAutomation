package modulos.produto;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import telas.LoginTela;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@DisplayName("Testes para o módulo de Produtos")
public class ProdutoTest {
    WebDriver app;
    @BeforeEach
    public void beforeEach() throws MalformedURLException {
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platformName", "Android");
        capacidades.setCapability("udid", "127.0.0.1:6555");
        capacidades.setCapability("appPackage", "com.lojinha");
        capacidades.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        capacidades.setCapability("app", "/Users/guilhermepereirafreire/IdeaProjects/lojinhaMobile/LojinhaAndroidNativa/lojinha-nativa.apk");

        this.app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
        this.app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @DisplayName("Validacao do valor de produto nao permitido")
    @Test
    public void testValorProdutoMaiorQue7mil() {

        String mensagemApresentada = new LoginTela(app)
                .inserirUsuario("admin")
                .inserirSenha("admin")
                .direcionaParaListagemDeProdutos()
                .direcionaParaTelaAdicaoProduto()
                .inserirNomeProduto("iPhone 14")
                .inserirPrecoProduto("700001")
                .inserirCoresProduto("Preto, Amarelo")
                .submissaoComErro()
                .obterMensagemDeErro();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }

    @AfterEach
    public void afterEach() {
        app.quit();
    }
}
