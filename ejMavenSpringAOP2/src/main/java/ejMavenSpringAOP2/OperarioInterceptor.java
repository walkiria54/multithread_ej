package ejMavenSpringAOP2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OperarioInterceptor {

	@Around("execution(* Operario.imprime*(..))")
	public Object aroundOperario(ProceedingJoinPoint proceedingJoinPont){
	
		System.out.println("....Fumar primero....");
		
		try{
			proceedingJoinPont.proceed();
		}catch (Exception e) {
			// TODO: handle exception
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("....Fumar despues....");
		return proceedingJoinPont;
		
		
		}
}
