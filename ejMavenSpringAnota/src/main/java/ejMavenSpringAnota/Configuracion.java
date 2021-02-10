package ejMavenSpringAnota;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("ejMavenSpringAnota")
@PropertySource("classpath:propiedades.properties")
public class Configuracion {

		//definicion de los beans a usar
		@Bean 
		public DocumentosInterface documentosBean(){ //Identificador del bean 
			return new Documentos() ;
		}
		//definicion del bean con el otro bean inyectado
		@Bean EmpleadosInterface comercialSenior(){ //ESTO IDENTIFICA EL NOMBRE DEL BEAN 
			return new ComercialSenior(documentosBean()); //EXTO INYECTA EN LA CREACION DE ESTE BEAN EL OTRO BEAN DEFINIDO ARRIBA
		}
		
		//To resolve ${} in @Value
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
			return new PropertySourcesPlaceholderConfigurer();
		}
}
