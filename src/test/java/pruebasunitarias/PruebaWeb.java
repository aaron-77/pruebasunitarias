package pruebasunitarias;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaWeb {
	
	private WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyundai.com.mx/prueba-de-manejo/");
		
	}
	
	@Test
	public void testGooglePage() throws InterruptedException {
		Thread.sleep(15000);
		driver.switchTo().frame("iFrameResizer0");
		Select comboModelo = new Select(driver.findElement(By.name("modelo_select")));
		comboModelo.selectByValue("Grand i10 Hatchback");
		Thread.sleep(2000);
		Select comboVersion = new Select(driver.findElement(By.name("version_select")));
		comboVersion.selectByValue("object:15");
		Thread.sleep(2000);
		Select comboEstado = new Select(driver.findElement(By.name("estado")));
		comboEstado.selectByValue("Veracruz");
		Thread.sleep(2000);
		Select comboDistribuidor = new Select(driver.findElement(By.name("distribuidor_select")));
		comboDistribuidor.selectByValue("object:21");
		Thread.sleep(2000);
		Select comboSaludo = new Select(driver.findElement(By.name("saludo")));
		comboSaludo.selectByValue("object:9");
		driver.findElement(By.name("nombre")).sendKeys("aaron");
		driver.findElement(By.name("apellido")).sendKeys("hernandez");
		driver.findElement(By.name("telefono")).sendKeys("2282874647");
		driver.findElement(By.name("email")).sendKeys("uncorreo@gmail.com");
		driver.findElement(By.name("codigo_postal")).sendKeys("81500");
		Select comboInteres = new Select(driver.findElement(By.name("intencion_de_compra")));
		comboInteres.selectByValue("string:De 3 a 6 meses");
		//driver.findElement(By.xpath("//*[@placeholder='DD/MM/YY']")).click();
		//Thread.sleep(10000);
		//searchBox.clear() object:21;
		//searchBox.sendKeys("laptops 16 gb de ram");
		//searchBox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//assertEquals("laptops 16 gb de ram - Buscar con Google",driver.getTitle());
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
	

}
