package testsRC;

import static org.junit.Assert.assertEquals;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Principal {
	public static void main (String[] args){
		//tengo que tener el servidor arrancado
		//la prueba se inicia en google.com
		//Selenium browser = new DefaultSelenium("localhost",4444,"C:\\ROCIO\\CURSOS AULA STREAMING\\SELENIUM\\chromedriver_win32\\chromedriver.exe","http://google.com");
		//para probar con iexplorer 
		Selenium browser = new DefaultSelenium("localhost",4444,"iehta","http://google.com");
		browser.start();//inicia el navegador 

		//cambio a google.es 
		browser.open("http://www.google.es");
		browser.waitForPageToLoad("5000");
		assertEquals("Google", browser.getTitle());
		browser.stop();
	}

}
