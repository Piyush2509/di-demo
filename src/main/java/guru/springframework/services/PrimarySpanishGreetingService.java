package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by piyush.b.kumar on May 11, 2018.
 */
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;
    
    @Autowired
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }

}
