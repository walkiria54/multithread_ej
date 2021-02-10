package fbTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registro {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\ROCIO\\CURSOS AULA STREAMING\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    String url_lanzar= "http://facebook.com";
	    driver.get(url_lanzar);
	    
	    //para manejar la ventana y maximizarla
	    driver.manage().window().maximize();
	    String expectedTitle ="Facebook - Entrar o registrarse"; //titulo de la pestaña cuando entramos 
	    String actualTitle =driver.getTitle();
	    if (expectedTitle.equals(actualTitle)){
	    	System.out.println("PAGINA IGUAL A LA BUSCADA");
	    }else{
	    	System.out.println("PAGINA<"+actualTitle+">NO ES IGUAL A LA BUSCADA");
	    }
	    
	    //interactuar con el formulario de registro
	    WebElement name = driver.findElement(By.id("u_0_o"));
	    name.clear();
	    name.sendKeys("nombre");

	    WebElement surname = driver.findElement(By.id("u_0_q"));
	    surname.clear();
	    surname.sendKeys("apellido");
	    WebElement telephone = driver.findElement(By.id("u_0_t"));
	    telephone.clear();
	    telephone.sendKeys("666666666");
	    WebElement newPass = driver.findElement(By.id("u_0_y"));
	    newPass.clear();
	    newPass.sendKeys("contrasena");
	    
	    WebElement registryButton = driver.findElement(By.id("u_0_15"));
	    registryButton.click();
	    
	    
	    //manterner la sesion iniciada durante 5 segundos
	    try{
	    	Thread.sleep(5000);
	    }catch(InterruptedException ie){
	    	ie.printStackTrace();
	    }
	    
	    driver.close();
	    System.out.println("El script se ha ejecutado y no termina el alta porque falta el sexo ");
	    System.exit(0);}
}
