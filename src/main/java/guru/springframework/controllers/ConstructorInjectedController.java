/**
 * 
 */
package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * @author piyush.b.kumar
 *
 */
public class ConstructorInjectedController {
	
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}	

}
