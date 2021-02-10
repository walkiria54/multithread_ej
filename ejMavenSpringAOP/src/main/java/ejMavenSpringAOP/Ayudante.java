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
		//return "Preparaci�n previa del informe";
		System.out.println("Preparacion del informe");
		
	}
	@After(value ="execution(public String getInforme())")
	public void revisionInformeComercial(){
		//return "Revisi�n final del informe";
		System.out.println("Revisi�n del informe");
	}
}
