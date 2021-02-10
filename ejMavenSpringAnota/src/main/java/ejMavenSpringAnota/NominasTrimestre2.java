package ejMavenSpringAnota;

import org.springframework.stereotype.Component;

@Component
public class NominasTrimestre2 implements NominasInterface {

	@Override
	public String getNominas() {
		
		return "--Nominas 2 trimestre";
	}

}
