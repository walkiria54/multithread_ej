package ejMavenSpringAOP2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Ayudante {



	//@Before("execution(* Comercial.*(..))") //--OTRA FORMA DE LLAMARSE pero esto seria generico para todos los metodos de la clase
	@Before("execution(public String getInforme())")
	public void preparaInforme(JoinPoint joinPoint){
	
		System.out.println("Preparacion del informe");
		System.out.println("----LLAMADA AL MÉTODO ---"+joinPoint.getSignature().getName());
		}

	
	
	@After("execution(* Comercial.getInforme*(..))")
	public void revisionTrasImpresionInforme(){
		System.out.println("Revision del informe");
		
	}
	
	@Before("execution(* Comercial.impri*(..))")
	public void previoImprimirCadena(){
		System.out.println("Previo al método imprimirCadena");
	}
	
		
	@AfterReturning("execution(* Comercial.impri*(..))")
	public void trasImprimirCadena(){
		System.out.println("Posterior al método imprimirCadena");
	}
	
	//@Pointcut("execution(*.*(..))")
//	public void allMethods(){
//		
//	}
	//@Before("allMethods()")
	//public void advice1(){
	//System.out.println("ejecuto advice1");
	//}
	
}
