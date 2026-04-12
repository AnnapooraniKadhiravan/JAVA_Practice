package com.wipro.HelloServiceAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //similar to the @path annotation of JAX-Rs

public class HelloController {
@GetMapping    //similar to the @Get annotation of JAX-Rs

      public String sayHello() {
	return "hello";
}
	
}
