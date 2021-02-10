package ejMavenSpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Ayudante {

	@Before(value = "execution(public String getInforme())")
	public void preparaInformeComercial(){
		//return "Preparación previa del informe";
		System.out.println("Preparacion del informe");
		
	}
	@After(value ="execution(public String getInforme())")
	public void revisionInformeComercial(){
		//return "Revisión final del informe";
		System.out.println("Revisión del informe");
	}
}
