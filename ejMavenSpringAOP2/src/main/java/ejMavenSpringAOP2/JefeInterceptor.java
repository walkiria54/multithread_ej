package ejMavenSpringAOP2;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JefeInterceptor { //notación Diagnostics para saber de quien es interceptor

		@Before("execution(* Jefe.getTareas*(..))")
	public void antesDe(){
		
		System.out.println("Tomar un cafe");
	
		}

	@AfterThrowing("execution(* Jefe.getTareasConExcep*(..))")
	public void cuandoExcepcion(){
		System.out.println("Ha habido un error en la ejecucion de las tareas del jefe");
	}
	

	//@Before("execution(* Jefe.metodoArgs*(String)),&& args(cadena)") -- java.lang.IllegalArgumentException: error at ::0 formal unbound in pointcut 
	@Before("execution(* Jefe.metodoArgs*(..))&& args(cadena,..)")
	public void trasRetornoConArgs(String cadena){
		System.out.println("Intercepcion Before al metodo con argumentos:"+cadena);
		System.out.println("...puedo usar el argumento en el interceptor pero no genera retorno sobre la llamada al método...");
		cadena=cadena.concat("BBBB");
		System.out.println("....argumento modificado en advicer...."+cadena);

	}
	
}
