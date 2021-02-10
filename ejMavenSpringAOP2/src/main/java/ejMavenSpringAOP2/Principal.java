package ejMavenSpringAOP2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	
	public static void main(String[] args){

		//crear el contexto desde el XML 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir el bean con anotations
		EmpleadosInterface comercial=context.getBean("comercial", EmpleadosInterface.class);
		
		//AQU� SE EJECUTAR�N LOS BEFORE
		System.out.println(comercial.getInforme());
		//AQU� SE EJECUTAR�N LOS AFTER 
		
		
		System.out.println("-------------------------");
		//llamada a otro m�todo (tambi�n interceptado) 
		comercial.imprimeCadena();
		System.out.println("-------------------------");
		
		//generacion de otro bean y llamada a otro m�todo interceptado normal y  con control de excep
		EmpleadosInterface jefe =context.getBean("jefe", EmpleadosInterface.class);
		
		System.out.println(jefe.getTareas());
		System.out.println("-------------------------");
		
		try {
			jefe.getTareasConExcep();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("----fin de ejecucion jefe tareas con error---- ");
		}
		

		//generacion de otro bean intercepcion con around
		EmpleadosInterface operario =context.getBean("operario", EmpleadosInterface.class);
        operario.imprimeCadena();
		
      
        System.out.println("---------------------");
        //interceptado por advice @Before con argumentos
        jefe.metodoArgs("AAAAA");
        
        
        
      //Interceptor Ayudante con advicer @Before preparaInforme puede serlo tambi�n de clase Jefe 
      		//System.out.println(jefe.getInforme());--- descomentar y ver que funciona 
        
					//cerrar el contexto 
		context.close();
		
		

		
		
	
	}
}
