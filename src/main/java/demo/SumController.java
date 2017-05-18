package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * This is known as a stereotype annotation. 
 * It provides hints for people reading the code, and for Spring, that the class plays a specific role. 
 * In this case, our class is a web @Controller so Spring will consider it when handling incoming web requests.
 * The @RestController annotation tells Spring to render the resulting string directly back to the caller.
 * 
 * The @RestController and @RequestMapping annotations are Spring MVC annotations (they are not specific to Spring Boot)
 *
 */
@RestController
public class SumController {
	
	/**
	 * The @RequestMapping annotation provides “routing” information. 
	 * It is telling Spring that any HTTP request with the path “/” should be mapped to the index method.
	 */
	@RequestMapping("/sum")
	public Long sum(@RequestParam("a") Long a, @RequestParam("b") Long b) {
		return (a+b);
	}


}
