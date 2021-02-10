/**
 * 
 */
package ejMockito.pruebas;

import java.io.IOException;
import java.util.List;

/**
 * @author rocio.dedios
 *
 */
public class Doble {


	public Doble() {
	}
	
	public int doblaLaSuma(int a,int b){
		try{
			System.out.println("----entrando en metodo doblaLaSuma");
		return metodoInterno(a,b);
		}catch ( RuntimeException e){
			return trataLaExcepcion();
		}
	}
	
	public int trataLaExcepcion(){
		return 20;
	}
	
	public int metodoInterno(int a, int b){
		return (2*(a+b));
	}

	/**
	 * @param list
	 * @return
	 */
	public List dameLista(List list) {
		
		return list;
	}

	

	
}
