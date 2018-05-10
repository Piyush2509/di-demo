/**
 * 
 */
package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

/**
 * @author piyush.b.kumar
 *
 */
@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
