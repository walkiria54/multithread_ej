package ejMavenSpringAOP2;

import org.springframework.stereotype.Component;

@Component
public class Jefe implements EmpleadosInterface{

	@Override
	public String getTareas() {

		return "Hacer tareas propias de jefe";
	}
	@Override
	public String getTareasConExcep() throws Exception {
		System.out.println(this.getTareas());

		throw new Exception("Generacion de tareas de jefe lanza una excepcion ");
	}
	@Override
	public String getInforme() {
		
		return "Informe generado por el jefe";
	}

	@Override
	public void imprimeCadena() {
		// TODO Auto-generated method stub

	}

	//@Override
	public void metodoArgs(String cadena){
		System.out.println("llamada al metodo con  argumento: "+cadena);
	}
	
}
