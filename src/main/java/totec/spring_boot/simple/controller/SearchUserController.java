package totec.spring_boot.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import totec.spring_boot.simple.controller.data.UserDto;
import totec.spring_boot.simple.domain.model.User;
import totec.spring_boot.simple.domain.model.UserSample;
import totec.spring_boot.simple.domain.repository.UserRepository;
import totec.spring_boot.simple.domain.service.UserService;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
@RequestMapping("/searchUser")
@RestController
public class SearchUserController {

	@Autowired
	UserService userService;

	@RequestMapping(params = "findByUserId")
	public UserDto userInfo(@RequestParam("findByUserId") String findByUserId) {
		List<User> byUserId = userService.findByUserId(findByUserId);
		UserDto userDto = new UserDto();
		userDto.setData(userService.findAll());

		return userDto;
	}
}
