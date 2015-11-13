package totec.spring_boot.simple.controller.data;

import totec.spring_boot.simple.domain.model.User;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
public class UserDto {

	private boolean result = true;
	private List<User> data;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}
}
