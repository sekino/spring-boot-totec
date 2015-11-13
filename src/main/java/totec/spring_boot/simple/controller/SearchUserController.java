package totec.spring_boot.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import totec.spring_boot.simple.controller.data.ResponseUserData;
import totec.spring_boot.simple.controller.data.RootResponseUserData;
import totec.spring_boot.simple.domain.model.User;
import totec.spring_boot.simple.domain.service.FriendService;
import totec.spring_boot.simple.domain.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
@RequestMapping("/searchUser")
@RestController
public class SearchUserController {

	@Autowired
	UserService userService;
	@Autowired
	FriendService friendService;

	@RequestMapping(params = "findByUserId")
	public RootResponseUserData userInfo(@RequestParam("findByUserId") String findByUserId) {
		List<User> findUsers = userService.findByUserId(findByUserId);
		System.out.println("findUsers " + findUsers.size());

		RootResponseUserData rootResponseUserData = new RootResponseUserData();
		for (User user : findUsers) {
			List<Integer> friendNos = friendService.listFriendNo(user.getNo());
			System.out.println("friendNos " + friendNos.size());
			List<User> friends = userService.findAll(friendNos);
			System.out.println("friends " + friends.size());

			List<String> friendIds = new ArrayList<String>();
			for (User friend : friends) {
				friendIds.add(friend.getId());
			}

			ResponseUserData responseUserData
					= new ResponseUserData(user.getId(), user.getNo(), friendIds, user.getImage());
			rootResponseUserData.addData(responseUserData);
		}

		return rootResponseUserData;
	}
}
