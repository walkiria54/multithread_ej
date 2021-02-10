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
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
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
@RunWith(Theories.class)
public class TheoryEjemplo {

@DataPoint
public static int a=1;
@DataPoint
public static int b=2;
	Suma s= new Suma();
	
	@Theory
	public void when_suma_then_return_all(int a, int b){
		System.out.println("Vamos a sumar "+a+ " y "+b);
		int result=s.suma(a, b);
		Assert.assertEquals(a+b, result);
	}
	


}
