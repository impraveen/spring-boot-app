package io.praveen.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PSRawat
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
}
