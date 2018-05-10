/**
 * 
 */
package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author piyush.b.kumar
 *
 */
@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected via the constructor!!!";
	}

}
