/**
 * 
 */
package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


/**
 * Created by piyush.b.kumar on May 11, 2018.
 *
 */
@Service
@Profile("en")
@Primary
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting service";
	}

}