package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

    //get input as params and body
    @GetMapping("/hello/{name}")
    public String hello(@RequestBody(required = false) String body, @PathVariable("name") String name) {
        return "Hello " + body + " " + name;
    }

}