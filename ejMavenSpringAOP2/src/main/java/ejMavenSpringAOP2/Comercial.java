package ejMavenSpringAOP2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Comercial implements EmpleadosInterface{


	@Override
	public void imprimeCadena() {
		System.out.println("Impresion de cadena cualquiera");
	
	}
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe del comercial";

	
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Realizar ventas";
	}


	
	//do  nothing para implementar el ifz
	@Override
	public String getTareasConExcep() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void metodoArgs(String cadena) {
		// TODO Auto-generated method stub
		
	}
	
				

	
}
