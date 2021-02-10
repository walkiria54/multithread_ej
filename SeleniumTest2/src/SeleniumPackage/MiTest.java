package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiTest {
	public static void main(String[] args){
		//creo una instancia del driver de crome driver 
		System.setProperty("webdriver.chrome.driver", "C:\\ROCIO\\CURSOS AULA STREAMING\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
//	    System.setProperty("webdriver.firfox....
//	    WebDriver driverFirefox = new f
	    String url_lanzar= "http://ceipelviralindo.centros.educa.jcyl.es/sitio/";
	    //lanzo una web
	    driver.get(url_lanzar);
	   // driver.get("https://www.google.com");
	    
	    
	    //mensajes que saldran por consola 
	    System.out.println("lanzada pagina web del colegio elvira lindo");
	    String url =driver.getCurrentUrl();
	    String title = driver.getTitle(); //el titulo de la web q aparece en la pestña de chrome
	    String source = driver.getPageSource();
	    System.out.println("url: "+url);
	    System.out.println("titulo:"+title);
	    System.out.println("longitud del titulo:"+title.length());
	    System.out.println("---------------");
	   // System.out.println("codigo fuente:"+source);
	    System.out.println("longitud del código fuente:"+source.length());
	    if (url.equals(url_lanzar)){
	    	System.out.println("URL CAPTURADA ES LA INICIALMENTE LANZADA");
	    }else{
	    	System.out.println("ERROR!! URL CAPTURADA NO ES LA INICIALMENTE LANZADA");
	    }
	    
	    //esperamos 5 segundos y cerramos la conexión con el driver
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				 System.out.println("error esperando 5 segundos");
			e.printStackTrace();
			}

	   
	    driver.quit();
	}

}
