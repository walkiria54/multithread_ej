package ejMavenSpringAOP2;

import org.springframework.stereotype.Component;

@Component 
public class Operario implements EmpleadosInterface {

	@Override
	public void imprimeCadena() {
		System.out.println("Operario arregla cachivaches.");
		
	}
	
	//do nothing 
	@Override
	public String getTareas() {
		
	return null;
	}

	
	
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

	

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
