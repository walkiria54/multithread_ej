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

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;

/**
 * @author rocio.dedios
 *
 */
// @RunWith(MockitoJUnitRunner.class) o bien initMocks
public class SumaSpyTest3 {

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
	public void when_suma_then_SutAsSpy() {
		final Suma sumaSpy = Mockito.spy( this.sut); 
//podria condicionar el comportamiento del sut 
		//Mockito.doReturn(xxxx).when(sumaSpy).<metodo interno al metodo suma>(arg);
		int resultado2=sumaSpy.previoASuma(2, 3);
		Assert.assertEquals(5, resultado2);
		//puedo verificar sobre el sut 
		Mockito.verify(sumaSpy, times(1)).suma(2,3);

	}

	@Test
	public void when_llamaADobleSpy() {

		this.d = Mockito.spy( new Doble()); //no me interesa un mock me interesa que se ejecute
		//el método doblaLaSuma se ejecuta normal por ser 
		//el spy quien lo llama pero el metodoInterno lo mockeo 
		Mockito.doReturn(100).when(this.d).metodoInterno(2, 3);
		int resultado = this.sut.llamaADobla(2, 3, d) ;
		Assert.assertEquals(100, resultado);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
}
