package ejMavenSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrincipalPrototype {
public static void main(String[] args){
		
	

		//crear el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		//pedimos dos bean 
		Secretario secretario = context.getBean("miSecretario",Secretario.class);
		Secretario secretario2 = context.getBean("miSecretario",Secretario.class);
		if (secretario.equals(secretario2)){
			System.out.println("son lo mismo");
		}
		else{
			System.out.println("no son lo mismo");
		}
		context.close();

	
	}
}
