package ejMavenSpringAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;




@Component
public class Comercial implements EmpleadosInterface{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Realizar ventas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		
		//quiero que antes de imprimir el informe se ejecute otra parte de código
		//seria generar un obj ayudante y con ese objeto llamar aquí al método en cuestión
		//String preparacion=ayudante.preparaInformeComercial();- 
		
		//llamada AOP
		
	return "Informe del comercial";
		//return informe.getInforme(); con inyeccion de componente informe
		
		//despues de imprimir el informe quiero que se ejecute otra parte de código 
		
		//String revision=ayudante.revisionInformeComercial();
	
	}
	
	//INYECCIÓN CON CONSTRUCTOR 
	private InformeInterface informe;
	//constructor 
	public Comercial(InformeInterface informe){
		this.informe=informe;
	}
	
	private EmpleadosInterface comercial;
	public Comercial(EmpleadosInterface comercial)
	{
		this.comercial = comercial;
	}
	
	
}
