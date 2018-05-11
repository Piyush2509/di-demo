package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

/**
 * Created by piyush.b.kumar on May 10, 2018.
 *
 */
@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello!!!");
		return greetingService.sayGreeting();
	}

}
