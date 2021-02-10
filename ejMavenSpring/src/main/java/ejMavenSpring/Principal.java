package ejMavenSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	
	public static void main(String[] args){
		
		//uso tradicional de objetos de diferentes clases que implementan un interfaz
//		Empleados empleado = new Jefe();
//		Empleados secretario = new Secretario();
//		Empleados director = new Director();
//		System.out.println(empleado.getTareas());
		
//		//IoC
		//crear el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//poder usar el bean
		EmpleadosInterface director=context.getBean("miEmpleado", EmpleadosInterface.class);
		System.out.println(director.getTareas());
		
		
		//con la inyeccion de dependencias el director puede hacer informes
		System.out.println(director.getInforme());
		//cierre del contexto
		
		
//		//inyeccion de dependencia informe sobre la clase secretario (setter)
		EmpleadosInterface secretario= context.getBean("miSecretario",EmpleadosInterface.class);
		System.out.println(secretario.getTareas());
		System.out.println(secretario.getInforme());
	
		//inyeccion de campos
		Secretario secretario2= context.getBean("miSecretario",Secretario.class);
		System.out.println(secretario2.getInforme()+" de tipo "+secretario2.getTipoInforme());
		secretario2.setTipoInforme("extractos mensuales");
		System.out.println(secretario2.getInforme()+" de tipo "+secretario2.getTipoInforme());
		if (!secretario2.getCorregido()){
			secretario2.setCorregido(true);
			System.out.println("Secretario2 ha corregido el informe "+secretario2.getTipoInforme());
		}
		
		
		//obtencion campo inyectado por properties 
		Director director2=context.getBean("miEmpleado",Director.class);
		System.out.println("Titulo de los informes"+director2.getTituloInforme());
		context.close();
	
		
		
	
	}
}
