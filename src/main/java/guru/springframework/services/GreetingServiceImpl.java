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
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!!!!";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}

}
