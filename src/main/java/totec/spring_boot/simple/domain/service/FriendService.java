package totec.spring_boot.simple.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import totec.spring_boot.simple.domain.model.Friend;
import totec.spring_boot.simple.domain.repository.FriendRepository;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
@Service
public class FriendService {

	@Autowired
	FriendRepository friendRepository;

	public List<Integer> listFriendNo(int selfNo) {
		return friendRepository.listFriendNo(selfNo);
	}
}
