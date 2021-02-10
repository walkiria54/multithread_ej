package ejMavenSpringAnota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//nombre del bean no tiene q ser necesariamente el nombre de la clase
@Component
public class Comercial implements EmpleadosInterface{

//	//CONSTRUCTOR PARA INYECTAR LA DEPENDENCIA 
//	private NominasInterface nomina;
//	@Autowired
//	@Qualifier("nominasTrimestre1")
//	public Comercial(NominasInterface nomina) {
//		this.nomina = nomina;
//	}
	
	@Autowired
	@Qualifier("nominasTrimestre2")
	private NominasInterface nomina2;
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Realizar ventas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe del comercial";
		//return nomina.getNominas();// acceso por constructor autowired
		//return extracto.getExtracto();//acceso a traves de setter autowired
		//return extracto2.getExtracto();
		//return extracto3.getExtracto();
		return nomina2.getNominas();// qualifier 2 
	}
	
			

	//inyeccion con setter 
	private ExtractosInterface extracto;
//	public ExtractosInterface getExtracto() {
//		return extracto;
//	}
	@Autowired
	public void setExtracto(ExtractosInterface extracto) {
		this.extracto = extracto;
	}
	
	
	//inyeccion sobre el campo de clase 
	@Autowired
	private ExtractosInterface extracto2;
	
//	//inyeccion sobre un método con nombre cualquiera
	private ExtractosInterface extracto3;
	@Autowired
	public void estableceEstracto(ExtractosInterface extracto){
		this.extracto3=extracto;
	}
		
	
}
