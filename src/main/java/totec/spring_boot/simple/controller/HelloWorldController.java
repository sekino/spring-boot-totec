package totec.spring_boot.simple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import totec.spring_boot.simple.controller.data.Hoge;
import totec.spring_boot.simple.domain.model.UserSample;
import totec.spring_boot.simple.domain.service.UserService;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/11.
 */
@RestController
public class HelloWorldController {

//	Logger log = LoggerFactory.getLogger(HelloWorldController.class);
//
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private RedisTemplate<String, Object> redisTemplate;
//
//	@RequestMapping("/")
//	@ResponseBody
//	public String top() {
////		UserSample userSample = userService.getUser(82);
////		log.info(userSample.toString());
////
////		List<UserSample> userSamples = userService.findUsers("hagiwara_naoki", "A12694");
////		for (UserSample findUserSample : userSamples) {
////			log.info(findUserSample.toString());
////		}
//
////		redisTemplate.opsForValue().set(Integer.toString(82), userSample);
//
//		return "Hello, Spring Boot";
//	}
//
//	@RequestMapping("/tes")
//	public Hoge tes() {
//		UserSample userSample = userService.getUser(82);
//		log.info(userSample.toString());
//		Hoge hoge = new Hoge();
//		hoge.setName(userSample.getUser_name());
//		hoge.setNum(userSample.getUser_employee_number());
//		return hoge;
//	}
//
//	@RequestMapping("/get")
//	public UserSample get() {
//		UserSample userSample = (UserSample)redisTemplate.opsForValue().get("82");
//		return userSample;
//	}
}
