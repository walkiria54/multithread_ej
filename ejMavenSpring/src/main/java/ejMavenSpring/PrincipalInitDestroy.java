package ejMavenSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrincipalInitDestroy {
public static void main(String[] args){
		
	

		//crear el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

		//pedimos dos bean 
		Director  director = context.getBean("miDirector",Director.class);
		System.out.println(director.getInforme());
		context.close();

	
	}
}
