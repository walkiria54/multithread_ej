package fbTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
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
	    
	    //interactuar con un formulario
	    
	    //para la parte de usuario
	    WebElement username = driver.findElement(By.id("email"));
	    //By.... me da opciones d ecomo buscar ... la propiedad email la se entrando en la pagina web y seleccionando 
	    username.clear();
	    //para ingresar un texto cualquiera 
	    username.sendKeys("TestSelenium");
	    
	    //para la parte de contrasena
	    WebElement pass = driver.findElement(By.id("pass"));
	    pass.clear();
	    pass.sendKeys("passTestSelenium");
	    
	    
	    //simular un click en el botón Entrar...tengo que ir a la pagina y ver 
	    WebElement signInButton = driver.findElement(By.id("u_0_b"));//he tenido que andar buscando exactamente este id pq en el curso era una cosa y ahora la pagina tiene otro identificador 
	    signInButton.click();
	    
	    //manterner la sesion iniciada durante 5 segundos
	    try{
	    	Thread.sleep(5000);
	    }catch(InterruptedException ie){
	    	ie.printStackTrace();
	    }
	    
	    driver.close();
	    System.out.println("El script se ha ejecutado");
	    System.exit(0);
	    
	}

}
