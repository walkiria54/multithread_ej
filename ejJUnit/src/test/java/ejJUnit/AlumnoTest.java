/**
 * 
 */
package ejJUnit;

//import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import org.hamcrest.*;

import alten.ejJUnit.Alumno;


/**
 * @author rocio.dedios
 *
 */
public class AlumnoTest {
	
	
	
	@Before
	public void setUp(){
		System.out.println("---antes de cada test----");
	}
	@BeforeClass
	public static void setUpClass(){
		System.out.println("---antes de todos test----");
	}
	

	@Test
	public void when_testConcatenaNomApe_then_return_completedName(){
		//instanciar la clase a probar
		Alumno alum= new Alumno();
		//ejecutar el método a probar 
		String completedName = alum.concatenaNomApe("Jose","Rodriguez");
		//Assert.assertEquals("JoseRodriguez", completedName);
		//validar
		assertEquals("JoseRodriguez",completedName);
		
	}
	
	
	//ejemplo Hamcrest 
	@Test
	public void when_testHamcrestConcatenaNomApe_then_return_completedName(){
		//instanciar la clase a probar
				Alumno alum= new Alumno();
				//ejecutar el método a probar 
				String completedName = alum.concatenaNomApe("Jose","Rodriguez");
				//validar con is (equalTo
				Assert.assertThat("JoseRodriguez",is(completedName));
				//validar con not (equalTo
				
			}
	
	
	@Test
	public void when_testConcatenaNomApe_then_return_completedName2(){
		//instanciar la clase a probar
		Alumno alum= new Alumno();
		//ejecutar el método a probar 
		String completedName = alum.concatenaNomApe("Marta","Perez");
		//validar
		Alumno unExpected = new Alumno("Marta", "Perez", "Female", 18);
		assertEquals("MartaPerez",completedName);
		Assert.assertNotEquals(unExpected, alum);
		Assert.assertNotSame(unExpected, alum);
		
	}

	
	@Test 
	public void when_testCreaAlumnoMale_then_return_Male(){
		Alumno alum= new Alumno();
		alum.creaAlumnoMale();
		assertEquals("Male", alum.getSexo());
	}
	
	@Test 
	public void when_testCreaAlumnoEdad(){
		Alumno alum= new Alumno();
		alum.creaAlumnoEdad(28);
		Integer edadEsperada= new Integer(28);
		assertEquals(edadEsperada.byteValue(), alum.getEdad());
		//Assert.assertSame(edadEsperada.byteValue(),alum.getEdad()); esto falla 
	}
	
	
	@Test 
	public void when_testGeneraArrayGivenABC(){
		String [] actual=Alumno.generaArrayStrings("a","b","c");
		String [] expected = {"a","b","c"};
		assertEquals(expected[0], actual[0]);
		assertEquals(expected[1], actual[1]);
		assertEquals(expected[2], actual[2]);
		//comprobación global 
		//assertEquals(actual,expected);
		
	}
	

	
	  
	@After
	public void tearDown(){
		System.out.println("---despues de cada test----");
	}
	
	@AfterClass
	public static void tearDownClass(){
		System.out.println("---despues de todos test----");
	}
}
