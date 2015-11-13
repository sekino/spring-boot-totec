package totec.spring_boot.simple.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import totec.spring_boot.simple.domain.model.UserSample;
import totec.spring_boot.simple.domain.repository.UserRepository;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserSample getUser(int userId) {
		return userRepository.getOne(userId);
	}

//	public List<UserSample> findUsers(String name, String num) {
//		return userRepository.findUsers(name, num);
//	}
}
