/**
 * 
 */
package ejJUnit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
public class RuleEjemploTest {

	@Rule 
	public org.junit.rules.ExpectedException miexcepEsperada= ExpectedException.none();

	@Test
	public void when_getListIndexOutOfBoundary_expectedMyRule() {
		miexcepEsperada.expect(IndexOutOfBoundsException.class);//como espero esto....no dara error el test
		//ademas puedo comprobar cosas sobre la excepcion
		miexcepEsperada.expectMessage(Matchers.containsString("Index"));
		FailEjemplo f = new FailEjemplo();
		String cadena = f.getListIndexOutOfBoundary();

	}


}
