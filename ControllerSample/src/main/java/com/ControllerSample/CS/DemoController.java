package com.ControllerSample.CS;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class DemoController {
	@GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
    @PostMapping("/greet")
    public String greetWithName(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
    
    @GetMapping("/many")
    public String greetMany() {
    	return "Welcome,All!";
    }
}
