package testsRC;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import static org.junit.Assert.assertEquals;

public class AccederDesdeGoogleTest {

	public static void main (String[] args){
		//la prueba se inicia en google.com
		Selenium browser = new DefaultSelenium("localhost",4444,"C:\\ROCIO\\CURSOS AULA STREAMING\\SELENIUM\\chromedriver_win32\\chromedriver.exe","http://google.com");
		browser.start();
		//cambio a google.es 
		browser.open("http://www.google.es");
		browser.waitForPageToLoad("50000");
		assertEquals("Google", browser.getTitle());
		browser.type("q","Adictos al trabajo");//introducir un texto en el elemento q 
		browser.click("btnG");
		browser.waitForPageToLoad("50000");
		assertEquals("Adictos al trabajo - Buscar con Google", browser.getTitle());
		browser.click("lin=Adictos al Trabajo. Formacion y desarrollo | JAVA, JEEE, UML, XML ...");
		browser.waitForPageToLoad("50000");
		assertEquals("Adictos al Trabajo. Formacion y desarrollo | JAVA, JEEE, UML, XML |. Tutoriales sobre nuevas tecnologias.", browser.getTitle());
		browser.stop();
	}


}
