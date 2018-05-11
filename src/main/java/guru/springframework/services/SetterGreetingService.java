/**
 * 
 */
package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by piyush.b.kumar on May 10, 2018.
 *
 */
@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the setter!!!";
	}

}
