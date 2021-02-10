package ejMavenSpringAnota;

import org.springframework.stereotype.Component;

@Component
public class NominasTrimestre1 implements NominasInterface {

	@Override
	public String getNominas() {
		
		return "--Nominas 1 trimestre";
	}

}
