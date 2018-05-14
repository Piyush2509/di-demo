package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by piyush.b.kumar on May 11, 2018.
 *
 */
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;
    
    @Autowired
    public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
    
}
