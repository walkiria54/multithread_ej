/**
 * 
 */
package ejJUnit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.*;

import alten.ejJUnit.Alumno;
import alten.ejJUnit.FailEjemplo;


/**
 * @author rocio.dedios
 *
 */
public class FailEjemploTest {

	@Test
	public void when_assertFailGetListGood_fails() {
		try {
			FailEjemplo f = new FailEjemplo();
			String cadena = f.getListGood();
			System.out.println("-cadena obtenida correctamente:" + cadena);
			Assert.fail("NO lanzo excepcion ");// hace fallar un test lanzando
											// un AssertionError
		} catch (AssertionError e) {
			System.out.println("- sin embargo---- Excepcion generada intencionadamente");
			
		}

	}

	@Test
	public void when_getListIndexOutOfBoundary_then_exception() {
		try {
			FailEjemplo f = new FailEjemplo();
			String cadena = f.getListIndexOutOfBoundary();
			Assert.assertThat(cadena, Matchers.notNullValue());
			System.out.println("---traza que no va a salir---He pasado por el assertThat");

		} catch (Exception e) {
			System.out.println("Este test no es correcto porque no pasa por el assertThat");
		}

	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void when_getListIndexOutOfBoundary_expected() {
		FailEjemplo f = new FailEjemplo();
		String cadena = f.getListIndexOutOfBoundary();
			// mas cosas en el test ...
			System.out.println("---aqui no se llega---");
	}
	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void when_getListIndexOutOfBoundary_then_capturada() throws Exception {
		String cadena=null;
		try{
		FailEjemplo f = new FailEjemplo();

			cadena = f.getListIndexOutOfBoundary();
			// mas cosas en el test ...
			
			System.out.println("---aqui no se llega---");
		}catch (IndexOutOfBoundsException i){
			Assert.assertThat(cadena, Matchers.nullValue());
			Assert.assertThat(i.getMessage(), Matchers.containsString("Index"));
			System.out.println("---me aseguro de valor de variables---");
			throw i;
		}
	
	
	}

}
