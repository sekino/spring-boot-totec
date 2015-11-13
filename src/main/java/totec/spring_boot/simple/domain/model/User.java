package totec.spring_boot.simple.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author akano_yuki on 2015/11/13.
 */
@Entity
@Table(name = "user")
public class User {
	@Id
	private String userId;
	private int userNo;
	private int userPublicScore;
	private String userFriends; // ,区切りのユーザID
	private String userImage;

	public User() {
	}

	public String getUserId() {
		return userId;
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

	public int getUserPublicScore() {
		return userPublicScore;
	}

	public void setUserPublicScore(int userPublicScore) {
		this.userPublicScore = userPublicScore;
	}

	public String getUserFriends() {
		return userFriends;
	}

	public void setUserFriends(String userFriends) {
		this.userFriends = userFriends;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
}
