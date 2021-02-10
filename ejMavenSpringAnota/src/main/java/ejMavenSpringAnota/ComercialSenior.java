package ejMavenSpringAnota;

import org.springframework.beans.factory.annotation.Value;

public class ComercialSenior implements EmpleadosInterface{

	@Override
	public String getTareas() {
		
		return "Tareas de Comercial Senior";
	}

	@Override
	public String getInforme() {
		//uso de la clase documentos inyectada por constructor y configurada con Configuracion.class
		return documentos.getDocumento();
		
	}
	
	//INYECCION A TRAVES DEL CONSTRUCTOR para que se inyecte la clase Documentos
	private DocumentosInterface documentos;
	public ComercialSenior(DocumentosInterface documentos){
		this.documentos=documentos;
	}
	
	

	//campos del properties 
	@Value("${tituloInforme}")
	private String tituloDocumento;
	
	//getter-setter
	public String getTituloDocumento() {
		return tituloDocumento;
	}
	public void setTituloDocumento(String tituloDocumento) {
		this.tituloDocumento = tituloDocumento;
	}
	

}
