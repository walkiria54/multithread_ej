package ejMavenSpringAnota;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	
	public static void main(String[] args){

		//crear el contexto desde el XML 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir el bean con anotations
		
		EmpleadosInterface comercial=context.getBean("comercial", EmpleadosInterface.class);
		System.out.println(comercial.getInforme());
		
		
//		// EJEMPLO CON CONFIGURACION SIN XML Y CON BEAN INYECTADO EN CLASS DE CONFIGURACION 
//		//leer el contexto desde java sin fichero xml
//				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
//				//solicitar a través de esta configuracio el bean configurado en la class de configuracion
//				EmpleadosInterface comercialSenior =context.getBean("comercialSenior",EmpleadosInterface.class);
//			
//				System.out.println(comercialSenior.getInforme());
//				
//				//uso de properties 
//				ComercialSenior comercialSenior2 =context.getBean("comercialSenior",ComercialSenior.class);
//				System.out.println(comercialSenior2.getTituloDocumento());
//				comercialSenior2.setTituloDocumento("Docu que hace el senior");;
//				System.out.println(comercialSenior2.getTituloDocumento());
		
		//cerrar el contexto 
		context.close();
		
	
	}
}
