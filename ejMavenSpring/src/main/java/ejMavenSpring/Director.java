package ejMavenSpring;

public class Director implements EmpleadosInterface {


	public String getTareas() {
		
		return "Dirige";
	}

	public String getInforme() {
		// TODO Auto-generated method stub
		
		//return "informe del director por defecto";
		return "Director "+informe.getInforme();
	}

	
	//INYECCIÓN CON CONSTRUCTOR 
	private InformeInterface informe;
	//constructor 
	public Director(InformeInterface informe){
		this.informe=informe;
	}
	
	
	


	//campos  inyectados getter y setter
	private String tituloInforme;
	public String getTituloInforme() {
		return tituloInforme;
	}
	public void setTituloInforme(String tituloInforme) {
		this.tituloInforme = tituloInforme;
	}
	
	
	//init-destroy
	
	private void init(){
		System.out.println("...hace cosas antes de tener el bean ...");
		
	}
	
	private void destroy(){
		System.out.println("...hace cosas despues de cerrar el contenedor ...");
		
	}
}
