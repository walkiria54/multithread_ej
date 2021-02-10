package ejMavenSpringAOP;

import org.springframework.stereotype.Component;

@Component
public class Informe implements InformeInterface{

	public String getInforme() {
		
		return "--- informe creado";
	}

}
