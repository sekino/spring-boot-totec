package totec.spring_boot.simple.controller.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
public class RootResponseUserData {
	private boolean result = true;
	private List<ResponseUserData> data = new ArrayList<ResponseUserData>();

	public void addData(ResponseUserData responseUserData) {
		data.add(responseUserData);
	}
}
