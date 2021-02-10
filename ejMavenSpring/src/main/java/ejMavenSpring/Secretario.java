package ejMavenSpring;

public class Secretario implements EmpleadosInterface {

	public String getTareas() {
		
		return "Hace informes de jefe";
	}

	public String getInforme() {
		// TODO Auto-generated method stub
		return "Secretario hace un informe"+informe.getInforme();
	}
	



	//INYECCION CON SETTER
	private InformeInterface informe;
	public void setInformeSecretario(InformeInterface informe) {
		this.informe = informe;
	}
	
	
	//INYECCION DE NUEVOS CAMPOS 
	private String tipoInforme;
	private boolean corregido;
		//setters y getters
	public String getTipoInforme() {
		return tipoInforme;
	}
	public void setTipoInforme(String tipoInforme) {
		this.tipoInforme = tipoInforme;
	}
	public boolean getCorregido() {
		return corregido;
	}
	public void setCorregido(boolean corregido) {
		this.corregido = corregido;
	}

}
