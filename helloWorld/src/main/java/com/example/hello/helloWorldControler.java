package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldControler {
	@GetMapping(path="/")
	 public String sayHello() {
	  return "Hello!! from Java Hungry";
	}
}
