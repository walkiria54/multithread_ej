package ejMavenSpringAOP2;

public interface EmpleadosInterface {
	
	
	public String getTareas();
	
	public String getInforme();

	void imprimeCadena();

	String getTareasConExcep() throws Exception;

	void metodoArgs(String cadena);
	
	

}
