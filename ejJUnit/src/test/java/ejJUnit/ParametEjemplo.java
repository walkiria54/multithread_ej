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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.hamcrest.*;

import alten.ejJUnit.Alumno;
import alten.ejJUnit.FailEjemplo;
import alten.ejJUnit.Suma;


/**
 * @author rocio.dedios
 *
 */
@RunWith(Parameterized.class)
public class ParametEjemplo {

	@Parameters
	public static Collection<Object[]> datos(){
		return Arrays.asList(new Object[][]{
			{1,2},{3,5},{0,4},{8,4},{1,3}
		});
	}
	
	private int v1;
	private int v2;
	
	//Constructor de este test
	public ParametEjemplo(int a, int b) {
		v1=a;
		v2=b;
	}
	Suma s= new Suma();
	
	@Test
	public void when_suma_then_return_values(){
		System.out.println("Vamos a sumar "+v1+ " y "+v2);
		int result=s.suma(v1,v2);
		Assert.assertEquals(v1+v2, result);
	}
	


}
