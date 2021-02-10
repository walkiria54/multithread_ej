/**
 * 
 */
package ejMockito.pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;

/**
 * @author rocio.dedios
 *
 */
// @RunWith(MockitoJUnitRunner.class) o bien initMocks
public class DoThrowTest {

	@Mock
	Doble d;

	// Subject under the test
	Suma sut;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		sut = new Suma();

	}

	@Test
	public void when_suma_given_exception_then_tratamiento_and_result() {

		this.d=Mockito.spy(new Doble());
		Mockito.doThrow(new RuntimeException("generando una excepcion desde el test"))
		.when(this.d).metodoInterno(2, 3);
		int resultado = this.sut.llamaADobla(2, 3, d);
		Mockito.verify(this.d, Mockito.times(1)).trataLaExcepcion();
		Assert.assertEquals(20, resultado);
	}

}
