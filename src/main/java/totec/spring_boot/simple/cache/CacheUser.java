package totec.spring_boot.simple.cache;

import java.util.List;

/**
 * @author akano_yuki on 2015/11/13.
 */
public class CacheUser {

	private String userId;
	private int userNo;
	private int userPublicScore;
	private List<String> userFriendList; // ともだちのリスト
	private int friendCount; // 友達の数
	private String userImage;
}
