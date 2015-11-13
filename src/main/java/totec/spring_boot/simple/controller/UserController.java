package totec.spring_boot.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akano_yuki on 2015/11/13.
 */
@RequestMapping("/user")
@Controller
public class UserController {

	@RequestMapping(value = "/{userId}")
	public static String userInfo(@PathVariable String userId, Model model) {
		System.out.println("---------------" + userId);
		model.addAttribute("userId", userId);
		model.addAttribute("userPublicScore", 10);
		model.addAttribute("userImage", "usfd2e1839d62dd2a9bb437b16588de0deab78057f.png");

		return "/content/user";
	}
}
