package learn.ggs.springboot.java.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
	
	@RequestMapping("/")
	public String Sayhello() {
		return "Hello World! @ Springboot";
	}

}
