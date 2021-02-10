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
// @RunWith(MockitoJUnitRunner.class) o bien initMocks
public class SumaMockitoTest {

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
	public void when_sumaDobleMock_then_return() {

		Mockito.when(d.doblaLaSuma(2, 3)).thenReturn(10);
		int resultado = this.sut.llamaADobla(2, 3, d);
		verify(this.d, Mockito.times(1)).doblaLaSuma(2, 3);
		verify(this.d, Mockito.times(1)).doblaLaSuma(Mockito.anyInt(), Mockito.anyInt()); // otra
																							// forma
		verify(this.d, Mockito.never()).trataLaExcepcion(); // asegurar que no
															// he llegado en la
															// llamada a otro
															// método
		Assert.assertEquals(10, resultado);

	}

	// EJEMPLO LOS ARGUMENTOS AL MOCK PUEDEN SER ANY DE CUALQUIER TIPO DE CLASE
	// , PUEDO ASEGURARME D ELA LLAMADA CON CUALQUIER ANY
	@Test
	public void when_setList_returnList() {
		List<String> lista = new ArrayList();
		lista.add("hola");
		lista.add("adios");

		List<String> list = new ArrayList();

		Mockito.when(d.dameLista(any(List.class))).thenReturn(lista);
		List<String> resultado = this.sut.setLista(list, d);
		verify(this.d, Mockito.times(1)).dameLista(any(List.class));
		Assert.assertEquals((resultado.get(0)), "hola");
	}

}
