package SeleniumPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Migracion {
	public static void main (String[] args){

//		Selenium browser = new DefaultSelenium("localhost",4444,"C:\\ROCIO\\CURSOS AULA STREAMING\\SELENIUM\\chromedriver_win32\\chromedriver.exe","http://google.com");
//		browser.start();
		
		//migro eso q es RC a webDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\ROCIO\\CURSOS AULA STREAMING\\SELENIUM\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		


		//cambio a google.es 
		//browser.open("http://www.google.es");
		    		    driver.get("http://www.google.es");//migracion 
		    		    
		     
		    		    
//		browser.waitForPageToLoad("50000");
//		assertEquals("Google", browser.getTitle());
		    		    if (driver.getTitle().equals("Google"))	{
		    		    	System.out.println("El titulo es Google");
		    		    }else{
		    		    	System.out.println("Titulo distinto de Google");
		    		    }
//		browser.type("q","Adictos al trabajo");//introducir un texto en el elemento q 
//		browser.click("btnG");
		    		    
		 WebElement cajabusqueda= driver.findElement(By.name("q"));//id no me funciona 
		 cajabusqueda.sendKeys("Adictos al trabajo");
		 cajabusqueda.submit();

	    	WebElement link= driver.findElement(By.className("LC20lb"));//busco el link que tengo que 
	    	//pinchar para que me lleve a la web...aunque me da un nombre de clase compuesto dejo solo la primera parte porq si pongo todo lo que 
	    	//en la inspeccion viene como class da una excepcion de name compound 
	    	
	    	//click para entrar en la web buscada en navegador
	    	link.click();

	   //driver.quit();
	    	//quedaria pendiente las comprobaciones de cadenas dentro de la página 
		    		    
//		    		    
//		browser.waitForPageToLoad("50000");
//		assertEquals("Adictos al trabajo - Buscar con Google", browser.getTitle());
//		browser.click("lin=Adictos al Trabajo. Formacion y desarrollo | JAVA, JEEE, UML, XML ...");
//		browser.waitForPageToLoad("50000");
//		assertEquals("Adictos al Trabajo. Formacion y desarrollo | JAVA, JEEE, UML, XML |. Tutoriales sobre nuevas tecnologias.", browser.getTitle());
//		browser.stop();
	}

}
