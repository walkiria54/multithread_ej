package ejMavenSpringAnota;

import org.springframework.stereotype.Component;

@Component
public class Extractos implements ExtractosInterface{
	public String getExtracto(){
		return "Extractos generados";
	}

}
