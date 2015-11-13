package totec.spring_boot.simple.controller.data;

import totec.spring_boot.simple.domain.model.User;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
public class ResponseUserData {

	private String userId;
	private int userNo;
	private List<String> userFriends;
	private String userImage;

	public ResponseUserData(String userId, int userNo, List<String> userFriends, String userImage) {
		this.userId = userId;
		this.userNo = userNo;
		this.userFriends = userFriends;
		this.userImage = userImage;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public List<String> getUserFriends() {
		return userFriends;
	}

	public void setUserFriends(List<String> userFriends) {
		this.userFriends = userFriends;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
}
