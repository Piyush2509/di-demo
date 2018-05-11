package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * Created by piyush.b.kumar on May 11, 2018.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Servicio de Saludo Primario";
	}

	@Override
	public String getGermanGreeting() {
		return "Primärer Grußdienst";
	}

}
