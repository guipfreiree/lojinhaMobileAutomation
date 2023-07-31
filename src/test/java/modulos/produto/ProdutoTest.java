package modulos.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

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
        app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        app.findElement(By.id("com.lojinha:/id/user")).click();
        app.findElement(By.id("com.lojinha:/id/user")).findElement(By.id("com.lojinha:/id/editText")).sendKeys("admin");

        app.findElement(By.id("com.lojinha:/id/password")).click();
        app.findElement(By.id("com.lojinha:/id/password")).findElement(By.id("com.lojinha:/id/editText")).sendKeys("admin");

        app.findElement(By.id("com.lojinha:/id/loginButton")).click();

        app.findElement(By.id("com.lojinha:/id/floatingActionButton")).click();

        app.findElement(By.id("com.lojinha:/id/productName")).click();
        app.findElement(By.id("com.lojinha:/id/productName")).findElement(By.id("com.lojinha:/id/editText")).sendKeys("iPhone 14");

        app.findElement(By.id("com.lojinha:/id/productValue")).click();
        app.findElement(By.id("com.lojinha:/id/productValue")).findElement(By.id("com.lojinha:/id/editText")).sendKeys("700001");

        app.findElement(By.id("com.lojinha:/id/productColors")).click();
        app.findElement(By.id("com.lojinha:/id/productColors")).findElement(By.id("com.lojinha:/id/editText")).sendKeys("Preto e Amarelo");

        app.findElement(By.id("com.lojinha:/id/saveButton")).click();
    }
}
