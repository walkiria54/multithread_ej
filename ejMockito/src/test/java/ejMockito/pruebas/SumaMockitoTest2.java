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

import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;

/**
 * @author rocio.dedios
 *
 */

public class SumaMockitoTest2 {

	@Mock
	Doble d;

	// Subject under the test
	Suma sut;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		//en el constructor del sut sobreescribo diciendo que el objeto que quiero usar 
		//de la otra clase es el mock 
		sut = new Suma(){
			@Override
			public Doble getDoble(){
				return SumaMockitoTest2.this.d;
			}
		};
	}

	@Test
	public void when_sumaDobleSinPasarObjeto_then_return() {
		Mockito.when(d.doblaLaSuma(2, 3)).thenReturn(10);
		int resultado = this.sut.llamaADoblaSinObj(2, 3);
		Assert.assertEquals(10, resultado);
	}
}
