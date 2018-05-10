/**
 * 
 */
package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * @author piyush.b.kumar
 *
 */
public class PropertyInjectedController {
	
	public GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

}
