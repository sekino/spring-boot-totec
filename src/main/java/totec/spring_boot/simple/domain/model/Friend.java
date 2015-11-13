package totec.spring_boot.simple.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author akano_yuki on 2015/11/13.
 */
@Entity
public class Friend {
	@Id
	private int self;
	private int friend;

	public Friend() {
	}

	public int getSelf() {
		return self;
	}

	public void setSelf(int self) {
		this.self = self;
	}

	public int getFriend() {
		return friend;
	}

	public void setFriend(int friend) {
		this.friend = friend;
	}
}
