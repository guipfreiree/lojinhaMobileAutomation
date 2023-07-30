package modulos.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@DisplayName("Testes para o módulo de Produtos")
public class ProdutoTest {
    @DisplayName("Validacao do valor de produto nao permitido")
    @Test
    public void testValorProdutoIgualAZero() throws MalformedURLException {
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platformName", "Android");
        capacidades.setCapability("udid", "127.0.0.1:6555");
        capacidades.setCapability("appPackage", "com.lojinha");
        capacidades.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        capacidades.setCapability("app", "/Users/guilhermepereirafreire/IdeaProjects/lojinhaMobile/LojinhaAndroidNativa/lojinha-nativa.apk");

        WebDriver app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
    }
}