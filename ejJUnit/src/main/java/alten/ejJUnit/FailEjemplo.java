/**
 * 
 */
package alten.ejJUnit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rocio.dedios
 *
 */
public class FailEjemplo {

	

	public FailEjemplo() {
		super();
		
	}
	
	public String getListIndexOutOfBoundary(){
		List<String> val= new ArrayList<String>();
		return val.get(0);
	}

	public String getListGood(){
		List<String> val= new ArrayList<String>();
		val.add("hola");
		return val.get(0);
	}

}
