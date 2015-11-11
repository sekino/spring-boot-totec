package totec.spring_boot.simple.domain.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author akano_yuki on 2015/11/11.
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/")
	@ResponseBody
	public String top() {
		return "Hello, Spring Boot";
	}

	public static void main(String[] arg) {
		SpringApplication.run(HelloWorldController.class, arg);
	}
}
