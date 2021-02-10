/**
 * 
 */
package ejMockito.pruebas;

import java.util.List;

/**
 * @author rocio.dedios
 *
 */
public class Suma {

	
	

	public Suma() {
	}
	

	public int previoASuma(int a, int b)
	{
		return(suma(a,b));
	}
	public int suma(int a,int b){
		return (a+b);
	}
	
	public int llamaADobla(int a, int b, Doble d){
		return d.doblaLaSuma(a, b);
	}
	
	public List setLista (List list, Doble d){
		return d.dameLista(list);
	}

	//para el ejemplo de sobreescritura en el sut del test //getter //
	Doble objetoDoble;  
	public Doble getDoble(){
		return objetoDoble;
	}
	
	public int llamaADoblaSinObj(int a, int b){
		return getDoble().doblaLaSuma(a, b);
	}
	
}
