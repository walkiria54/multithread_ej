/**
 * 
 */
package ejJUnit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Assume;
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
public class AsumeEjemploTest {

	
	@Test
	public void when_generaError_then_assumeNoExcep() {
		String cadena=null;
		FailEjemplo f = new FailEjemplo();
		try{
			 cadena = f.getListIndexOutOfBoundary();
		}catch (Exception e){
			Assume.assumeNoException(e);
			cadena="supuesto no esperado";
			cadena=f.getListGood();
			Assert.assertEquals("hola", cadena);
		}

	}

	
}
